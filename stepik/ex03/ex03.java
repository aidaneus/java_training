public class ex03{
    public static void main(String [] args){
        boolean res;

        res = doubleExpression(0.1, 0.2, 0.3);
        System.out.println(res);
    }

    public static boolean doubleExpression(double a, double b, double c) {
    return Math.abs(a + b - c) < 0.0001;
    }
}