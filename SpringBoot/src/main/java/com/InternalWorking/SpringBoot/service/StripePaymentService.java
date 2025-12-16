package com.InternalWorking.SpringBoot.service;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
//@ConditionalOnProperty(name = "payment.provider", havingValue = "stripe")
public class StripePaymentService implements  PaymentService{
    @Override
    public String pay(){
        String payment = " Stripe Payment";
        System.out.println("Stripe");
        return payment;
    }

    @Bean(name = "StripeSuccessfulMessage")
    public String Message() {
        return "Stripe payment successfully DONE";
    }
}
