package com.InternalWorking.SpringBoot.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentSuccessFul {
    private RazorPayService razorPayService;
    private StripePaymentService stripePaymentService;
    private PaymentService paymentService;

    public PaymentSuccessFul(RazorPayService razorPayService, StripePaymentService stripePaymentService, PaymentService paymentService) {
        this.razorPayService = razorPayService;
        this.stripePaymentService = stripePaymentService;
        this.paymentService = paymentService;
    }

    public String printMessageOnPaymentSuccess(){


        return null;
    }




}
