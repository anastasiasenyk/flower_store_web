package com.example.demo.clientserver.payments;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class CreditCardPaymentStrategy implements Payment{
    private int paid;

    public CreditCardPaymentStrategy(int payment){
        paid = payment;
    }

    public CreditCardPaymentStrategy(){
        paid = 0;
    }

    public void setPaid(int payment){
        paid += payment;
    }
}
