public class ArrayPlusArray {

    int[] array1 = {1,2,3};
    int[] array2 = {4,5,6};

    public int returnArrayPlusArray(){
        int sum1 = 0;
        int sum2 = 0;

        for (int i =0; i<array1.length; i++){
            sum1 += array1[i];
        }

        for (int j =0; j<array2.length; j++){
            sum2 += array2[j];
        }
        int result = sum1 + sum2;

        return result;
    }

    public int returnSumOfArrays(){
        int result =0;
        for (int i =0; i<array1.length; i++){
            result += array1[i] + array2[i];
        }
        return result;
    }
}
