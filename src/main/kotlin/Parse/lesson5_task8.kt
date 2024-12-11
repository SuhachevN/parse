package org.example.Parse

import org.jsoup.Jsoup
import org.jsoup.nodes.Document

fun main() {
    val doc: Document = Jsoup.connect("https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/").get()

    val quotes = doc.select(".bzpNIu")

    if (quotes.isNotEmpty()) {
        println("Найдено ${quotes.size} цитат:\n")


        for ((index, quote) in quotes.withIndex()) {
            val text = quote.text().trim()
            val url = quote.absUrl("href")

            println("Цитата ${index + 1}:")
            println("  \"$text\"")
            if (url.isNotEmpty()) {
                println("  Ссылка: $url")
            }
            println(".".repeat(50))
        }
    } else {
        println("Цитаты не найдены на странице.")
    }
}