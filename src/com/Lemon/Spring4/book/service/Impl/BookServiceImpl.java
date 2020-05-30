package com.Lemon.Spring4.book.service.Impl;

import com.Lemon.Spring4.book.dao.BookDao;
import com.Lemon.Spring4.book.exception.MyException;
import com.Lemon.Spring4.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao dao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {NullPointerException.class, MyException.class})
    public void buyBook(String bid, String uid) {

        Integer price = dao.selectPrice(bid);

        dao.updateSt(bid);

        dao.updateBalance(uid, price);
    }
}
