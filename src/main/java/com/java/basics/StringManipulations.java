package com.java.basics;

import java.util.Arrays;

public class StringManipulations {

    public static void main(String[] args){

        String wordToFind = "Love";
        String sentence = " where is the love ";

        //Formatting with Printf
        System.out.println(sentence.contains(wordToFind)); //contains a specific string
        System.out.printf("The word %s is highly overated\n",wordToFind);
        System.out.printf("It is %s that the sentence \"%s\" starts with an \"r\" at index 2\n", sentence.startsWith("r", 2), sentence); //starts with a specific string
        System.out.printf("\"%s\" is the trimmed version of \"%s\"\n", sentence.trim(), sentence); //removes leading and trailing white space

        System.out.printf("The last index of \"h\" in \"%s\" is %d\n", sentence.trim(), sentence.lastIndexOf('h'));
        System.out.printf("The first index of \"i\" in \"%s\" is %d\n", sentence.trim(), sentence.lastIndexOf('i')); //prints the first index of char in a given string
        System.out.println("The last index of j is " + sentence.lastIndexOf('h'));

        //Other String methods
        System.out.println("The index of love is " + sentence.indexOf("love"));
        System.out.printf("The substring of index 0-13 in \"%20s\" is \"%20s\"\n", sentence, sentence.substring(0, 13));
        System.out.printf("The substring of index 0-13 in \"%20s\" is \"%20s\"\n", sentence, sentence.substring(0, 13));

        System.out.println("The index of e after 5 is " + sentence.indexOf("e", 5));
        System.out.println("Region matches is " + sentence.regionMatches(true, 13, "LovE", 17, 4));
        System.out.println("The length of the word \"hello\" is " + "hello".length());
        System.out.println("This is a concatenated ".concat("String"));
        System.out.println("1 + 1 = " + (1 + 1));
        System.out.println("The String value of the integer 2 is " + String.valueOf(2));
        System.out.println("The integer value of the String 2 is " + Integer.valueOf("2"));
        String emptyString = new String();
        String blankString = "";

        System.out.println("The length of the empty string is " + emptyString.length());
        System.out.println("The length of a blank string is " + blankString.length());

        char[] stringArray = {'w', 'a', 't', 'e', 'r'};

        String stringFromArray = Arrays.toString(stringArray);
        System.out.println("The string created from an array is " + stringFromArray);


//        System.out.println(wordEnds("XY1XY", "XY"));
//        String[] sentences = sentence.split("XY");
//        System.out.println(Arrays.toString(sentences));


    }

}
