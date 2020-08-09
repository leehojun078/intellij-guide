package com.wmp.hojun;

import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FlatMap {
    public static void main(String[] args) {

        String[][] arr = {
                {"one", "two"},
                {"three", "four"}
        };

        Stream.of(arr)
                .flatMap(Stream::of)
                .forEach(System.out::println);

        int[][] arr2 = {{1,2},{5,4,3},{1,3,5}};

        Stream.of(arr2)
                .flatMapToInt(IntStream::of)
                .distinct()
                .sorted()
                .forEach(System.out::println);


        int id = getId(3);


    }
    public static int getId(int id){
        return id < 0 ? 0 : id;
    }
}
