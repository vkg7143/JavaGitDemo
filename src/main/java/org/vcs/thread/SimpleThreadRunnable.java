package org.vcs.thread;

public class SimpleThreadRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        SimpleThreadRunnable t1=new SimpleThreadRunnable();
        Thread thread=new Thread(t1);
        thread.start();
    }
}
