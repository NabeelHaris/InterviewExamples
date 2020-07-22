import java.util.Scanner;

public class MovesInSquaredStrings {


    Scanner read = new Scanner(System.in);



    public String reverseString(){

        System.out.println("Enter string to reverse:");
        String str = read.nextLine();

        StringBuilder sb = new StringBuilder(str);


        return sb.reverse().toString();
}
}
