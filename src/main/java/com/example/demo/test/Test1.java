package com.example.demo.test;

public class Test1 implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<10;i++)
        {
            System.out.println("t1:" +i);
        }
    }
}
