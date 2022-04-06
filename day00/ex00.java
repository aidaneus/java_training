public class ex00 {
    public static void main(String[] args) {
        int num = 479598;
        int sum = 0;
        while (sum != 42)
        {
            sum += num % 10;
             num /= 10;
         }
        System.out.println(sum);
    }
}
