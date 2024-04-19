import java.util.Scanner;
class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the range of the series:  ");
		int n = sc.nextInt();

		for(int i = 1; i <= n; i++)
		{
			System.out.println(i*i+" ");
		}
	}
}