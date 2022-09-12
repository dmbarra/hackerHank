package com.example.demo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExerciseRepetidoTest {

    @Test
    public void test1(){
        Integer resp = kangaroo(Arrays.asList(0,1,1,1,0));
        assertEquals(3, resp);
    }

    public static Integer kangaroo(List<Integer> array) {
        Integer repetido = 0;
        Integer maximo = 0;
        for (int i =0; i<= array.size() -1; i++){
            if (array.get(i).equals(1)){
                    repetido ++;
            } else {
                if (repetido >= maximo) {
                    maximo = repetido;
                }
                repetido = 0;
            }
        }
        return maximo;
    }



}
