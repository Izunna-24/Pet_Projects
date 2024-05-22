package serialization;

import com.fasterxml.jackson.annotation.JsonInclude;


public class AccountSummary {
    private String name;
    private double balance;
    private int transactionCount;

    public AccountSummary(String name, double balance, int transactionCount) {
        this.name = name;
        this.balance = balance;
        this.transactionCount = transactionCount;
    }

    public String toString(){
        return "Account Summary --> { name: " + name + "," +
                "balance: " + balance + "," +
                "transactionCount: " + transactionCount + "}";
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getTransactionCount() {
        return transactionCount;
    }

    public void setTransactionCount(int transactionCount) {
        this.transactionCount = transactionCount;
    }
}
