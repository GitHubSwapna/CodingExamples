package com.example.demo.CodingExamples;

import java.util.Arrays;

public class StringExamples {
    public static void main(String[] arg)
    {
        reverseTheString( "reverseString");
        palindrome("madam");

        int[] values = {5,1,2,4,7,6};
        findLargestElementInArray(values);
        int[] values1 = {23,27,21,24,31,22};
        findLargestElementInArray(values1);
        System.out.println("Factorial value for 5: "+findTheFactorialOfGivenNumber(5));
        findTheFibonacciSeries(5);
        findThePrimeOrNot(27);
        findThePrimeOrNot(29);
        findThePrimeOrNot(47);
        mergeTheArrays();

    }
    private static void palindrome(String original )
    {
        StringBuilder builder = new StringBuilder();
        String reversed = builder.append(original).reverse().toString();
        if (original.equals(reversed))
        {
            System.out.println("Yes Given String is: "+original +" reversed: "+reversed);
        }
    }

    private static void reverseTheString(  String original ) {
        char[] originalArray = original.toCharArray();
        int left = 0;
        int right = originalArray.length -1;
        while(left < right)
        {
            char temp = originalArray[left];
            originalArray[left++] = originalArray[right];
            originalArray[right--] = temp;
        }
        System.out.println("String after reverse the value: "+ Arrays.toString(originalArray));
    }
    private static void findLargestElementInArray(int[] values) {

        Arrays.sort(values);
        System.out.println("find Largest Element InArray: "+values[values.length-1]);

        int left = 0;
        int right = 1;
        while ( right < values.length-1 )
        {
            if(values[left] > values[right]) {
                int temp = values[left];
                values[right] = values[left];
                values[left] = temp;
            }
            left = right;
            right = right+1;
        }
        System.out.println("find Largest Element In Array: "+values[right]);
    }

    public static int findTheFactorialOfGivenNumber(int number)
    {
        if (number < 1) {
            return 1;
        }
        return number * findTheFactorialOfGivenNumber(number-1);
    }
    public static void findTheFibonacciSeries(int number)
    {
      int first = 0;
      int second = 1;
        System.out.print(" "+first);
        System.out.print(" "+second);
      if (number > 2 )
      {
          for(int i = 2; i < number ; i++) {
              int third = first +second;
              System.out.print(" "+third);
              first = second;
              second = third;
          }
      }
      }

    private static void findThePrimeOrNot(int number)
    {
        boolean prime = true;
        for(int i = 2; i < Math.sqrt(number); i++)
        {
            if(number%i == 0)
            {
                prime = false;
                System.out.println("Not Prime Number: " +number);
            }
        }
       if(prime) { System.out.println("Prime Number: " +number);
       }
       else {
           System.out.println("Not a Prime Number: " + number);
       }
    }

    private static void mergeTheArrays() {

        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        int size = arr1.length + arr2.length;
        int[] merged = new int[size];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }
        System.out.print("Merged Array: ");
        for (int num : merged) {
            System.out.print(num + " ");
        }

    }


}
