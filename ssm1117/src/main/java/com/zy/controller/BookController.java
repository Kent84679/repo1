package com.zy.controller;

import com.zy.bean.Book;
import com.zy.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RequestMapping("/book")
@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<Book> list = bookService.findAll();
        for (Book book:list) {
            System.out.println(book);
            System.out.println(book.getWriter());
            System.out.println(book.getPresses());

        }
        model.addAttribute("list",list);
        return "list";
    }



    @RequestMapping("/findById")
    public String findById(Model model){
        Book book = bookService.findById(1);
        List list=new ArrayList<Book>();
        list.add(book);
        model.addAttribute("list",list);
        return "list";
    }

    @RequestMapping("/removeBook")
    public String removeBook(Model model){
        bookService.removeBook(5);
        List<Book> list = bookService.findAll();
        model.addAttribute("list",list);
        return "list";

    }

    @RequestMapping("/addBook")
    public String addBook(Model model) throws ParseException {
        Book book = new Book();
        book.setId(5);
        book.setBook_name("九阴真经");
        book.setBook_num("005");
        book.setBook_price(22.3);
        book.setWriter_id(1);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
        Date date=simpleDateFormat.parse("2020/11/11 11:11:11");
        book.setOpen_date(date);
        bookService.addBook(book);

        List<Book> list = bookService.findAll();
        model.addAttribute("list",list);
        return "list";
    }

    @RequestMapping("/updateBook")
    public String updateBook(Model model) throws ParseException {
        Book book = new Book();
        book.setId(5);
        book.setBook_name("九九阴真经");
        book.setBook_num("005");
        book.setBook_price(255.3);
        book.setWriter_id(2);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
        Date date=simpleDateFormat.parse("2011/11/11 11:11:11");
        book.setOpen_date(date);
        bookService.updateBook(book);

        List<Book> list = bookService.findAll();
        model.addAttribute("list",list);
        return "list";
    }

    /*
    MultipartFile upload 中upload必须与表单中name一致

    */
    public void uploadImage(MultipartFile upload, HttpServletRequest request) throws IOException {
        InputStream in = upload.getInputStream();
    }



}
