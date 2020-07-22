
import java.lang.invoke.StringConcatFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindLongestStringArray {

    private String[] strings = {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"};

    Scanner input =new Scanner(System.in);



    public String findLongestStringInArray(){
        int n = strings.length;
        int k = 2;

        int maxLength = 0;
        String longestString = strings[0];
        if (n == 0 || k > n || k<=0){
            return "";
        }
        else {

            for (int i = 0; i < strings.length; i++) {
                if (strings[i].length() > maxLength) {
//                    maxLength = strings[i].length();
                    longestString = strings[i];
                }
//                else if (strings[i] > anotherString){
//                    anotherString = strings[i];
//                }
//                for (int j = i +1 ; j <= k; j++) {
//                    anotherString = longestString.concat(strings[j]);
//                }
            }
        }
         return longestString;
    }


}

