package com.bkitsolution;

public class ReversiblePayment implements PaymentIntf {
    private final PaymentIntf payment;

    public ReversiblePayment(PaymentIntf payment) {
        this.payment = payment;
    }

    @Override
    public void execute() {
        payment.execute();
    }

    @Override
    public void setValue(int value) {
        payment.setValue(value);
    }

    @Override
    public int getValue() {
        return payment.getValue();
    }

    public void reverse() {
        setValue(-getValue());
        execute();
    }
}
