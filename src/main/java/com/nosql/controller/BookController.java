package com.nosql.controller;

import com.nosql.entity.Book;
import com.nosql.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/createbook")
    public Book createBook(@RequestParam String title, @RequestParam double price, @RequestParam String authorName) {
        return bookService.createBook(title, price, authorName);
    }

    @GetMapping("/getBookAuthor/{title}")
    public String getBookAuthor(@PathVariable String title) {
        Book book = bookService.getBookByTitle(title);
        if (book != null) {
            return "Author: " + book.getAuthor().getName();
        } else {
            return "Book not found!";
        }
    }
}
