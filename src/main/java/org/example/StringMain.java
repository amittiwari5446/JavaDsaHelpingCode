package org.example;

import java.util.Arrays;
import java.util.List;

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

        System.out.println("indexOf('i'):"+str2.indexOf("i"));
        System.out.println("indexOf('i',4):"+str2.indexOf("i",4));
        System.out.println("indexOf('sl'):"+str2.indexOf("sl"));
        System.out.println("lastIndexOf('a'):"+str2.lastIndexOf("a"));


        String str3="   whatsup Brother  OG    ";
        System.out.println("trim(): "+str3.trim());
        System.out.println("strip(): "+str3.strip());
        System.out.println("stripLeading(): "+str3.stripLeading());
        System.out.println("stripTrailing(): "+str3.stripTrailing());

        String str4 = str3.replace("t","#");
        String str5 = str3.replaceFirst("t","#");
        System.out.println("replace('t','#'): "+str4);
        System.out.println("replaceFirst('t','#'): "+str5);

        String str6="Apple,Banana,Grapes,Guava";
        String[] str7=str6.split(",");
        String[] str8=str6.split(",",2);
        System.out.println("split(','): "+ Arrays.toString(str7));
        System.out.println("split(',',2): "+ Arrays.toString(str8));

        String joined=String.join("-","Amit","Kumar","Tiwari");
        System.out.println("String.join(): "+joined);
        List<String> list= List.of("A","B","C");
        String joined2=String.join("-",list);
        System.out.println("join(): "+joined2);




    }
}