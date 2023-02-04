package org.telran.bookshop.com.service;

import org.springframework.stereotype.Service;
import org.telran.bookshop.com.model.PaymentOption;
@Service
public class CashPaymentServiceImpl implements PaymentService{
    @Override
    public void pay() {
        System.out.println("Paid with Cash");
    }

    @Override
    public boolean isSuitable(PaymentOption option) {
        return PaymentOption.CASH == option;
    }


}
