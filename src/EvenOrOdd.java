import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.util.Scanner;

public class EvenOrOdd {


    Scanner input = new Scanner(System.in);


    public String returnEvenOrOdd(){
        StringBuilder sb = new StringBuilder();
        int sum =0;
        String check = null;
        int[] array = {2,2,6,1,1};

        for (int i = 0; i<array.length; i++){
            sum += array[i];
        }

        System.out.println("Sum is: " + sum);
        if (array.length == 0){
            check = "0 is even";
        }
       else if (sum % 2 ==0){
            check = "even";
        }
        else {
            check = "odd";
        }

        return check;
    }
}
