package selectionStatement;

public class Nested_if_else_Statement 
{

	public static void main(String[] args)
	{
	
		if(5<8)
		{
			if(9<7)
			{
			   System.out.println("Statement 1");
			}
			else
			{
				System.out.println("Statement 2");
			}
		}
		else
		{
			if(3<5)
			{
				System.out.println("Statement 3");
			}
			else
			{
				System.out.println("Statement 4");
			}
		}
	}

}
