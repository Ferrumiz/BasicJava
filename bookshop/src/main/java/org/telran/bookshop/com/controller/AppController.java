package org.telran.bookshop.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.telran.bookshop.com.model.PaymentOption;
import org.telran.bookshop.com.service.CashPaymentServiceImpl;
import org.telran.bookshop.com.service.PaymentService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
public class AppController {

//    @Autowired(required = false)
//    private List<PaymentService> paymentServiceList= new ArrayList<>();

    private List<PaymentService> paymentServiceList = new ArrayList<>();

    public void start() {
        System.out.println("Start controller");
        init();
        makePayment(PaymentOption.BANK);
    }

    private void init() {
        paymentServiceList.add(new CashPaymentServiceImpl());
    }


    private void makePayment(PaymentOption paymentOption){
        paymentServiceList.forEach(paymentService -> {
            if(paymentService.isSuitable(paymentOption)){
                paymentService.pay();
            }
        });
    }

    private void createBooks() {

    }
}
