import java.util.Scanner;

public class ReversedSequence {

    Scanner input = new Scanner(System.in);
    public static int[] reverse(int n){
        //your code
        int[] res = new int[n];
        for (int i=0; i<n; i++)
            res[i]=n-i;
        return res;
    }


    public String returnReversedListOfNumber(){

        int number;

        System.out.print("Enter Number for Reverse: ");
        number = input.nextInt();

        String result = "";

        for (int i =number; i>=1; i--){
            result += i;
        }


        return result;
    }

    public void returnReverseString(){

        String value = "Nabeel";

        char[] check = value.toCharArray();

        System.out.println("Original value is: " + value);
        System.out.println("After reverse is: ");
        for (int i = check.length-1; i>=0; i--){

            System.out.print(check[i]);
        }
    }
}
