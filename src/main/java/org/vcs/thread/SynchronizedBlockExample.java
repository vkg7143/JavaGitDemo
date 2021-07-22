package org.vcs.thread;

public class SynchronizedBlockExample implements Runnable {
    private int c;

    @Override

    public void run() {
        for (int i = 1; i < 1000; i++){
            c++;

    }

        System.out.println(c);
    }

    public static void main(String[] args) throws InterruptedException {
        SynchronizedBlockExample t1=new SynchronizedBlockExample();
        SynchronizedBlockExample t2=new SynchronizedBlockExample();
        Thread tt1=new Thread(t1);
        Thread tt2=new Thread(t2);
        tt1.start();
        tt1.join();
        tt2.start();
        tt2.join();
    }
}
