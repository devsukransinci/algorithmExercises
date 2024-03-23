package org.example;

public class Main {
    public static void main(String[] args) {
        BankAccount ali =new BankAccount("Ali");
        ali.deposit(500.0);
        BankAccount ayse = new BankAccount("Ayse");
        ayse.deposit(200.0);
        ali.transfer(100.0,ayse);
        ayse.withdraw(50.0);
        ayse.withdraw(600.0);
        System.out.println(ayse.getBalance());
    }
}