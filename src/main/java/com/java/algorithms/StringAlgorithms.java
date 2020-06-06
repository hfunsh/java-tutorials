package com.java.algorithms;

import java.util.HashSet;
import java.util.Set;

public class StringAlgorithms {

    public static int searchWords(String wordToFind, String stringToSearch){
        int count = 0;

        String[] stringArray = stringToSearch.split(" ");
        for (String str: stringArray
        ) {
            if(str.equalsIgnoreCase(wordToFind)){

                count++;
            }
        }
        return count;
    }

    public static String wordEnds(String longWord, String shortWord){
        String newWord = "";
        char finalWord = ' ';

        longWord = longWord.toLowerCase();
//        System.out.println(longWord);
        shortWord = shortWord.toLowerCase();
//        System.out.println(shortWord);

        char[] longArr = longWord.toCharArray();
//        System.out.println(Arrays.toString(longArr));
        char[] shortArr = shortWord.toCharArray();
//        System.out.println(Arrays.toString(shortArr));


        //write a loop to put the long word into a data structure
        //For each 2 letters we add, we check to see if that string is already there, if so
        //take the index of the letters before and after

        Set<String> stringSet =  new HashSet<String>();

        //check to see if the string contains a substring of the short word, by looping through

        for(int x = 1; x < longArr.length-2; x++){
            if(stringSet.contains(shortWord)){
                newWord += longArr[x-1];
                stringSet.remove(shortWord);
            }stringSet.add(String.valueOf(longArr[x]));
            stringSet.add(String.valueOf(longArr[x+1]));
//           System.out.println(stringSet);
        }



//        for(int x = 1; x < longArr.length-2; x++){
//            System.out.println(String.valueOf(longArr[x] + longArr[x+1]));
//            if(longArr[x] == shortArr[0] && longArr[x+1] == shortArr[1]){
//                finalWord += longArr[x-1];
//                finalWord += longArr[x+2];
//                System.out.println(finalWord);
//            }
//        }

        return String.valueOf(finalWord);

    }

// Given a string and a non-empty word string, return a string made of each char just before and
// just after every appearance of the word in the string. Ignore cases where there is no char before or
// after the word, and a char may be included twice if it is between two words.
//
//wordEnds("abcXY123XYijk", "XY") → "c13i"
//wordEnds("XY123XY", "XY") → "13"
//wordEnds("XY1XY", "XY") → "11"



}



