package com.example.demo.CodingExamples;

public interface InterfaceJava8 {
    public static final String name ="TEST";
    public void m3();

    public default  void m1(){
        System.out.println("Default Method");
    }

    public static  void m2(){
        System.out.println("Static Method");
    }
}
