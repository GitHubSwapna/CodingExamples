package com.example.demo;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Map;

public class LTM {
    public static void main(String[] args) {
        String str = "swiss";
        findTheFirstNonRepeatableCharacter(str);
    }

    public static void findTheFirstNonRepeatableCharacter(String str ){
        Map<String, Long> resultMap =  Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(
                        Function.identity(), LinkedHashMap::new, Collectors.counting()
                ));

    Map.Entry<String, Long> result =
        resultMap
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .findFirst().get();
        System.out.println("First Non Repeatable Character as:  " + result.getKey());

    }

    public static void reverseTheGivenString(String str)
    {

    }
}
