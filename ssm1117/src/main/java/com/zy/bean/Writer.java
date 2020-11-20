package com.zy.bean;

import java.io.Serializable;
import java.util.List;

public class Writer implements Serializable{
    private Integer id;
    private String writer_name;
    private String writer_age;
    private List<Book> books;


    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Writer{" +
                "id=" + id +
                ", writer_name='" + writer_name + '\'' +
                ", writer_age='" + writer_age + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWriter_name() {
        return writer_name;
    }

    public void setWriter_name(String writer_name) {
        this.writer_name = writer_name;
    }

    public String getWriter_age() {
        return writer_age;
    }

    public void setWriter_age(String writer_age) {
        this.writer_age = writer_age;
    }
}
