package week_06;
/*
Task 3: Given a string password. Encrypt with "x" a given password and print.
    Hint: do with for loop
     * password: cydeo
     * encrypt with char :x
     * output:cxyxdxexox
 */
public class Task3 {
    public static void main(String[] args) {
        String word = "cydeo";
        String result = "";

        for (int i = 0; i < word.length(); i++) {
            char eaach = word.charAt(i);
            result += eaach + "x";

        }
        System.out.println(result);

        String dec = result.replace("x", "");

        System.out.println(dec);

    }
}
