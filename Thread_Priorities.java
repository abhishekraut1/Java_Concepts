package com.company;

class Thr1 extends Thread{
    Thr1(String str){
        super(str);
    }
    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            System.out.println("Thread Name is "+this.getName());
        }
    }
}

class Thr2 extends Thread {
    Thr2(String str) {
        super(str);
    }

    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            System.out.println("Thread Name is "+this.getName());
        }
    }
}

class Thr3 extends Thread {
    Thr3(String str) {
        super(str);
    }

    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            System.out.println("Thread Name is "+this.getName());
        }
    }
}

public class Thread_Priorities {
    public static void main(String[] args) {
        Thr1 t1 = new Thr1("Abhi 111111");
        Thr1 t2 = new Thr1("Govinda 222222");
        Thr1 t3 = new Thr1("Raut 333333");

        //Thread Priorities
        t1.setPriority(Thread.MAX_PRIORITY); // = 10
        t2.setPriority(Thread.NORM_PRIORITY); // = 5
        t3.setPriority(Thread.MIN_PRIORITY); // = 1

        t1.start();
        t2.start();
        t3.start();
        System.out.println(t1.getPriority());

        System.out.println(Thread.currentThread().getState()); //get the reference of the current thread
    }
}
