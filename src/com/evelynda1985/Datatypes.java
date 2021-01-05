package com.evelynda1985;

public class Datatypes {

    public static void main(String[] args) {
        long x= -150;
        try
        {
            System.out.println(x+" can be fitted in:");
            if(x>=-128 && x<=127)
                System.out.println("* byte");
            if(x>=-32768 && x<=32767)
                System.out.println("* short");
            if(x>=Math.pow(-2,31) && x<=(Math.pow(2,31)-1))
                System.out.println("* int");
            if(x>=Math.pow(-2,63) && x<=(Math.pow(2,63)-1))
                System.out.println("* long");
        }
        catch(Exception e)
        {
            System.out.println(x + " can't be fitted anywhere.");
        }


    }

//    byte -128 and a maximum value of 127 (inclusive)
//    short -32768 and a maximum value of 32,767 (inclusive)
//    int -231 and a maximum value of 231-1
//    long -263 and a maximum value of 263-1

}
