package com.company.Model;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount extends Account {

    public int balance;
    public int numberOfBankAccount;
    final Lock lock1 = new ReentrantLock();

    public BankAccount(String accountName, int balance, int numberOfBankAccount) {
        super(accountName);
        this.balance = balance;
        this.numberOfBankAccount = numberOfBankAccount;
    }


    public void withdraw(int amount) throws Exception {
        synchronized (lock1) {
            int balanceException = getBalance() - amount;
            if (balanceException <= 0) {
                throw new Exception("Transaction error: Not enough money for transfer, bank account №" + numberOfBankAccount + ", not enough: " + balanceException);
            }
            this.balance = getBalance() - amount;
        }
    }

    public void deposit(int amount) {
        synchronized (lock1) {
            this.balance = getBalance() + amount;
        }
    }


    public int getBalance() {
        synchronized (lock1) {
            return this.balance;
        }
    }

}
