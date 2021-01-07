package com.evelynda1985;

import java.util.Scanner;

public class EndOfFile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int counter = 0;

        while(sc.hasNext()){
            String s = sc.nextLine();
            counter++;
            System.out.println(counter + " " + s);
        }
    }

}
