package week_05;

import java.util.Scanner;

public class EligibleToDriverLicense {
    public static void main(String[] args) {
        System.out.println("Please enter your age");

        Scanner scanner = new Scanner(System.in);

        int age=scanner.nextInt();

        if(age>18){
            System.out.println("do you have highschool diploma");
            boolean answer=scanner.hasNextBoolean();

            if(answer){
                System.out.println("You are aligible to get the license");
            }else{
                System.out.println("You are not eligible to get the diploma");
            }
        }else {
            System.out.println("You are not eligible to get the diploma because of age");
        }



    }
}
