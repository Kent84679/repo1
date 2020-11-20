package com.zy.dao;

import com.zy.bean.Book;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BookDao {
/*
*  private Integer id;
    private String book_num;
    private String book_name;
    private Double book_price;
    private Date open_date;
    private Integer writer_id;
    private Writer writer;
* */
    @Select("select * from book")
    @Results(id = "bookMap",value = {
            @Result(id = true,column = "id",property = "id"),
            @Result(column = "book_num",property = "book_num"),
            @Result(column = "book_name",property = "book_name"),
            @Result(column = "book_price",property = "book_price"),
            @Result(column = "open_date",property = "open_date"),
            @Result(column = "writer_id",property = "writer_id"),
            @Result(column = "writer_id",property = "writer",one = @One(
                    select = "com.zy.dao.WriterDao.findById",fetchType = FetchType.EAGER
            )),
            @Result(column = "id",property = "presses",many = @Many(
                    select = "com.zy.dao.PressDao.findByBookId",fetchType = FetchType.EAGER
            ))


    })
    public List<Book> findAll();

    /*增删改查*/
    @Select("select * from book where id=#{id}")
    public Book findById(Integer id);

    @Insert("insert into book(id,book_name,book_price,book_num,open_date,writer_id) values(#{id},#{book_name},#{book_price},#{book_num},#{open_date},#{writer_id})  ")
    public void addBook(Book book);

    @Delete("delete from book where id=#{id}")
    public void removeBook(Integer id);

    @Update("update book set book_name=#{book_name},book_price=#{book_price},book_num=#{book_num},open_date=#{open_date},writer_id=#{writer_id} where id=#{id}")
    public void updateBook(Book book);

    @Select("select * from book where writer_id=#{writer_id}")
    public List<Book> findByWriterId(Integer writer_id);


}
