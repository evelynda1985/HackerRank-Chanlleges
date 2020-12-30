package com.evelynda1985;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Loops2 {

    public static void main(String[] args) {

//        int a = a;
//        int b = b;
//        int n = n;

        series(0,2,10).stream()
                .map(result -> result + " ")
                .forEach(System.out::print);
        System.out.println();


    }

    public static List<Integer> series(int a, int b, int n){
        double seriesValue = 0.0;
        int toInt = 0;
        List<Integer> listOfResults = new ArrayList<>();
        int nCopy = n;
        double acumulator = 0.0;

            for (int i = 0; i < nCopy; i++){
                if (i == 0){
                    seriesValue = a + Math.pow(2,i) * b;
                    acumulator = acumulator + seriesValue;
                }else{
                    seriesValue =+ Math.pow(2,i) * b;
                    acumulator = acumulator + seriesValue;
                }
                listOfResults.add((int)acumulator);
            }
            return listOfResults;


    }
//    2 6 14 30 62 126 254 510 1022 2046

}
