public class Palindrom {
    public static void main(String[] args)
    {
        String[] tests = {"1221", "1234", "1", "11", "121", "122", null};
        for (String test : tests)
        {
            System.out.println(isPalindrom(test));
        }
    }

    public static boolean isPalindrom(String value) throws NullPointerException
    {
        if (value == null) throw new NullPointerException("value cannot be null");
        char[] charsValue = value.toCharArray();
        for (int i = 0, j  = charsValue.length-1; j >= i; ++i, --j)
        {
            if (charsValue[i] != charsValue[j]) return false;
        }
        return true;
    }

}
