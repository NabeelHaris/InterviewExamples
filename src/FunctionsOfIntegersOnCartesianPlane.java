import java.math.BigInteger;

public class FunctionsOfIntegersOnCartesianPlane {


    public BigInteger sumMin(int number) {
        long check = (long)number;
        return BigInteger.valueOf(check*(check+1)*(2*check+1)/6);
    }
    public BigInteger sumMax(int number) {
        long check = (long)number;
        return BigInteger.valueOf(check*check*check-check*(check-1)*(2*check-1)/6);
    }
    public BigInteger sumSum(int number) {
        return sumMin(number).add(sumMax(number));
    }

}
