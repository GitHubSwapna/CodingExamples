package com.example.demo.CodingExamples;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo1   {
    public static void main(String[]  args)
    {
        int[] numbers = {0,1,0,1,0,1,1,1,0};

        Arrays.sort(numbers);

        System.out.println("Sorted Array: " + Arrays.toString(numbers));
        findSumOfEven();
        List<Integer> inputs = List.of(10, 20, 10, 45, 90, 50,20);
        findSecondLargestNumber( 2,  inputs);
        System.out.println(" Count the frequency of each character in a string");
        findCountofCharacters("paramaveera");
        findFirstNonRepeatingCharacterNumber("RaadhikaRad");
        System.out.println("Get a list of distinct words from a string");
        findDistinctWords("Java is great and Java is awesome");
        System.out.println(" Sort a list of strings by length");
        List<String> strs = List.of("test","swa","saraswathi","radha");
        sortBylength(strs);
        findTheLogestString(strs);
        System.out.println(" Check if all elements in a list are positive");
        checkAllTheElePositive(inputs);
        System.out.println(" Group words by their length");
        List<String> strss = List.of("testsw","swaswa","sara","radha","amma","latha");
        groupWordsByLength(strss);
        System.out.println("Find the average of a list of numbers");
        findTheAvarageOfGivenList(inputs);
        System.out.println(" Remove duplicates from a list");
        removeDuplicatesFromGivenList(inputs);


    }
    public static void findSumOfEven() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int result =  numbers.stream()
                 .filter( n -> n%2 == 0)
                 .collect(Collectors.summingInt(Integer::intValue));
        System.out.println("Find the sum of all even numbers in a list: "+result);
    }

    public static void findSecondLargestNumber(int n, List<Integer> numbers)
    {
        Optional<Integer> secondLargest =  numbers.stream()
                .sorted(Comparator.reverseOrder())
                .skip(n-1)
                .findFirst();
        System.out.println("Find the Second LargestNumber ");
        secondLargest.ifPresent(System.out::println);
    }
    public static void findCountofCharacters(String input) {
    Map<Character, Long> result = input.chars()
              .mapToObj(c ->(char) c)
              .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    result.forEach((val,count) -> {
        System.out.println(val+ " : " +count);
    });

    }

    public static void findFirstNonRepeatingCharacterNumber(String input) {
     Map<Character, Long>  result = input.chars()
                .mapToObj(e -> (char) e)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
    Character result1 = result.entrySet()
            .stream().filter(e -> e.getValue() == 1)
            .map(Map.Entry::getKey)
            .findFirst()
            .orElse(null);
    System.out.println("First Non repeating character in given string: "+ result1);
    }

    public static void findDistinctWords(String input) {

        Arrays.stream(input.split(" "))
                .collect(Collectors.toList()).stream().distinct().forEach(System.out::println);

    }

    public static void  sortBylength(List<String> strs)
    {
       String result =  strs.stream()
                .sorted(Comparator.comparing(s -> s.length()))
                .collect(Collectors.joining(","));
       System.out.println(result);
    }
    public static void  findTheLogestString(List<String> strs)
    {
        Optional<String> result =  strs.stream()
                .max(Comparator.comparing(s -> s.length()));

       result.ifPresent( System.out::println);
    }

    public static void  checkAllTheElePositive(List<Integer> values)
    {
       boolean result =  values.stream()
                .allMatch(n -> n> 0);

       System.out.println("All elements are positive: " + result);
    }
    public static void groupWordsByLength(List<String> values) {
        Map<Integer, String> mapResult =
        values.stream()
                .collect(Collectors.groupingBy(s -> s.length(), Collectors.joining(",")));
        mapResult.forEach((a, b) -> {
            System.out.println(a+"   "+b);
        });

    }

    public static void  findTheAvarageOfGivenList(List<Integer> values)
    {
        IntSummaryStatistics result =  values.stream().mapToInt(Integer::intValue).summaryStatistics();


        System.out.println("Average of given number: " +  result.getAverage());
    }

    public static void  removeDuplicatesFromGivenList(List<Integer> values)
    {
        values
                                        .stream()
                                        .mapToInt(Integer::intValue)
                                        .distinct().forEach(System.out::println);



    }



}
