package com.javatutorials.tests;
import com.java.algorithms.StringAlgorithms;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StringAlgorithmsTests {

        String wordToFind = "Love";
        String sentence = "where is the love ";

        @Test(groups = {"smoke", "string"})
        public void stringMethods(){
            Assert.assertEquals("Love", wordToFind, "The word to find is " +wordToFind);
        }
        @Test(groups = {"smoke", "string"})
        public void stringManTest(){
            Assert.assertEquals(StringAlgorithms.searchWords(wordToFind, sentence), 1, "The expected count is " );
        }
}



