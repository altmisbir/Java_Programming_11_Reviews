package week_06;
/*
Task 5: Given a sentence which is ended with "." included lettters, numbers, special charecters and then find hidden sentence.

input:
        String sentence = "Y*78*8*o770987987u a869869=r????23425235e t54898)!'^h^^&%e b+%^^e%&+s%&t
         g+%&%+u/%y&/s.&6756/D4o n556576ot5675 c657467a7657r7657e a6575b6575o5675u567t i5467t&";

output:
You are the best guys
*/

public class Task5 {
    public static void main(String[] args) {
        String sentence = "Y*78*8*o770987987u a869869=r????23425235e t54898)!'^h^^&%e b+%^^e%&+s%&t g+%&%+u/%y&/s.&6756/D4o n556576ot5675 c657467a7657r7657e a6575b6575o5675u567t i5467t&";
        String temp = "";
        for (int i = 0; i < sentence.length(); i++) {

            char each = sentence.charAt(i);
            if((each>='a'&& each<='z')||(each>='A'&& each<='Z')|| each==' ')
                temp += each;
            if(each=='.')
                break;

        }
        System.out.println(temp);
    }
}
