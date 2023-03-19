package week_05;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
                   //123456
        String str="ABCDEG";

        //how to get each char
        System.out.println(str.charAt(0));//first char which is A
        //how to get E
        System.out.println(str.charAt(4));
        //how to use with scanner
       /* Scanner scanner = new Scanner(System.in);
        char ch=scanner.next().charAt(0);
        System.out.println("F".charAt(4));
*/
        //how to learn how many chars we have in a string

        System.out.println(str.length());

        //how to make letters lower case

        System.out.println(str.toLowerCase());

        // how to make letters upper case
        System.out.println(str.toUpperCase());

        // how to trim(delete) the spaces at the begin part and end part
                    //012345678
        String str1=" ab cd   ";
        System.out.println( str1);
        System.out.println(str1.trim());

        //how to find the index of any char
        System.out.println(str1.indexOf('b'));//2
        System.out.println(str1.indexOf(' '));//0
        System.out.println(str1.indexOf('e'));//-1

        //how to find index of string in a string

        System.out.println(str1.indexOf("b c"));//2

        System.out.println(str1.indexOf("b cd"));//2


    }
}
