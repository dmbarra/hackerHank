package com.example.demo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ExerciseAppleOrangeTest {

    @Test
    public void test1(){
        countApplesAndOranges(7, 10, 4, 12, Arrays.asList(2,3,-4), Arrays.asList(3,-2,-4));
    }

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        HashMap<String, Integer> result = new HashMap<String, Integer>() {{ put("APPLE", 0 ); put("ORANGE", 0); }};
        for(int i=0;i<=(apples.size()-1); i++){
            if (s <= (apples.get(i) + a) && (apples.get(i) + a) <= t) {
                result.put("APPLE", result.get("APPLE") + 1);
            };
        }
        for(int i =0; i<= (oranges.size() -1); i++){
            if (s <= (oranges.get(i) + b) && (oranges.get(i) + b) <= t) {
                result.put("ORANGE", result.get("ORANGE") + 1);
            };
        }

        System.out.println(result.get("APPLE"));
        System.out.println(result.get("ORANGE"));
    }

}
