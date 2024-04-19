import java.util.Scanner;
class Sum
{
	public static void main(String args[])
	{
		int s = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number from ");
		int i = sc.nextInt();
		System.out.print("Enter the number upto ");
		int n = sc.nextInt(); 
		for(i = 1; i < n ; i++)
		{
		   s = s + i;
		   i++;
		}
			System.out.println("the result is "+ s);
	}
}