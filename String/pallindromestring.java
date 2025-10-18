public class pallindromestring 
{
    public static void main(String[] args) 
    {
        String s = "MADAM";

        boolean result = isPalindrome(s);

        System.out.println("String("+s+") is palindrome ? "+"\n" + result);
    }

    public static boolean isPalindrome(String s) 
    {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) 
        {
            if (s.charAt(i) != s.charAt(j)) 
            {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
