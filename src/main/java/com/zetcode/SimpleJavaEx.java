package com.zetcode;

import java.util.List;
import java.util.ArrayList;

public class SimpleJavaEx
{
    public static void main( String[] args )
    {
        List<String> words = new ArrayList<>();
        words.add("summer");
        words.add("pen");
        words.add("blue");
        words.add("rock");

        for (String word: words) {
            System.out.println(word);
        }
    }
}
