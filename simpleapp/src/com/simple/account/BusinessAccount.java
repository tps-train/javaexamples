package com.simple.account;

public class BusinessAccount extends BankAccount {
    private String companyno;
    private float overdraft;
    private static float commission;

    public BusinessAccount() {
        super();
    }

    public BusinessAccount(int accountID, String ownerName, float balance, String companyno) {
        super(accountID, ownerName, balance);
        this.companyno = companyno;
        this.overdraft = 1000.00f;
    }

    public static void setCommission(float amount) {
        commission = amount;
    }

    @Override
    public void setBalance(float balance) {
        if ( balance > overdraft ) {
            super.setBalance(balance);
        } else if ( (overdraft + this.getBalance()) > 0 ) {
            super.setBalance(balance);
        } else {
            System.out.println("Error. Balance cannot be less than overdraft");
        }
    }

    @Override
    public String toString(){
        return "Company name: "+this.getOwnerName()+" - Company No: "+this.companyno;
    }
}
