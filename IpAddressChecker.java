import java.util.Scanner;

public class IpAddressChecker
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("This program is to find whether a ip address is correct or wrong");

         do
        {

            System.out.println("Enter an IP address ( EXIT TO STOP )");

            String IP =scan.next();

            if(IP.equalsIgnoreCase("exit"))
                break;

            if (IP.matches(new MyRegex().pattern))
            {
                System.out.println("Ip address ia a valid number");
            }
            else
                System.out.println("Invalid Ip address");


        } while (scan.hasNext());


    }
}
class MyRegex
{
//    String pattern="([0-2]([0-5]?){2}.){3}[0-2]([0-5]?){2}";

    String pattern="(([0-9]|([0-9][0-9])|([0-1][0-9][0-9])|(2[0-4][0-9])|(25[0-5])).){3}([0-9]|([0-9][0-9])|([0-1][0-9][0-9])|(2[0-4][0-9])|(25[0-5]))";

}
