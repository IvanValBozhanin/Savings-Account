package com.company;

public class SavingsAccount {
    private String name;
    private double balance;

    public SavingsAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void deposit(int x){
        setBalance(x + getBalance());
    }

    public void withdraw(double x){
        if(x < 0){
            System.out.println("Negative withdraw!");
        }
        else if(x > getBalance()){
            System.out.println("Too low balance to make a withdraw!");
        }
        else{
            setBalance(getBalance() - x);
            System.out.println("New balance: " + getBalance());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
