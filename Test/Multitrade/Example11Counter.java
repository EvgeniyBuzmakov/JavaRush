package com.company.Multitrade;

public class Example11Counter {

    static int counter = 0;

    static synchronized void increment() {
        for (int i = 0; i < 100000; i++) {
            counter++;
        }
     //   System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) throws InterruptedException {
      //  R r = new R();
        Thread thread1 = new Thread(new R());
        Thread thread2 = new Thread(new R());
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println(counter);
    }
}

class R implements Runnable{

    @Override
    public void run() {
       Example11Counter.increment();
    }
}
