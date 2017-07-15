import java.util.Scanner;

public class StringTokens
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any string");

        String s= scan.nextLine();

        scan.close();

        int tokens =0;

        char c[] =s.toCharArray();

        for(int i=0; i<c.length ;i++)
        {
            if((c[i]>='a'&&c[i]<='z')|| (c[i]>='A'&&c[i]<='Z'))
            {
                tokens++;

                if(i<c.length-1)
                {
                    i++;
                    while(c[i]>='a'&&c[i]<='z'|| (c[i]>='A'&&c[i]<='Z'))
                    {
                        if (i<c.length-1)
                            i++;
                        else
                        {
                            i++;
                            break;
                        }
                    }
                    i--;
                }
                else break;
            }
        }
        System.out.println("Number of tokens/alpha-words in the entered data are");

        System.out.println(tokens);

        System.out.println("And the tokens are listed below ");

        for(int i=0; i<c.length ;i++)
        {
            if((c[i]>='a'&&c[i]<='z')|| (c[i]>='A'&&c[i]<='Z'))
            {
                System.out.print(c[i]);

                if(i<c.length-1)
                {
                    i++;
                    while(c[i]>='a'&&c[i]<='z'|| (c[i]>='A'&&c[i]<='Z'))
                    {
                        System.out.print(c[i]);
                        if (i<c.length-1)
                            i++;
                        else
                        {
                            i++;
                            break;
                        }
                    }
                    System.out.println();
                    i--;
                }
                else break;
            }

        }
    }
}
