import java.util.Scanner;

public class ex04{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        char[] words = input.toCharArray();
        CountWords(words);
    }

private static void sort(char[] symb, int[] num, int g) {
        int i = 0;
        int tmp = 0;
        int flag = 0;
        char[] symb_tmp = new char[999];
        int[] num_tmp = new int[999];

        for (int a = 0; a < g; a++) {
            i = 0;
            tmp = 0;
            while (i < g) {
                if (num[i] > tmp) {
                    tmp = num[i];
                    flag = i;
                }
                i++;
            }
            symb_tmp[a] = symb[flag];
            num_tmp[a] = num[flag];
            symb[flag] = '\0';
            num[flag] = 0;
        }
}


    public static void CountWords(char[] words)
    {
        char[] symb = new char[65535];
        int[] num = new int[65535];
        int a = 0;
        int c = 0;
        boolean flag;
        for (char i : words)
        {
            a = 0;
            flag = false;
            if (!Character.isAlphabetic(i)) {
                System.err.println("Error");
                System.exit(-1);
            }
            while (symb[a] != '\0'){
                if (symb[a] == i) {
                    flag = true;
                    num[a] += 1;
                    break ;
                }
                a++;
            }
            if (flag == false) {
                c++;
                symb[a] = i;
                num[a] = num[a] + 1;
            }
        }
        sort(symb, num, c);
    }
}

