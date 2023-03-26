package week_06;
/*
Task 4: Given a sentence which is string and print the each word.


input:

String str="Java is java in everywhere is Java";

output:
Java
is
java
in
.
.
.
 */

public class Task4 {
    public static void main(String[] args) {
        String str="Java is java in everywhere is Java";

        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            //ı am getting each char
            char each = str.charAt(i);
            //if my char is not space
            if (each!=' '){
                temp += each;
            }else{
                System.out.println(temp);
                temp = "";
            }

        }
        System.out.println(temp);
    }
}
