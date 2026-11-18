package org.example;

public class Main{
    public static int add(int a,int b){
        return a+b;
    }
    public static int sub(int a,int b){
        return a-b;
    }
    public static int mul(int a,int b){
        return a*b;
    }
    public static double div(int a,int b){
        if(b==0){
            throw new IllegalArgumentException("division by zero");
        }
        return (double) a/b;
    }
    public static void main(String[] args){
        int a = 20;
        int b = 10;
        System.out.println("Addition = " + add(a, b));
        System.out.println("Subtraction = " + sub(a, b));
        System.out.println("Multiplication = " + mul(a, b));
        System.out.println("Division = " + div(a, b));
    }
}