package com.zy.controller;

import com.zy.bean.Book;
import com.zy.bean.Writer;
import com.zy.service.WriterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/writer")
@Controller
public class WriterController {
    @Autowired
    private WriterService writerService;


    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<Writer> list = writerService.findAll();
        for (Writer writer:list ) {
            System.out.println(writer);
            List<Book> books = writer.getBooks();
            for (Book book:books ) {
                System.out.println(book);
            }

            System.out.println("\n\n");
        }
        return "writerList";
    }

}
