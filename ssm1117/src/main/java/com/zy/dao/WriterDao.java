package com.zy.dao;

import com.zy.bean.Writer;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WriterDao {

    @Select("select * from writer where id=#{id}")
    public Writer findById(Integer id);

    @Select("select * from writer")
    @Results(id = "writerMap",value = {
            @Result(id=true,property = "id",column = "id"),
            @Result(property = "writer_name",column = "writer_name"),
            @Result(property = "writer_age",column = "writer_age"),
            @Result(property = "books",column = "id", many = @Many(
                    select ="com.zy.dao.BookDao.findByWriterId",fetchType = FetchType.LAZY))
    })
    public List<Writer> findAll();
}
