package com.example.demo;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Teste {

    public static void main(String[] args) {
        Stream<Integer> numStream = Stream.of(10, 20, 30);
        numStream.map(n -> n + 10).peek(s -> {
            System.out.print(s);
        }).collect(Collectors.toList());

        numStream.onClose(new Runnable() {
            @Override
            public void run() {
                System.out.println("Esta fechado");
            }
        });
    }
}
