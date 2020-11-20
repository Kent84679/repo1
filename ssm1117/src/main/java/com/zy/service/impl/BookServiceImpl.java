package com.zy.service.impl;

import com.zy.bean.Book;
import com.zy.dao.BookDao;
import com.zy.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("bookService")
public class BookServiceImpl implements BookService{

    @Autowired
    private BookDao bookDao;
    @Override
    public List<Book> findAll() {
        return bookDao.findAll();
    }

    @Override
    public Book findById(Integer id) {
        return bookDao.findById(id);
    }

    @Override
    public void addBook(Book book) {
        bookDao.addBook(book);
    }

    @Override
    public void removeBook(Integer id) {
        bookDao.removeBook(id);
    }

    @Override
    public void updateBook(Book book) {
        bookDao.updateBook(book);
    }

    @Override
    public List<Book> findByWriterId(Integer writer_id) {
        return bookDao.findByWriterId(writer_id);
    }
}
