package com.company.Multitrade;

public class Example12 {

  public static final Object lock = new Object();


    void callMobile() {
        synchronized (lock) {
            System.out.println("Mobile call start");
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Mobile call Stop");
        }
    }


    void callSkype() {
        synchronized (lock) {
            System.out.println("Skype call start");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Skype call Stop");
        }
    }


    void callWhatsApp() {
            synchronized (lock) {
                System.out.println("WhatsApp call start");
                try {
                    Thread.sleep(6000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("WhatsApp call Stop");
            }
        }

}

class CallTest {
    public static void main(String[] args) {
        Thread threadMobile = new Thread(new MobileCall());
        Thread threadSkype = new Thread(new SkypeCall());
        Thread threadWhatsApp = new Thread(new WhatsAppCall());

        threadMobile.setPriority(10);
        threadSkype.setPriority(7);
        threadWhatsApp.setPriority(1);

        threadMobile.start();
        threadSkype.start();
        threadWhatsApp.start();
    }
}

class MobileCall implements Runnable {

    @Override
    public void run() {
       new Example12().callMobile();
    }
}

class SkypeCall implements Runnable {

    @Override
    public void run() {
        new Example12().callSkype();
    }
}

class WhatsAppCall implements Runnable {

    @Override
    public void run() {
        new Example12().callWhatsApp();
    }
}
