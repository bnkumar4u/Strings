import java.util.Scanner;

public class SubString
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter a string");

        String s=scan.next();

        System.out.println("enter start and end points of substring");

        int start=scan.nextInt();
        int end =scan.nextInt();
        System.out.println("the substring is");

        System.out.println(s.substring(start,end));
    }
}
