import java.util.Scanner;

public class ex03{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int res = 0;
        int WeekNum = 1;

        for (;WeekNum < 18;WeekNum++)
        {
            String WeekDay = scanner.next();
            if (WeekDay.equals("42"))
                break;
            int WeekNumInput = scanner.nextInt();
            if (WeekNumInput != WeekNum) {
                System.err.println("IllegalArgument");
                System.exit(-1);
            }
            res = FindMinNum(res, scanner);
        }
        PrintStatistic(res, WeekNum);
    }

    public static void PrintStatistic(int res, int WeekNum)
    {
        int tmp;
        int i = 1;
        int num = 0;

        while (res != 0)
        {
            tmp = res % 10;
            res /= 10;
            num = (num * 10) + tmp;
        }
        tmp = 0;
        while (WeekNum > i)
        {
            tmp = num % 10;
            System.out.print("Week" + " " + i + " ");
            tmp = num % 10;
            while (tmp > 0) {
                System.out.print("=");
                tmp--;
            }
            System.out.println(">");
            num /= 10;
            i++;
        }
    }

    public static int FindMinNum(int res, Scanner scanner){
        int tmp;
        int min = 9;

        for (int num = 0;num < 5; num++)
        {
            tmp = scanner.nextInt();
            if (tmp < min)
                min = tmp;
        }
        res = (res * 10) + min;
        return (res);
    }
}