package com.extrak.objects;

import java.util.Date;

public class Expense {
    private Date date;
    private String description;
    private Float amount;
    private Float total;

    private Expense(){}

    private Expense(String description, Float amount, Float total){
        this.description=description;
        this.amount=amount;
        this.total=total;
    }

    private Expense(Date date, String description, Float amount, Float total){
        this.date=date;
        this.description=description;
        this.amount=amount;
        this.total=total;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }
}
