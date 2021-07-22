package org.vcs.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WorkerThreadExample implements Runnable {
   private String message;
   public WorkerThreadExample(String s)
   {this.message=s; }

    @Override
    public void run() {
        System.out.println("Thread1" +Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread2"+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            Runnable r = new WorkerThreadExample(" "+i);
            executorService.execute(r);
            while (!executorService.isTerminated()) {
            }
        }
            System.out.println("Finished all threads");
        }
    }

