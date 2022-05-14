public class ex04{
    public static void main(String [] args){
        int res = 0;

        res = flipBit(0, 1);
        System.out.println(res);
        res = flipBit(13, 1);
        System.out.println(res);
        res = flipBit(13, 2);
        System.out.println(res);
    }
    public static int flipBit(int value, int bitIndex) {
        return value ^ (1 << (bitIndex - 1));
    }
}