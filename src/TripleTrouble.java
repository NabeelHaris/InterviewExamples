import java.util.Scanner;

public class TripleTrouble {

    private String stringValue = "";
    private String value1 = null;
    private String value2 = null;
    private String value3 = null;

    Scanner input =new Scanner(System.in);

    public String tripleTrouble(){

        System.out.print("Enter first String: ");
        value1 = input.next();

        System.out.print("Enter second String: ");
        value2 = input.next();

        System.out.print("Enter third String: ");
        value3 = input.next();

        for (int i = 0; i < value1.length(); i++){
            stringValue += "" + value1.charAt(i) + value2.charAt(i) + value3.charAt(i);
        }
        return stringValue;
    }
}
