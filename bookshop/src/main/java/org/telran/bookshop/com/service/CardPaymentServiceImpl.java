package org.telran.bookshop.com.service;

import org.springframework.stereotype.Service;
import org.telran.bookshop.com.model.PaymentOption;
@Service
public class CardPaymentServiceImpl implements PaymentService{
    @Override
    public void pay() {
        System.out.println("Paid with Card");
    }

    @Override
    public boolean isSuitable(PaymentOption option) {
        return PaymentOption.CARD == option;
    }

}
