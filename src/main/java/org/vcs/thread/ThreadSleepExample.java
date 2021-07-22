package org.vcs.thread;

public class ThreadSleepExample extends Thread {
    public static void main(String[] args) throws InterruptedException {
        ThreadSleepExample t1=new ThreadSleepExample();
        ThreadSleepExample t2=new ThreadSleepExample();
        ThreadSleepExample t3=new ThreadSleepExample();
        t1.start();
        t1.setPriority(10);
        System.out.println("Thread Name="+t1.getName());
        t2.start();
        t3.start();
    }

    @Override
    public void run() {
        for(int i=1;i<5;i++){
            try
            {
            Thread.sleep(500);
            System.out.println(i);
        }
            catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
