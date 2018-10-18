package com.squarepegsystems;

import org.joda.beans.Bean;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.ser.JodaBeanSer;

import java.time.LocalDate;
import java.util.Iterator;

public class Bookshelf {

    public static void  main(String[] args) {


        Author author = new Author();
        author.setLastName("Stephenson");
        author.setFirstName("Neal");


        LocalDate pubDate =LocalDate.of( 1992,6,1);

        Book book = Book.builder()
                .title("Snow Crash")
                .author(author)
                .publishedDate(pubDate)
                .build();

        Magazine magazine = new Magazine();
        magazine.setTitle("Dr Dobbs");

        MetaProperty<String> titleProperty = book.metaBean().metaProperty("title");

        System.out.println("titleProperty.get(magazine) = " + titleProperty.get(magazine));

        for (Iterator<Bean> it = JodaBeanUtils.beanIterator(book); it.hasNext(); ) {
            Bean bean = it.next();

            System.out.println("bean = " + bean);

            if (bean.metaBean().metaPropertyExists("title")) {
                System.out.println("titleProperty.get(book) = " + titleProperty.get(book));
            }



        }

        String json = JodaBeanSer.PRETTY.jsonWriter().write(book);

        System.out.println("json = " + json);
    }
}
