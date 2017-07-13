

import java.util.Scanner;


public class StringIntro
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		String name1,name2;

		System.out.println("Enter any two names");

		name1 =scan.next();
		name2 =scan.next();

		System.out.println("Sum of there lengths is");

		System.out.println(name1.length()+name2.length());

		int compare =name1.compareTo(name2);

		if(compare>=0)
		    System.out.println("YES");
		else
		    System.out.println("NO");

		name1= name1.substring(0,1).toUpperCase()+name1.substring(1);

		name2=name2.substring(0,1).toUpperCase()+name2.substring(1);

		System.out.println(name1+" "+name2);


	}
}