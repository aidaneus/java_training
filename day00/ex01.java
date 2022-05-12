import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        boolean is_num = true;
        int count = 0;
        int exit_num = 0;
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input <= 1){
            exit_num = putIllegalArgument();
        }
        else {
            for (int num = 2; num < input; num++) {
                count++;
                if (input % num == 0) {
                    is_num = false;
                    System.out.println(is_num + " " + count);
                    break ;
                }
            }
            if (is_num == true) {
                count = mySqrt(input);
                System.out.println(is_num + " " + count);
            }
        }
        System.exit(exit_num);
    }

    private static int mySqrt(int input){
        int start = 0;
        int res = 0;

        while (res < input){
            start++;
            res = start * start;
        }
        return(start - 1);
    }

    private static int putIllegalArgument() {
        System.err.println("Illegal Argument");
        return (-1);
    }
}