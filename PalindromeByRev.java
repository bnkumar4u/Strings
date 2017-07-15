/**
*Palindrome
*/

import java.util.Scanner;

public class PalindromeByRev
{
    public static void main(String[] args)
    {
        Scanner scan =new Scanner(System.in);

        System.out.println("enter a String");

        String B=scan.nextLine();

        StringBuffer A= new StringBuffer(B);

        System.out.println("checking palindrome");

        if(B.equals(A.reverse().toString()))
        {
            System.out.println("Yes");
        }
        else
            System.out.println("No");

    }
}
