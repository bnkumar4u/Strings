import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * best inputs are
 * 3
 *([A-Z])(.+)
 *[AZ[a-z](a-z)
 *batcatpat(nat
 */

public class PatternSyntaxChecker
{
    public static void main(String[] args)
    {
        String pattern;

        Scanner scan =new Scanner(System.in);

        System.out.println("Enter no of text cases");

        int testCases=scan.nextInt();

        scan.nextLine();

        for (int i=0;i<testCases; i++)
        {
            System.out.println("Enter a pattern");

            pattern=scan.nextLine();

           try
           {
               Pattern p = Pattern.compile(pattern);

               System.out.println("Yes, It is a Valid pattern");
           }
           catch (PatternSyntaxException e)
           {
               System.out.println("No, It's not a valid pattern");
           }
        }



    }
}
