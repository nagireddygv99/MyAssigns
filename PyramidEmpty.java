import java.util.Scanner;
public class PyramidEmpty
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n-i-1; j++)
			{
				System.out.print(" ");
			}
			for(int j = 0; j < 2*i+1; j++)
			{
				if(i == 0 || i == n-1) 
				{
					System.out.print("*");
				}
				else
				{
					if(j == 0 || j == 2*i) System.out.print("*");
					else System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
