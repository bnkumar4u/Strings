import java.util.Scanner;

public class SubStringCompare
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a String");

        String s=scan.nextLine();

        System.out.println("Enter length of substring");

        int k=scan.nextInt();

        String min=new String();
        String max=new String();
        String temp=new String();

        min=max=temp=s.substring(0,k);

        for (int i=1;i+k<=s.length() ;i++)
        {
            temp=s.substring(i,i+k);

            if (temp.compareTo(min)<0)
            {
                min=temp;
            }
            if (temp.compareTo(max)>0)
            {
                max=temp;
            }
        }

        System.out.println("The first substring of length "+k+" in dictionary order is \n"+min);
        System.out.println("The last substring of length "+k+" in dictionary order is \n"+max);
    }
}
