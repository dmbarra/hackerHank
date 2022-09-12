package com.example.demo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise2Test {

    @Test
    public void test1(){
        List<Integer> resp = compareTriplets(Arrays.asList(5, 6, 7), Arrays.asList(3, 6, 10));
        assertEquals(resp.get(0), 1);
        assertEquals(resp.get(1), 1);
    }

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> result = Arrays.asList(0, 0);
        for(int i = 0; i < a.size(); i++){
            if ( a.get(i) > b.get(i)){
                result.set(0,  result.get(0) + 1);
            } else if(a.get(i) < b.get(i)) {
                result.set(1,  result.get(1) + 1);
            }
        }
        return result;
    }
}
