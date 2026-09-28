package org.example;

public class StringMain {
    public static void main(String[] args) {
        String str1=String.valueOf(123);
        System.out.println("str1: "+str1);

        String str2="Chikoslovakia";
        System.out.println("substring1: "+str2.substring(4));
        System.out.println("substring2: "+str2.substring(3,5)); //end index is not included 5-1=4
    }
}