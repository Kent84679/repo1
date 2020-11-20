package com.zy.service.impl;

import com.zy.bean.Press;
import com.zy.dao.PressDao;
import com.zy.service.PressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("pressService")
public class PressServiceImpl implements PressService {
    @Autowired
    private PressDao pressDao;

    @Override
    public List<Press> findByBookId(Integer book_id) {
        return pressDao.findByBookId(book_id);
    }
}
