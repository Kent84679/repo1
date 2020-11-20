package com.zy.service.impl;

import com.zy.bean.Writer;
import com.zy.dao.WriterDao;
import com.zy.service.WriterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("writerService")
public class WriterServiceImpl implements WriterService {

    @Autowired
    private WriterDao writerDao;

    public Writer findById(Integer id) {
        return writerDao.findById(id);
    }

    @Override
    public List<Writer> findAll() {
        return writerDao.findAll();
    }
}
