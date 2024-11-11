package com.example.demo.CodingExamples;

import java.util.Arrays;

public class Demo1   {
    public static void main(String[]  args)
    {
        int[] numbers = {0,1,0,1,0,1,1,1,0};

        Arrays.sort(numbers);

        System.out.println("Sorted Array: " + Arrays.toString(numbers));

    }
}
