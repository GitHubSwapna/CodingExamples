package com.example.demo.CodingExamples;

public class Examples {

    public static void main(String[] args)
    {
        reverseTheString("Kaynes");
    }

    public static void reverseTheString(String str) {
        StringBuilder builder = new StringBuilder();
        StringBuilder reverseString =  builder.append(str).reverse();
        System.out.println(reverseString);
        StringBuilder builder1 = new StringBuilder();
       char[] chars =  str.toCharArray();

       for(int i = chars.length-1; i < 0 ; i--)
       {
           builder1.append(chars[i]);
       }
        System.out.println(builder1.toString());
    }
}
