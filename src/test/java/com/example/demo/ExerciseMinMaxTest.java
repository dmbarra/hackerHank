package com.example.demo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExerciseMinMaxTest {

    @Test
    public void test1(){
        miniMaxSum(Arrays.asList(256741038, 623958417, 467905213, 714532089, 938071625));
    }

    public static void miniMaxSum(List<Integer> arr) {
        Collections.sort(arr);

        Long min = Long.valueOf(arr.get(0));
        Long max = Long.valueOf(arr.get(arr.size() - 1));
        Long mid = Long.valueOf(0);

        for(Integer i=1; i <= (arr.size() - 2);  i++){
            mid = mid + arr.get(i);
        }

        System.out.println((min + mid) + " " + (max + mid) );

    }

}
