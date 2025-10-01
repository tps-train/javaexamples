package com.simple.test;

import com.simple.account.BankAccount;
//import com.simple.account.PrivateAccount;

public class BankAccountTester {
    public static void main(String [] args){

        BankAccount.setInterestRate(5.5f);
        System.out.println("Intereset rate is "+BankAccount.getInterestRate());
        BankAccount account;

        if ( args.length > 0 ) {
            account = new BankAccount(1, args[0], 100f);
        } else {
            account = new BankAccount(1, "Jeff Lebowski", 100f);
        }


        account.deposit(50f);

        System.out.println("A Bank Account 1");
        System.out.println("ID: " + account.getAccountID());
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Owner: " + account.getOwnerName());

        BankAccount account2 = new BankAccount();
        account2.setAccountID(2);
        account2.setOwnerName("Bunny Lebowski");
        account2.setBalance(5000f);
        account2.setInterestRate(5.6f);

        System.out.println("A Bank Account 2");
        System.out.println("ID: " + account2.getAccountID());
        System.out.println("Balance: " + account2.getBalance());
        System.out.println("Owner: " + account2.getOwnerName());

        BankAccount account3 = new BankAccount(3, "Walter Sobcheck", 1000000f);

        System.out.println("account2's interestRate is " + account2.getInterestRate());
        System.out.println("account3's interestRate is " + account3.getInterestRate());
        account2.setAccountRanking(10.0);
        account3.setAccountRanking(20.0);
        System.out.println(account2.getOwnerName() + " has rating of " + account2.getAccountRanking());
        System.out.println(account3.getOwnerName() + " has rating of " + account3.getAccountRanking());

//        PrivateAccount accountRanking = new PrivateAccount("Steve"); // This will fail as it is protected in the com.simple.account package
//        accountRanking.getAccountName();

        BasicClass steve = new BasicClass();
        steve.setUsername("Steve");
        steve.setAge(21);
        System.out.println(steve.getUsername());
        System.out.println(steve instanceof BasicClass);

    }
}
