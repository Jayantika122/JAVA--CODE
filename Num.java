import java.util.Scanner;
class Num
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0 , b= 0;
		if(n%2 == 0)
		{
			for(int i=1; i<= (n-2); i=i+2)
			{
				a = a+2;
				b = a/2;
			}
				System.out.println(b);
		}
		else
		{
			for(int i = 1; i < (n-2); i = i+2)
			{
				a = a+2;
				b = a/2;
			}
				a = a+2;
				System.out.println(a);
			}
		}
}