import java.util.Scanner;
import java.util.ArrayList;

abstract class Employee {
	String name, desig;
	int age, sal;
	public Employee() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("\nenter your name: ");
		name = scanner.next();
		System.out.print("\nenter your age: ");
		age = scanner.nextInt();	
	}
	public String toString() {
		return "\n\n---------------------------\nName: "+ name + "\nAge: " + age + "\nSalary: " + sal + "\nDesignation: " + desig +"\n----------------------------";
	}
	public abstract void raiseSalary();
}
final class Clerk extends Employee {
	public Clerk() {
		desig = "Clerk";
		sal = 20000;
	}
	public void raiseSalary() {
		sal += 1000;
	}
	
}
final class Manager extends Employee {
	public Manager() {
		desig = "Manager";
		sal = 30000;
	}
	public void raiseSalary() {
		sal += 2000;
	}
}
final class Programmer extends Employee {
	public Programmer() {
		desig = "Programmer";
		sal = 40000;
	}
	public void raiseSalary() {
		sal += 3000;
	}
}
public class DataEntry {	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Employee> employee = new ArrayList<Employee>();
		int outerMenuChoice = 0, innerMenuChoice = 0;
		do {
			System.out.print("\n\n1.CREATE\n2.DISPLAY\n3.RAISESALARY\n4.EXIT\nENTER YOUR CHOICE: ");
			scanner = new Scanner(System.in);
			outerMenuChoice = scanner.nextInt();
			switch(outerMenuChoice) {
				case 1: {
					do {
					System.out.print("\n\n1.CLERK\n2.MANAGER\n3.PROGRAMMER\n4.EXIT\nENTER YOUR CHOICE: ");
					innerMenuChoice = scanner.nextInt();
					Employee emp = null;
					switch(innerMenuChoice) {
						case 1: //employee.add(new Clerk());
								emp = new Clerk();
								break;
						case 2: emp = new Manager();
							    break;
						case 3: emp = new Programmer();
								break;
						case 4: break;
						default: System.out.print("\n\ninvalid entry...!");
						        break;
					}
					if(innerMenuChoice == 1 || innerMenuChoice == 2 || innerMenuChoice == 3) {
						boolean existing = false;
						for( Employee k : employee) {
							if(k.name.equals(emp.name) && k.age == emp.age) {
								System.out.print("\nRecord already exists...");
								existing = true;
								break;
							}
						}
						if(!existing) employee.add(emp);
					}
					} while(innerMenuChoice != 4);
					break;
				}
				case 2: {
					if(employee.size() == 0) {
						System.out.print("\n\nNorecords found.....?");
						break;
					}
					for(Employee e:employee) System.out.print(e);
					break;
				}
				case 3: {
					if(employee.size() == 0) {
						System.out.print("\n\nNorecords found.....?");
						break;
					}
					for(Employee e:employee) e.raiseSalary();
					System.out.print("\n\nSalary raised...");
					break;
				}
				case 4: System.out.print("\nExiting....!");
						break;
				default: System.out.print("\nInvalid choice....$");
				
			}
		} while(outerMenuChoice != 4);
		scanner.close();
	}
}