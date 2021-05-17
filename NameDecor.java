import java.util.Scanner;
public class NameDecor
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("\nenter name : ");
		
		String name = scanner.nextLine();
		int name_length = name.length();
		int len = name_length+20, wid = 7;
		
		for(int i = 1; i <= wid; i++)
		{
			if(i == 1 || i == wid)
			{
				for(int j = 1; j <= len; j++)
				{
					System.out.print((j == 1)||(j==len) ? "+" : "-");
					
				}
			}
			else if(i == wid-2)
			{
				for(int j = 1; j <= len-name_length-3; j++)
				{
					System.out.print((j == 1) ? "|" : " ");
				}
				System.out.print(name + "  |");
			}
			else
			{
				for(int j = 1; j <= len; j++)
				{
					System.out.print((j == 1)||(j==len) ? "|" : " ");

				}
			}
			System.out.println();
		}
	}
}