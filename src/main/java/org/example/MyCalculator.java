package org.example;
import java.lang.Math;

public class MyCalculator {
    public static void main(String[] args) {

        System.out.println("hello world");
    }
    public static int add(int x,int y)
    {
        return x+y;
    }
    public static int sub(int x, int y)
    {
        return Math.abs(x - y);
    }
    public static int mul(int x,int y)
    {
        return x*y;
    }
}
