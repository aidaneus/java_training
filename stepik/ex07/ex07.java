public class ex07{
    public static void main(String[] args){
        boolean res;

        res = isPalindrome("Madam, I'm Adam!");
        System.out.println(res);
        res = isPalindrome("Hello");
        System.out.println(res);
    }

    public static boolean isPalindrome(String text) {
        String newString = text.replaceAll("[^a-zA-Z0-9]","");
        StringBuilder sb_newString = new StringBuilder(newString);
        boolean fin = newString.equalsIgnoreCase(sb_newString.reverse().toString());
        return fin;
    }
}