package com.InternalWorking.SpringBoot.service;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component //This annotation helps to initialise the class as a Bean during Component scan
//@ConditionalOnProperty(name = "payment.provider", havingValue = "razorPay")
public class RazorPayService implements PaymentService {


    public String pay(){
        String payment = " Razorpay Payment";
        System.out.println("RazorPay");
        return payment;
    }

    @Bean(name = "RazorpaySuccessfulMessage")
    public String Message() {
        return "Razorpay payment successfully DONE";
    }
}
