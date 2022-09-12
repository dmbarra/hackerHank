package com.example.demo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExerciseKangorooTest {

    @Test
    public void test1(){
//        String resp = kangaroo(2,1,1,2);
//        String resp = kangaroo(0,3,4,2);
//        String resp = kangaroo(0,2,5,3);
        String resp = kangaroo(14,4,98,2);
        assertEquals("YES", resp);
    }

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        int jumpRate1 = x1 + v1;
        int jumpRate2 = x2 + v2;

        if (jumpRate1 == jumpRate2) {
            return "YES";
        } else if (v1 > v2) {
            while (jumpRate1 <= jumpRate2) {
                if (jumpRate1 == jumpRate2) {
                    return "YES";
                }
                jumpRate1 += v1;
                jumpRate2 += v2;
            }
        }
        return "NO";
    }



}
