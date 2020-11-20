package com.zy.dao;

import com.zy.bean.Press;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PressDao {

    @Select("select p.id,p.press_name,p.press_address from press p,press_book pb where p.id=pb.press_id and pb.book_id=#{book_id}")
    public List<Press> findByBookId(Integer book_id);
}
