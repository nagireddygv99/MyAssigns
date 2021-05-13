import java.util.Scanner;
class EmpDetails
{
    String name, designation;
    int age, salary;
    void create()
    {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter your name:");
	name = scanner.next();
	System.out.println("Enter age:");
	age = scanner.nextInt();
	System.out.println("Enter salary");
	salary = scanner.nextInt();
	System.out.println("Enter your designation:");
	designation = scanner.next();
    }
    void display()
    {
	System.out.println("name : " + name);
	System.out.println("age : "+ age);
	System.out.println("salary : " + salary);
	System.out.println("designation : " + designation);
    }
    void salaryRaise()
    {
	System.out.println("salary raised");
	salary = salary + (int)(0.1*salary);
    }
}

public class Emp
{

    public static void main(String[] args)
    {
	int choice = 0;
	EmpDetails e = new EmpDetails();
	boolean records = false;
	Scanner scanner = new Scanner(System.in);
	do
	{
	    System.out.print("\n1.Create\n2.Display\n3.SalaryRaise\n4.Exit\nEnter your choice: ");
	    choice = scanner.nextInt();
	    switch(choice)
	    {
		case 1: e.create();
			records = true;
			break;
		case 2: if(records) e.display();
			else System.out.println("\nNo records found");
			break;
		case 3: if(records) e.salaryRaise();
			else System.out.println("\nNo records found");
			break;
		case 4: System.out.println("\nExiting.....");
			break;
		default: System.out.println("\nInvalid choice....");
			 break;
	    } 
	}while(choice !=4);
	
        
    }
}