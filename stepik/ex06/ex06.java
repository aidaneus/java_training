public class ex06{
    public static void main(String[] args){
        boolean res;

        res = isPowerOfTwo(64);
        System.out.println(res);
        res = isPowerOfTwo(56);
        System.out.println(res);
        res = isPowerOfTwo(-100);
        System.out.println(res);
    }
    public static boolean isPowerOfTwo(int value) {
        int a = 2;
        value = Math.abs(value);
        while (a < value){
            a *= 2;
        }
        if (value == 1)
            return true;
        return value == a ? true : false;
    }
}