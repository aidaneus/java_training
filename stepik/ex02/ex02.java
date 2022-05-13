public class ex02{
    public static void main(String [] args){
        int res = 0;
        res = leapYearCount(1);
        System.out.println(res);
        res = leapYearCount(4);
        System.out.println(res);
        res = leapYearCount(100);
        System.out.println(res);
    }
    public static int leapYearCount(int year) {
        int res = 0;
        res = (year / 4) - (year / 100) + (year / 400);
        return res;
}
}