package com.Lemon.Spring4.book.service;

import java.util.List;

public interface Cashier {

    // 结账
    void checkOut(String uid, List<String> bids);

}
