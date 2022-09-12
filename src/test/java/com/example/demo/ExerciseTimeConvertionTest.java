package com.example.demo;

import org.junit.jupiter.api.Test;

public class ExerciseTimeConvertionTest {

    @Test
    public void test1(){
        System.out.println(timeConversion("07:05:45PM"));
    }

    public static String timeConversion(String s) {
        String converted = "";
        String[] splited = s.split(":");
        if(s.contains("PM")){
            if(Integer.parseInt(splited[0]) < 12) {
                splited[0] = Integer.toString(Integer.parseInt(splited[0]) + 12);
            }
            converted = "".join( ":", splited[0], splited[1], splited[2]).replace("PM", "");
        } else {
            if(Integer.parseInt(splited[0]) == 12) {
                splited[0] = "00";
            }
            converted = "".join( ":", splited[0], splited[1], splited[2]).replace("AM", "");
        }
        return converted;
    }

}
