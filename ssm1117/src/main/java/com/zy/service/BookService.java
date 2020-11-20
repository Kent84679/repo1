package com.zy.service;

import com.zy.bean.Book;

import java.util.List;

public interface BookService {

    public List<Book> findAll();

    public Book findById(Integer id);
    public void addBook(Book book);
    public void removeBook(Integer id);
    public void updateBook(Book book);
    public List<Book> findByWriterId(Integer writer_id);
}
