import java.util.Scanner;

public class FindTwoLargestNumberOrAgesInArray {


    Scanner input  = new Scanner(System.in);

    public int returnLargestAgesInArray(){

        int[] array = new int[6];

        System.out.print("Enter to find largest numbers: ");
        for (int i=0; i<array.length;i++){
            array[i] = input.nextInt();
        }
        int maxResult = array[0];

        for (int j =0; j<array.length;j++) {
            if (array[j] > maxResult) {
                maxResult = array[j];
            }
        }
        return maxResult;
    }


    public void returnThreelargestAges(){

        int[] array = new int[6];
        int first, second, third;

        System.out.print("Enter numbers: ");
        for (int i =0; i<array.length; i++){
            array[i] = input.nextInt();
        }
        third = first = second = array[0];
        for (int j=0; j<array.length; j++){
            if (array[j] > first)
            {
                third = second;
                second = first;
                first = array[j];
            }
            else if (array[j] > second)
            {
                third = second;
                second = array[j];
            }

            else if (array[j] > third)
                third = array[j];
        }

        System.out.println("Three largest elements are " +
                first + " " + second + " " + third);

    }
}
