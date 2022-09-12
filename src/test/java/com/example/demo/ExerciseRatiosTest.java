package com.example.demo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExerciseRatiosTest {

    @Test
    public void test1(){
        plusMinus(Arrays.asList(1, 2, 3, 0, -6, -6));
    }

    public static void plusMinus(List<Integer> arr) {
      double countNegative = 0;
      double countPositie = 0;
      double countZero = 0;


      for(Integer number : arr) {
          if (number == 0) {
              countZero++;
          } else if (number > 0) {
              countPositie++;
          } else {
              countNegative++;
          }
      }
      System.out.println(countPositie/arr.size());
      System.out.println(countNegative/arr.size());
      System.out.println(countZero/arr.size());

    }
}
