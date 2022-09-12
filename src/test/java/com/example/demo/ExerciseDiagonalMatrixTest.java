package com.example.demo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExerciseDiagonalMatrixTest {

    @Test
    public void test1(){
        int resp = diagonalDifference(Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6), Arrays.asList(9, 8, 9)));
        assertEquals(resp, 2);
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
       int diagLeft = 0;
       int diagRight = 0;
       for(int i=0; i < arr.size(); i++ ){
           diagLeft = diagLeft + arr.get(i).get(i);
           diagRight = diagRight + arr.get(i).get(arr.get(i).size() - (i + 1));
       }

        return Math.abs(diagLeft - diagRight);
    }
}
