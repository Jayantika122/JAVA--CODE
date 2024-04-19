import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	int seq = 1;
	Scanner sc  = new Scanner(System.in);

	System.out.print("Enter the length of the sequence : ");

	int n = sc.nextInt();
	System.out.print(seq);
	for(int i = 1; i < n; i++)
		{
		seq *= 2;
		
		
		System.out.println("sequence " +seq);
	}
	
	}
}