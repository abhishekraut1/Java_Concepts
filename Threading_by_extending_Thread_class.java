package com.company;

class MyThread1 extends Thread {
    MyThread1(String str){
        super(str);
    }
    @Override
    public void run() {
        for (int i = 0; i < 20000; i++) {
            System.out.println("MyThread1111");
        }
    }
}
class MyThread2 extends Thread{
    MyThread2(String str){
        super(str);
    }
        @Override
        public void run() {
            for(int i=0;i<20000;i++){
        System.out.println("MyThread2222");
    }
    }
}
public class Threading_by_extending_Thread_class {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1("Abhi"); // 1) Constructor with Name of thread
        MyThread2 t2 = new MyThread2("Raut");
        t1.start();
        t2.start();

        System.out.println(t1.getName()); // 2) Method
        System.out.println(t1.getId()); // 2) Method
        System.out.println(t2.getId());


    }
}