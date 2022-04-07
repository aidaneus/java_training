import java.util.Scanner;

public class ex02{
    public static void main(String[] args){
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int coffee_request = 0;

        while (input != 42){
            sum = IsSum(input);
            if (IsPrime(sum) == 1) {
                coffee_request += 1;
            }
            input = scanner.nextInt();
        }
        System.out.println("Count of coffee-request - " + coffee_request);
    }

    public static int IsSum(int input)
    {
        int res = 0;
        int mid = 0;

        while (input != 0){
            mid = input % 10;
            input /= 10;
            res += mid;
        }
        return(res);
    }

    public static int IsPrime(int sum) {
            for (int num = 2; num < sum; num++) {
                if (sum % num == 0)
                    return(0);
            }
            if (sum == 1 || sum <= 0)
                return(0);
            return(1);
        }
}