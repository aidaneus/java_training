import java.util.Scanner;

public class ex03{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int res = 0;
        int WeekNum = 1;

        for (;WeekNum < 18;WeekNum++){
            String WeekDay = scanner.next();
            if (WeekDay.equals("42"))
                break;
            if (!(WeekDay.equals("Week")))
                ExitError();
            int WeekNumInput = scanner.nextInt();
            if (WeekNumInput != WeekNum)
                ExitError();
            if ((res = FindMinNum(res, scanner)) == -1)
                ExitError();
        }
        PrintStatistic(res, WeekNum);
    }

    public static int MoveNum(int res){
        int num = 0;
        int tmp;

        while (res != 0){
            tmp = res % 10;
            res /= 10;
            num = (num * 10) + tmp;
        }
        return (num);
    }

    public static void PrintStatistic(int res, int WeekNum){
        int tmp = 0;
        int i = 1;
        int num = 0;

        num = MoveNum(res);
        while (WeekNum > i){
            tmp = num % 10;
            System.out.print("Week" + " " + i + " ");
            tmp = num % 10;
            while (tmp > 0){
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

        for (int num = 0;num < 5; num++){
            tmp = scanner.nextInt();
            if (tmp < 1 || tmp > 9)
                return (-1);
            if (tmp < min)
                min = tmp;
        }
        res = (res * 10) + min;
        return (res);
    }

    public static void ExitError(){
        System.err.println("IllegalArgument");
        System.exit(-1);
    }
}