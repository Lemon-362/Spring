package com.Lemon.Spring4.book.service.Impl;

import com.Lemon.Spring4.book.service.BookService;
import com.Lemon.Spring4.book.service.Cashier;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CashierServiceImpl implements Cashier {

    @Autowired
    private BookService service;

    @Override
    public void checkOut(String uid, List<String> bids) {

        for (String bid : bids) {
            service.buyBook(bid, uid);
        }

    }
}
