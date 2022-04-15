import java.util.Scanner;

public class ex04{
    public static void main(String[] args){
        char[] symb = new char[999];
        int[] num = new int[999];
        int i;
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        char[] words = input.toCharArray();
        i = CountLetters(symb, num, words);
        sort(symb, num, i);
    }

   public static void SortByAlphabet(char[] symb, int[] num, int g)
    {
        int i;
        int j = 0;
        char [] char_tmp = new char[999];

        for(int l = 0; l < g; l++){
            i = 0;
            while(i < g) {
                if (num[l] == num[i]) {
                    if (symb[l] < symb[i]) {
                        char_tmp[j] = symb[l];
                        symb[l] = symb[i];
                        symb[i] = char_tmp[j];
                        j++;
                    }
                }
                i++;
            }
        }
    }

public static void sort(char[] symb, int[] num, int g) {
        int i;
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
        symb = symb_tmp;
        num = num_tmp;
        SortByAlphabet(symb, num, g);
        for(int a = 0;a < g;a++)
            System.out.println(symb[a]);
}

    public static int CountLetters(char[] symb, int[] num, char[] words)
    {
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
        return (c);
    }
}
