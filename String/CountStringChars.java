// import java.util.Scanner;
public class CountStringChars 
{
    public static void main(String[] args) 
    {
        // Scanner sc1 = new Scanner(System.in);
        // System.out.println("Enter String :- ");
        // String s=sc1.nextLine();

        String s="Jspiders@#123";
        int uc=0;
        int lc=0;
        int nc=0;
        int sc=0;
        System.out.println("String is :- "+s);
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            
            //For UpperCase Characters
            if(ch>='A'&&ch<='Z')
            {
                uc++;
            }
            //For LowerCase Characters
            else if(ch>='a'&&ch<='z')
            {
                lc++;
            }
            //For Number Characters
            else if(ch>='0'&&ch<='9')
            {
                nc++;
            }
            //For Special Characters
            else sc++;
        }
        System.out.println("upper case: "+uc+"\n"+"Lower Case: "+lc+"\n"+"Number Chars: "+nc+"\n"+"Special Chars: "+sc);
    }
    
}
