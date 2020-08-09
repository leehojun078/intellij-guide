package com.wmp.hojun;

import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) {

        Email email111 = new Email(1, "h");

//        email111.send("gogo");

        Stream<Email> emails = Stream.of(new Email(10, "a"), new Email(20, "b"));

        Stream<Integer> ageStream = emails.map(Email::getAge);

//        ageStream.forEach(System.out::println);

        double d = Math.random();

        System.out.println("----------------");

        List<Integer> l = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            l.add(i);
        }

        Stream<Integer> stream = l.stream();

        stream.filter(x -> x > 5)
                .peek(System.out::println)
                .map(x -> x + 10)
                .forEach(System.out::println);

        System.out.println("------------------");

        stream = l.stream();
        stream.peek( i ->  System.out.println( "start after" + i)).skip(3).peek( i ->  System.out.println( "skip after" + i)).limit(5).filter(i -> i % 2 == 0).forEach(System.out::println);

        IntStream.range(1, 5).forEach(System.out::println);

        IntStream.range(1, 5).mapToObj(it -> String.valueOf(it)).collect(toList());

        List<TestEntity> testEntities = new ArrayList<>();

        testEntities.add(new TestEntity(1, "test상품1", "partner위메1"));

        testEntities.add(new TestEntity(2, "test상품2", "partner위메2"));

        testEntities.stream().map(TestEntity::getGoodsName).peek(System.out::println).collect(Collectors.toSet());
    }

    @ToString
    @Setter
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class TestEntity {
        private long id;
        private String goodsName;
        private String partnerName;
    }
}
