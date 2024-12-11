package org.example

import org.jsoup.Jsoup
import org.jsoup.nodes.Document

fun main() {

    val doc: Document = Jsoup.connect("https://en.wikipedia.org").get()
    println(doc.title())

    // #Welcome_to_Wikipedia
    // .MainPageBG
    // a

    doc.select("#mp-itn b a")
}


// Document doc = Jsoup.connect("https://en.wikipedia.org/").get();
// log(doc.title());
// Elements newsHeadlines = doc.select("#mp-itn b a");
// for (Element headline : newsHeadlines) {
// log("%s\n\t%s",
// headline.attr("title"), headline.absUrl("href"));
// }/