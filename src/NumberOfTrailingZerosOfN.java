public class NumberOfTrailingZerosOfN {


    public int returnFactorialOfNumber(){

        int number =6;
        int factorial=1;
        int check ;

        int count = 0;
        for (int i = 5; (number/i) > 0; i=i*5) {
            count = count + number/i;
        }
        return count;
    }
}

