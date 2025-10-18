public class consecutivedollar 
{
    public static void main(String[] args) 
    {
        String s="bossss";
        String res = "";
        int Count = 0;

        for (int i = 0; i < s.length(); i++) 
        {
            if (i > 0 && s.charAt(i) == s.charAt(i - 1)) // checks consecutive
            {
                Count++;
                if (Count % 2 != 0) //count is odd then we puts $
                {
                    res += "$"; //appends $ to r
                } 
                else 
                {
                    res+= s.charAt(i);
                }
            } 
            else 
            {
                res += s.charAt(i);
                Count = 0;
            }
        }

        System.out.println("Output: " + res);
    }
}
