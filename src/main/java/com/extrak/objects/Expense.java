package com.extrak.objects;

import java.util.Date;

public class Expense {
    private Date date;
    private String description;
    private Double amount;
    private Double total;

    public Expense(){}

    public Expense(String description, Double amount){
        this.description=description;
        this.amount=amount;
    }

    public Expense(String description, Double amount, Double total){
        this.description=description;
        this.amount=amount;
        this.total=total;
    }

    public Expense(Date date, String description, Double amount, Double total){
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

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
