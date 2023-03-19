package week_05;

import java.util.Scanner;

public class FormWithScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name :");
        String firstName=scanner.nextLine();
        System.out.println("Please enter your age");
        int age =scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please enter your gender");
        String gender=scanner.nextLine();

        System.out.println("Please enter your job");
        String job=scanner.nextLine();



        /*System.out.println("firstName = " + firstName);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("job = " + job);*/

        System.out.println("First : "+firstName + "\n"+
                "Gender: "+ gender+"\n"+
                "Age: "+age+"\n"+
                "Job : "+job);

    }
}
