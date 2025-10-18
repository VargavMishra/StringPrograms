// import java.util.Scanner;
public class reverse 
{
    public static void main(String[] args) 
    {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the String you want to reverse: ");
        // String s=sc.nextLine();
        String s="DOG";
        String rev="";
        System.out.println(s.length());
        for(int i=s.length()-1;i>=0;i--) //i=2 2>=0 i=1 1>=0 0>=0
        {
            char ch=s.charAt(i); // ch=s.charAt(2)--G charAt(1)--O  charAt(0)--D
            rev+=ch; //rev=""+G-- rev=G   rev=G+O   rev=GO+D

        }
        System.out.println(rev); //rev=GOD   
    }    
}
