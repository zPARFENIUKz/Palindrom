import java.util.*;
import java.util.stream.Collectors;

public class Palindrom {
    public static void main(String[] args)
    {
        String tst = "";
        for (int i = 0; i < 100000; ++i) {
            tst += (int) (Math.random() * 9);
        }
        tst += reverseString(tst);
        long startTime = System.nanoTime();
        System.out.println(isPalindrom(tst));
        long elapsedTime_1 = System.nanoTime() - startTime;
        System.out.println("Время выполнения скрипта с j variable: " + elapsedTime_1/1000000);
        startTime = System.nanoTime();
        System.out.println(isPalindromWithoutJ(tst));
        long elapsedTime_2 = System.nanoTime() - startTime;
        System.out.println("Время выполнения скрипта без j variable: " + elapsedTime_2/1000000);
        /*
        String[] tests = {"1221", "1234", "1", "11", "121", "122", null};
        for (String test : tests)
        {
            System.out.println(isPalindrom(test));
            System.out.println(isPalindromWithoutJ(test));
        }
         */

    }

    public static boolean isPalindrom(final String value) throws NullPointerException
    {
        if (value == null) throw new NullPointerException("value cannot be null");
        final List<Character> charsValue = Collections.unmodifiableList(value.chars().mapToObj(e -> (char)e).collect(Collectors.toList()));
        for (int i = 0, j  = charsValue.size()-1; j >= i; ++i, --j)
        {
            if (charsValue.get(i) != charsValue.get(j)) return false;
        }
        return true;
    }

    public static boolean isPalindromWithoutJ(final String value) throws NullPointerException
    {
        if (value == null) throw new NullPointerException("value cannot be null");
        final List<Character> charsValue = Collections.unmodifiableList(value.chars().mapToObj(e -> (char) e).collect(Collectors.toList()));
        for (int i = 0; charsValue.size() - 1 - i >= i; ++i)
        {
            if (charsValue.get(i) != charsValue.get(charsValue.size() - 1 - i)) return false;
        }
        return true;
    }

    private static String reverseString(String str) throws NullPointerException
    {
        if (str == null) throw new NullPointerException("str can't be null");
        char[] chars = str.toCharArray();
        for (int i = 0; chars.length-1-i > i; ++i)
        {
            swap(chars, i, chars.length-1-i);
        }
        return new String(chars);
    }

    private static void swap(char[] chars, int index_1, int index_2)
    {
        char buf = chars[index_1];
        chars[index_1] = chars[index_2];
        chars[index_2] = buf;
    }
}
