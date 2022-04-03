package com.company;

class NewThr1 extends Thread{
    @Override
    public void run() {
        while (true) {
            System.out.println("Thread Name is good");
            try {
                Thread.sleep(1000);  ///It means that : this thread will delay for 10000 mili seconds for execution
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class NewThr2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 20000; i++) {
            System.out.println("Thread Name is bad");
        }
    }
}

public class Thread_Methods {
    public static void main(String[] args) {
        NewThr1 t1 = new NewThr1();
        NewThr2 t2 = new NewThr2();

//        System.out.println(t1.getState()); --> NEW
        t1.start();

//        System.out.println(t1.getState()); --> RUNNABLE
        try {
            t1.join(); //It means that : Firstly execute t1 completely then run t2.
        }
        catch (Exception e){
            System.out.println(e);
        }
        t2.start();
    }
}



