/**
 * program to find case insensitive anagrams
 */

import java.util.Scanner;

public class Anagram
{
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);

        System.out.println("Enter two strings each in a line");

        String a= scan.nextLine();

        String b=scan.nextLine();

        scan.close();

        boolean ret=isAnagram(a,b);

        System.out.println("The entered strings are ");

        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

    static boolean isAnagram(String a, String b)
    {
        if(a.equals(b))
            return true;

        a=sort(a.toLowerCase());
        b=sort(b.toLowerCase());

       // System.out.println(a+" "+b);

        if(a.equals(b))
            return true;
        else
            return false;
    }
    static String sort(String x)
    {
        char c[] =x.toCharArray();

        for(int i=0;i<c.length;i++)
        {
            for(int j=1;j<c.length-i;j++)
            {
                if(c[j-1]>c[j])
                {
                    char temp=c[j];
                    c[j]=c[j-1];
                    c[j-1]=temp;
                }
            }
        }
        return String.valueOf(c);
    }
}
