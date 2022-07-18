import java.math.*;

public class ex08{
    public static void main(String[] args){
    	System.out.println(factorial(3));
	    System.out.println(factorial(6));
	    System.out.println(factorial(9));
	    System.out.println(factorial(12));
    }

    public static BigInteger factorial(int value) {
    	BigInteger ret = BigInteger.ONE;
        for (int i = 1; i <= value; ++i) ret = ret.multiply(BigInteger.valueOf(i));
        return ret;
    }
}