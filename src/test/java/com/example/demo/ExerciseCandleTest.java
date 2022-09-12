package com.example.demo;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class ExerciseCandleTest {

    @Test
    public void test1() throws IOException {
        String url = "/Users/BI003736/Documents/projects/study/demo1/src/test/java/com/example/demo/ExerciseCandleTest.txt";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(url));

        int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = birthdayCakeCandles(candles);
//        birthdayCakeCandles(Arrays.asList(4, 3, 2, 1, 3));


        bufferedReader.close();
        System.out.println(result);
    }

    public static int birthdayCakeCandles(List<Integer> candles) {
        Collections.reverse(candles);
        Integer count = 1;
        Integer biggerNumber = 0;
        HashSet<Integer> tempList = new HashSet<>();

        for (int i = 0; i <= (candles.size() - 1); i++) {
            if (!tempList.add(candles.get(i))
                    && (biggerNumber.equals(0)
                    || biggerNumber.equals(candles.get(i) ))) {
                biggerNumber = candles.get(i);
                count++;
            }
        }

        return count.intValue();
    }

}
