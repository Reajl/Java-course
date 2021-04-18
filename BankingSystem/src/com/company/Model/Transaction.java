package com.company.Model;

public class Transaction {
    public int id;

    public Transaction() {
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "countTransaction=" + id +
                " }" ;
    }

    public void doTransaction(BankAccount from, BankAccount to, int nextInt) {
        final long TIME_START = System.currentTimeMillis();
        int elapsedTime;
        try {
            System.out.println("Transaction created from the bank account № " + from.numberOfBankAccount +
                    " to № " + to.numberOfBankAccount);
            int balanceBeforeTransaction = from.getBalance();
            int balanceBeforeTransaction2 = to.getBalance();

            from.withdraw(nextInt);
            to.deposit(nextInt);

            id++;
            elapsedTime = (int) (System.currentTimeMillis() - TIME_START);
            System.out.println("Transaction: " + id + " (" +
                    from.accountName + " to " + to.accountName + ")" + " finished from the bank account № " +
                    from.numberOfBankAccount + "[" + balanceBeforeTransaction + "]"
                    + " to № " + to.numberOfBankAccount + "[" + balanceBeforeTransaction2 + "]" + " for: " + nextInt +
                    ", balance after transaction: " +
                    from.getBalance() + " / " + to.getBalance() + ", " + "Elapsed time:" + elapsedTime +
                    "ms (" + Thread.currentThread().getName() + ")");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
