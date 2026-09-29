package org.example;

public class StringMain {
    public static void main(String[] args) {
        String str1=String.valueOf(123);
        System.out.println("str1: "+str1);

        String str2="Chikoslovakia";
        System.out.println("substring1: "+str2.substring(4));
        System.out.println("substring2: "+str2.substring(3,5)); //end index is not included 5-1=4
        System.out.println("startswith() 'ch'?: "+str2.startsWith("ch"));
        System.out.println("endswith() 'lov'?: "+str2.endsWith("lov"));
        System.out.println("contains() 'lov'?: "+str2.contains("lov"));
    }
}