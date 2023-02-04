package org.telran.bookshop.com.service;

import org.telran.bookshop.com.model.PaymentOption;

public class CreditPaymentService implements PaymentService{

    @Override
    public void pay() {

    }

    @Override
    public boolean isSuitable(PaymentOption option) {
        return PaymentOption.CREDIT == option;
    }
}
