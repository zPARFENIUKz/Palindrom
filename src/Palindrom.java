import java.util.*;

public class Palindrom {
    public static void main(String[] args)
    {
        String[] tests = {"1221", "1234", "1", "11", "121", "122", null};
        for (String test : tests)
        {
            System.out.println(isPalindrom(test));
        }

    }

    public static boolean isPalindrom(final String value) throws NullPointerException
    {
        if (value == null) throw new NullPointerException("value cannot be null");
        final List<Character> charsValue = Collections.unmodifiableList(value.chars().mapToObj(e -> (char) e).toList());
        final int size = charsValue.size() - 1;
        for (int i = 0; size - i >= i; ++i)
        {
            if (charsValue.get(i) != charsValue.get(size - i)) return false;
        }
        return true;
    }
}
