package com.example.demo.clientserver.payments;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PayPalPaymentStrategy implements Payment {
    private int paid;

    public PayPalPaymentStrategy(int payment){
        paid = payment;
    }

    public PayPalPaymentStrategy(){
        paid = 0;
    }

    public void setPaid(int payment){
        paid += payment;
    }
}
