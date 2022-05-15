public class ex05{
    public static void main(String [] args){
        char res;

        res = charExpression(32);
        System.out.println(res);
        res = charExpression(29);
        System.out.println(res);
    }
    public static char charExpression(int a) {
        return (char)(92 + a);
    }
}