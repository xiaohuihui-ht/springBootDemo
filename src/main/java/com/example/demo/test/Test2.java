package com.example.demo.test;

public class Test2 extends Thread{
    @Override
    public void run() {
        for (int i=0;i<10;i++)
        {
            System.out.println("t2:" +i);
        }
    }
}
