package com.fc;

import java.io.Console;
import java.lang.StringBuffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public void newFunc() {

    }

    public void fractions() {
        int count[] = new int[] {0, 0, 0};
        int i;
        float numItems, num;

        Scanner scanner = new Scanner(System.in);

        numItems = scanner.nextFloat();

        for (i=0; i<numItems; i++) {
            num = scanner.nextFloat();

            count[0] += (num > 0) ? 1 : 0;
            count[1] += (num < 0) ? 1 : 0;
            count[0] += (num == 0) ? 1 : 0;
        }

        System.out.printf("%0.3f\n", count[0] / numItems);
        System.out.printf("%0.3f\n", count[1] / numItems);
        System.out.printf("%0.3f\n", count[2] / numItems);

    }

    public void convertTo24Hr() {

        String time;
        Scanner scanner = new Scanner(System.in);

        time = scanner.next();

        String[] timeTokens = time.split(":");

        int hour = Integer.parseInt(timeTokens[0]);
        int minute = Integer.parseInt(timeTokens[1]);
        String ampm = timeTokens[2].substring(2);
        int second = Integer.parseInt(timeTokens[2].substring(0,2));

        if (ampm.equals("AM") && hour == 12) {
            hour = 0;
        }

        if (ampm.equals("PM") && hour != 12) {
            hour += 12;
        }

        System.out.printf("%02d:%02d:%02d", hour, minute, second);
    }


    public void cancelClass() {

        Scanner scanner = new Scanner(System.in);

        int numTests = scanner.nextInt();

        while (--numTests >= 0) {

            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int numOnTime = 0;
            String isCancelled = "YES";

            for (int i=0; i<n; i++) {
                int time = scanner.nextInt();
                if (time <= 0) {
                    numOnTime++  ;
                }
            }
            if (numOnTime >= k) {
                isCancelled = "NO";
            }

            System.out.println(isCancelled);
        }
    }


    public void stringMultiplesOf3And5() {

        Scanner scanner = new Scanner(System.in);

        int numTests = scanner.nextInt();

        while (numTests-- > 0) {

            int n = scanner.nextInt();

            double posCounter = n;

            while (posCounter % 3.0 != 0) {
                posCounter -= 5;
            }

            if (posCounter < 0) {
                System.out.println("-1");
            }
            else {
                StringBuilder sb = new StringBuilder(n);
                for (int i=0; i<posCounter; i++) {
                    sb.append("5");
                }
                for (int i=0; i<(n - posCounter); i++) {
                    sb.append("3");
                }
                System.out.println(sb.toString());
            }

        }

    }


    public void fizzBuzz() {

        Scanner scanner = new Scanner(System.in);

        int maxNumber = scanner.nextInt();
        int counter = 0;

        while (maxNumber-- > 0) {
            counter++;
            if (counter % 15 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (counter % 5 == 0) {
                System.out.println("Buzz");
            }
            else if (counter % 3 == 0) {
                System.out.println("Fizz");
            }
            else {
                System.out.println(counter);
            }
        }

    }


    public void kDifference() {

        Scanner scanner = new Scanner(System.in);

        int numItems = scanner.nextInt();
        int kDifference = scanner.nextInt();
        int numPairsFound = 0;

        HashMap<Integer, Object> hashMap = new HashMap();

        while (numItems-- > 0) {
            int num = scanner.nextInt();
            hashMap.put(num, null);
        }

        for (int key: hashMap.keySet()) {
            if (hashMap.containsKey(key + kDifference)) {
                numPairsFound++;
            }
        }
        System.out.print(numPairsFound);
    }


    public int maxDifferenceInArray(int[] a) {

        int maxDifference = -1;

        for (int i=0; i<a.length; i++) {

            int smallNum = a[i];
            int largerNum = smallNum + maxDifference;

            for (int j=i+1; j<a.length; j++) {

                int n = a[j];
                if (n >largerNum) {
                    largerNum = n;
                    maxDifference = largerNum - smallNum;
                }

            }

        }

        return maxDifference;
    }


    public int maxDifferenceInArray2(int[] a) {

        int maxDifference = -1;
        int numElements = a.length;

        int maxElement = a[numElements-1];

        for (int i=numElements-2; i>=0; i--) {

            int num = a[i];

            if (num > maxElement) {
                maxElement = num;
            }
            else {
                if ((maxElement - num) > maxDifference) {
                    maxDifference = maxElement - num;
                }
            }

        }

        return maxDifference;
    }


    public void permuteWord(String prefix, String input) {

        if (input.length() == 0) {
            System.out.println(prefix);
        }
        else {
            for (int i=0; i<input.length(); i++) {
                this.permuteWord(prefix + input.charAt(i), input.substring(0, i) + input.substring(i+1, input.length()));
            }
        }
    }


    /**
     * Questions:
     * 1. Given a binary search tree, and an integer m, find the integer that has the smallest |distance| from m.
     * 2. Longest common subsequence.
     * 3. Implement LRU cache.
     */





}


