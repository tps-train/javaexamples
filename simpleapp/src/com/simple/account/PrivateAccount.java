package com.simple.account;

public class PrivateAccount {
    private String accountName;
    private double rating;

    protected PrivateAccount() {

    }

    protected PrivateAccount(String accountName) {
        this.accountName = accountName;
        this.rating=0.0;
    }

    protected String getAccountName() {

        return accountName;
    }

    protected void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    protected double getRating() {
        return rating;
    }

    protected void setRating(double rating) {
        this.rating = rating;
    }
}
