import java.io.*;
import java.util.*;

class MyThread1 implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread1");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}

class MyThread2 implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread2");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}

public class ErrorHandling {
    public static void main(String[] args) {
        Runnable obj1 = new MyThread1();
        Runnable obj2 = new MyThread2();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}
