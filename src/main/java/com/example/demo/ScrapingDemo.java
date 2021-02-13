package com.example.demo;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class ScrapingDemo {

    public static void main(String[] args) throws IOException {
        Document document = Jsoup.connect("http://archaeology.jp/learning/university/2018kougiichiran/#").get();
        Elements courses = document.select("tbody");
        for (Element headline : courses) {
            System.out.println(headline.text());
        }
    }
}
