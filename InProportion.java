import java.util.Scanner;
public class InProportion
{ 
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter a nonzero integer: ");
		int a = sc.nextInt();	
		System.out.print("Enter a nonzero integer: ");
		int b = sc.nextInt();	
		System.out.print("Enter a nonzero integer: ");
		int c = sc.nextInt();
		System.out.print("Enter a nonzero integer: ");
		int d = sc.nextInt();
		
		if (d==0 || b==0)
		{
			
		System.out.println("The computation cannot be completed");
		
		}
		else
		{
			if (a*d == c*b)
			{
			 System.out.println("Yes " + a +", " + b +", " + c +  " and " + d + " are in proportion")	;
			}
			else
			{
				System.out.println("No they are not in proportion");
			}
		}
	}
}