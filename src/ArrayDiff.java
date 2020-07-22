import java.util.ArrayList;

public class ArrayDiff {


    public int retrunArraySubtract(){
        int result =0;
        int[] array = {1,2,2,2,3};
        int[] array2 = {2};

        ArrayList<Integer> checkSameNumber = new ArrayList<>();

        for (int i = 0; i<array.length; i++){
            int value  = array[i];
            if (checkSameNumber.contains(value)){
                result = value;
            }
//            else{
//                System.out.println(array[i]);
//            }
        }

        return result;
    }
}
