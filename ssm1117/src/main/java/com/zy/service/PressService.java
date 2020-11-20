package com.zy.service;

import com.zy.bean.Press;

import java.util.List;

public interface PressService {
    public List<Press> findByBookId(Integer book_id);
}
