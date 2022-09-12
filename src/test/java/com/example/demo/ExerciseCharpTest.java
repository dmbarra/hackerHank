package com.example.demo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ExerciseCharpTest {

    @Test
    public void test1(){
        staircase(3);
    }

    public static void staircase(int n) {
        // Write your code here
        String charp  = "#";
        String space = " ";
        for (int teste = 1 ; teste<n;teste++){
            charp = space.concat(charp);
        }
        for(int x =0; x<n; x++){
            System.out.println(charp);
            for(int y =x;y<=x;y++){
                charp = charp.concat("#");
                charp = charp.replaceFirst(" ","" );

            }
        }

    }

}
