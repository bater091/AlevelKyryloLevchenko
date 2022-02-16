package com.levchenko.hw31;

import java.util.ArrayList;
import java.util.List;

public class ThreadHello extends Thread {

    @Override
    public void run() {
        System.out.println("Hello from thread " + Thread.currentThread().getName());
    }


    public static void runner(Thread thread) throws InterruptedException {
        thread.start();
        thread.join();
    }

    public static void main(String[] args) throws InterruptedException {
        List<Thread> list = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            ThreadHello threadHello = new ThreadHello();

            list.add(threadHello);

        }
        for (int i = 49; i > -1; i--) {
            ThreadHello.runner(list.get(i));

        }

    }
}
