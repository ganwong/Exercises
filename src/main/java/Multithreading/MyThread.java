package Multithreading;

/**
 * Created by wong on 16/5/16.
 */
public class MyThread implements Runnable {
    private int num = 2;
    private String name;
//    public MyThread(String name) {
//        super(name);
//    }
    public void run() {
        while (num >= 0) {
            System.out.println(Thread.currentThread().getName() + "..." + num --);
        }
    }

    public static void main(String[] args) {
//        MyThread a =new MyThread();
//        Thread a1 = new Thread(a);
//        Thread a2 = new Thread(a);
//        Thread a3 = new Thread(a);
//
//        a1.start();
//        a2.start();
//        a3.start();
        Thread th1 = new Thread();
        System.out.printf("min: %s, max: %s, norm: %s\n", Thread.MIN_PRIORITY, Thread.MAX_PRIORITY, Thread.NORM_PRIORITY);
    }
}
