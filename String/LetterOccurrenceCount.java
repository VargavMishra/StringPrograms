public class LetterOccurrenceCount 
{
    public static void main(String[] args) 
    {
        String s = "ramana kumar";

        for (int i = 0; i < s.length(); i++) 
        {
            char ch = s.charAt(i);

            if (ch>=0&&ch<=9) 
            {
                System.out.print(" ");
                continue;
            }

            int count = 0;
            for (int j = 0; j <= i; j++) 
            {
                if (s.charAt(j) == ch) 
                {
                    count++;
                }
            }

            if (count == 1) 
            {
                System.out.print(ch);
            } else 
            {
                System.out.print(count);
            }
        }
    }
}
