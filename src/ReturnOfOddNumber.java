public class ReturnOfOddNumber {


    public String returnTriangleOfOddNumber(){

        int number = 2;
        long[] arr = new long[number];

        for (int i = 0, j = 0; i < 2 * number; i += 2, j++)
            arr[j] = (long) number * (number - 1) + 1 + i;

        return arr.toString();
    }

    public int returnNumber(){

        int number =16;
        int value= 0;
        int[] array = new int[number];
        for (int i = number ; i<array.length; i++) {
            if (number < 18) {
                value = array[i];
            }
        }
        return value;
    }
}
