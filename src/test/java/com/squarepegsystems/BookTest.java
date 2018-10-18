package com.squarepegsystems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    public void testBook() {

        Author author = new Author();
        author.setLastName("Stephenson");
        author.setFirstName("Neal");

        Book book = Book.builder()
                .title("Snow Crash")
                .author(author)
                .build();


        assertEquals(author,book.getAuthor());


    }

}