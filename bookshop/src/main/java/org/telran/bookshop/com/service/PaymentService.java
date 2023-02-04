package org.telran.bookshop.com.service;

import org.telran.bookshop.com.model.PaymentOption;

public interface PaymentService {

    void pay();

    boolean isSuitable(PaymentOption option);

}
