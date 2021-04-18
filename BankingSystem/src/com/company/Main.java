package com.company;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws Exception {
        // setup of the number of threads
        ExecutorService service = Executors.newFixedThreadPool(10);
        Bank runBank = new Bank();
        // setup of the number of transactions
        for (int i = 0; i <= 100; i++) {
            service.submit(runBank);
        }
        service.shutdown();
        service.awaitTermination(1, TimeUnit.DAYS);
    }
}
