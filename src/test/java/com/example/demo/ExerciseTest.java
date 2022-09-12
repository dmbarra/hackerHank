package com.example.demo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExerciseTest {

    @Test
    public void test1(){
        String resp = findFirstRepeatedWords("Hello: hello, my fellow candidate. Hello again.");
        assertEquals(resp, "hello");
    }

    public String findFirstRepeatedWords(String paragraph) {
        List<String> listParagraph = Stream.of(paragraph.split("\\.")).collect(Collectors.toList());
        Set<String> foo = new HashSet<String>();

        for(String paragraph1 : listParagraph) {
            List<String> words = Arrays.asList(paragraph1.toLowerCase().split(" |=|,|;|-|:"));
            for (String word: words){
                if (foo.contains(word)) {
                    return word;
                } else {
                    foo.add(word);
                }
            }
        }
        throw new IllegalArgumentException();
    }
}
