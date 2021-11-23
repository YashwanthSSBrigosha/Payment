package com.example.payment;

public class Payment {
    private String title,amount,dataTime,refundStatus;

    public String getTitle() {
        return title;
    }

    public String getAmount() {
        return amount;
    }

    public String getDataTime() {
        return dataTime;
    }

    public String getRefundStatus() {
        return refundStatus;
    }

    public Payment(String title, String amount, String dataTime, String refundStatus) {
        this.title = title;
        this.amount = amount;
        this.dataTime = dataTime;
        this.refundStatus = refundStatus;
    }
}
