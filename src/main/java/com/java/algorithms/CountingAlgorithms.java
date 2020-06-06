package com.java.algorithms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountingAlgorithms {


    public static int twoDArray() {
        int max = 0;

        //loop through the arrays and find the 1st three elements for each row
        //find the middle element for the next row
        //find the corresponding 3 elements for the third row
        //add all these together and compare to max
        //if greater than max, this is our new max
        //if not max remains the same
        //continue loop till we hit the end
        //return max

        int numArray[][] = new int[4][4];

        for (int rows = 0; rows < numArray.length; rows++) {

        }

        for (int rows = 0; rows < numArray.length - 3; rows++) {
            for (int cols = 1; cols < numArray[rows].length - 1; cols++) {
                System.out.println(numArray[rows][cols]);
            }
        }


        return max;
    }


    public static String commonStringIndex(String st1, String st2) {
        String answer = "NO";


        for (char ch : "abcdefghijklmnopqrstuvwxyz".toCharArray()
        ) {
            if (st1.indexOf(ch) > -1 && st2.indexOf(ch) > -1) {
                answer = "YES";
            }

        }

        return answer;
    }


    public static String commonStringData(String st1, String st2) {
        String answer = "NO";


        Set<Character> stringSet = new HashSet<Character>();

        for (char ch : st1.toCharArray()
        ) {
            stringSet.add(ch);
        }
        for (char ch2 : st2.toCharArray()
        ) {
            if (stringSet.contains(ch2)) {
                answer = "YES";
                break;
            }

        }

        return answer;
    }

    public static String commonString(String s1, String s2) {
        String answer = "NO";

        char[] string1 = s1.toCharArray();
        char[] string2 = s2.toCharArray();

        for (int x = 0; x < s1.length(); x++) {
            for (int y = 0; y < s2.length(); y++) {
                if (string1[x] == string2[y]) {
                    answer = "YES";
                    break;
                }
            }
        }

        return answer;
    }

    public static boolean countPairs(int[] nums, int sum) {
        //create a new data structure to hold the complements ...hashset because it doesn't require key values like a hashamp
        //loop through the input array and check if each value already exists in the array
        //if not add it, subtract the number from the sum and add it hashset
        //if it is, return true

        Set<Integer> comp = new HashSet<Integer>();
        for (int number : nums
        ) {
            if (comp.contains(number)) {
                return true;
            } else {
                comp.add(sum - number);
            }
        }
        return false;
    }

    public static int numPairs(int[] socks) {
        int pairCount = 0;
        Set<Integer> socksSet = new HashSet<Integer>();

        for (int x = 0; x < socks.length; x++) {
            if (socksSet.contains(socks[x])) {
                pairCount++;
                socksSet.remove(socks[x]);
            } else {
                socksSet.add(socks[x]);
            }

        }
        return pairCount;
    }

    public static int countingValleys(int n, String s) {
        int counter = 0; //counts the number of valleys
        int level = 0;   //counts the levels
        char[] wordArray = s.toCharArray();

        for (int x = 0; x < n; x++) {
            //count the number of times we go up and down
            if (wordArray[x] == 'U') {
                level++;
            }
            if (wordArray[x] == 'D') {
                level--;
            }

            //decide if we came up from a valley or not
            if ((level == 0) && (wordArray[x] == 'U')) {
                ++counter;
            }
        }

        return counter;
    }

    public static int jumpingClouds(int[] c) {
        int counter = 0;
        int cloudsLength = c.length - 2;

        //loop through array
        //evaluate element x+1 and x+2
        //increment x++ if true
        //increment counter
        for (int x = 0; x < cloudsLength; x++, counter++) {
            if (c[x + 2] == 0) {
                x++;
            }
        }


        return counter;
    }

    public static long letterCount(String s, long n) {

        long diff = n / s.length();
        int remainder = (int) (n % s.length());
        long initialCount = 0;
        long remainderCount = 0;
        String newString;

        for (char a : s.toCharArray()
        ) {
            if (a == 'a') {
                initialCount++;
            }
        }
        long found = initialCount * diff;

        if (remainder == 0) {

        } else {
            newString = s.substring(0, remainder);
            for (char a : newString.toCharArray()
            ) {
                if (a == 'a') {
                    remainderCount++;
                }
            }
        }
        return found + remainderCount;
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] results = new int[2];

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int x = 0; x < nums.length; x++) {
            if (map.containsKey(target - nums[x])) {
                results[1] = x;
                results[0] = map.get(target - nums[x]);
                break;
            }
            map.put(nums[x], x);
            System.out.println("HashMap of numbers so far" + map);
        }

        return results;
    }
}
