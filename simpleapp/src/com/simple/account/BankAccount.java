package com.simple.account;

public class BankAccount {
    private int accountID;
    private String ownerName;
    private float balance;
    private static float interestRate;
    private PrivateAccount accountRanking = new PrivateAccount();

    public BankAccount() {

    }

    public BankAccount(int accountID, String ownerName, float balance) {
        super();
        this.accountID = accountID;
        this.ownerName = ownerName;
        setBalance(balance);
        this.accountRanking.setAccountName(ownerName);
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int newID) {
        this.accountID = newID;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        if ( balance > 0f ) {
            this.balance = balance;
        } else {
            System.out.println("Error. Balance cannot be negative");
        }
    }

    public double getAccountRanking() {
        return this.accountRanking.getRating();
    }

    public void setAccountRanking(double accountRanking) {
        this.accountRanking.setRating(accountRanking);
    }

    public void deposit(float amount) {
        balance = balance + amount;
    }

    public static float getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(float interestRate) {
        BankAccount.interestRate = interestRate;
    }
}
