package selectionStatement;

import java.util.Scanner;
public class Simple_If_Statement 
{

	public static void main(String[] args)
	{

		int a,b;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter two number: ");
		a=obj.nextInt();
		b=obj.nextInt();
		
		if(a>b)
		{
			System.out.println(a+" is greater than "+b);
			System.out.println("The greater number is: "+a);	
		}
		System.out.println("If statement end!!");
		obj.close();

	}

}
