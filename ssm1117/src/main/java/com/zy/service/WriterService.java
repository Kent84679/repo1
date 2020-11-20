package com.zy.service;

import com.zy.bean.Writer;

import java.util.List;

public interface WriterService {
    public Writer findById(Integer id);
    public List<Writer> findAll();
}
