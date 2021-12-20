package com.company;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        Scanner scan = new Scanner(System.in);
        String regex = "([^а-яa-z0-9])";
        String sentence = scan.nextLine();
        String sentence_low = sentence.toLowerCase();
        System.out.println(sentence_low);
        String[] str = sentence_low.split(regex);
        Map<String, Long> slova = Arrays.stream(str).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        if (slova.size() < n) n = slova.size();

        slova.entrySet().stream().sorted(new C_map()).limit(n).forEach(System.out::println);
    }
}