package com.company;

public class Main {

    public static void main(String[] args) {
        SavingsAccount sa0001 = new SavingsAccount("Ivan", 10000.0);
        double getCash1 = 234.5;
        double getCash2 = 13234.5;
        sa0001.withdraw(getCash1);
        sa0001.withdraw(getCash2);
        sa0001.withdraw(-getCash1);
    }
}
