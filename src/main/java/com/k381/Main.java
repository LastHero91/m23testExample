package com.k381;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Arrays.stream(args).forEach(System.out::println);

        System.out.println(System.getProperty("threadCount", "5"));
    }
}
