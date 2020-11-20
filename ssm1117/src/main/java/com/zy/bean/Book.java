package com.zy.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Book implements Serializable{
    private Integer id;
    private String book_num;
    private String book_name;
    private Double book_price;
    private Date open_date;
    private Integer writer_id;
    private Writer writer;
    private List<Press> presses;

    public List<Press> getPresses() {
        return presses;
    }

    public void setPresses(List<Press> presses) {
        this.presses = presses;
    }

    public Writer getWriter() {
        return writer;
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", book_num='" + book_num + '\'' +
                ", book_name='" + book_name + '\'' +
                ", book_price=" + book_price +
                ", open_date=" + open_date +
                ", writer_id=" + writer_id +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBook_num() {
        return book_num;
    }

    public void setBook_num(String book_num) {
        this.book_num = book_num;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public Double getBook_price() {
        return book_price;
    }

    public void setBook_price(Double book_price) {
        this.book_price = book_price;
    }

    public Date getOpen_date() {
        return open_date;
    }

    public void setOpen_date(Date open_date) {
        this.open_date = open_date;
    }

    public Integer getWriter_id() {
        return writer_id;
    }

    public void setWriter_id(Integer writer_id) {
        this.writer_id = writer_id;
    }
}
