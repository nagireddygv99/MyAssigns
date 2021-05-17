# MyAssigns / Emp.java

1. From cmd promt :
           You can go directly with the file name as in the file there two classes, 
           Emp class which is having main method and flow starts from there 
2. From IDE :
           It's better to go with two files, change this file in to two 
           each class as file 
  
Working:
The program is to hold one record of employee details like name, age, salary, designation.
        Once you start executing you will be getting
                 
		 1.Create 
                  2.Display
                  3.RaiseSalary
                  4.Exit
For the choices other than 1, 2, 3, 4 ======> you will get Invalid choice

               switch(choice)
	    {
		case 1: e.create();
			records = true;
			break;
		case 2: if(records) e.display();
			else System.out.println("No records found");
			break;
		case 3: if(records) e.salaryRaise();
			else System.out.println("No records found");
			break;
		case 4: System.out.println("Exiting.....");
			break;
		default: System.out.println("Invalid choice....");
			 break;
	    } 


choice 1:
         create method in EmpDetails will be called where you have to enter name, age, salary, designation
  if you made choice again it will replace all the details of previous record
           
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
  
  
  
  
choice 2: 
         display method in EmpDetails will be called if records found....
         you will be displayed all the records in which are recorded
  if there are no records, you will get NoRecords.....
              
	      void display()
               {
                      System.out.println("name : " + name);
                      System.out.println("age : "+ age);
                      System.out.println("salary : " + salary);
                      System.out.println("designation : " + designation);
               }
           
           
           
choice 3:
        if there is any record, salaryRaise() method will be called
        record gets updated.
   if no records are present, No records will be displayed.
   
               void salaryRaise()
               {
                      System.out.println("salary raised");
                      salary = salary + (int)(0.1*salary);
               }
  
  
choice 4:
        it will terminates the loop from the flow, the process ends
        
if the process continues until you give choice 4 in do- while loop as follow.
           
	   do
	   {
	    System.out.print("\n1.Create\n2.Display\n3.SalaryRaise\n4.Exit\nEnter your choice: ");
	    choice = scanner.nextInt();
	    boolean records = false;
	    System.out.println();
	    switch(choice)
	    {
		case 1: e.create();
			records = true;
			break;
		case 2: if(records) e.display();
			else System.out.println("No records found");
			break;
		case 3: if(records) e.salaryRaise();
			else System.out.println("No records found");
			break;
		case 4: System.out.println("Exiting.....");
			break;
		default: System.out.println("Invalid choice....");
			 break;
	    } 
	}while(choice !=4);


# NameDecor.java
Here your code will prints your name which will be taken as input, its as follow
	
	+-------------------------------------+
	|                                     |
	|                                     |
	|                                     |
	|                Your Name goes here  |
	|                                     |
	+-------------------------------------+
	
here goes how its working: fistly The first and last rows goes similar code and the no. of rows are that of fixed, you can vary as well.
and the coloumns are differs as per the input i.e name.

iteration over rows taken first, then the coloumns, 
	first row and last row iteration: for first colomn and last colomn prints "+" , for the remaining colomns prints "-"
		
			if(i == 1 || i == wid)
			{
				for(int j = 1; j <= len; j++)
				{
					System.out.print((j == 1)||(j==len) ? "+" : "-");
					
				}
			}
for but one row of last but one row : this is where the name will prints, for colomns which are lesser to that (no.of colomns-nameoflenth-3) will prints "|" for the first iteration and remaining all will prints " " (a space). and then printing of the name with "  |".

			else if(i == wid-2)
			{
				for(int j = 1; j <= len-name_length-3; j++)
				{
					System.out.print((j == 1) ? "|" : " ");
				}
				System.out.print(name + "  |");
			}
		
finally the remaining all rows, it will print for the first and last iteration with "|", remaining colomns with " "(a space).
			
			else
			{
				for(int j = 1; j <= len; j++)
				{
					System.out.print((j == 1)||(j==len) ? "|" : " ");

				}
			}
for each iteration it will go to new line with an empty print statement
		
		System.out.println();
		
thats how it works, thats the 

# HollowPyramid.java
this code is to print a pyramid which is an empty one i.e only with the outer surface like the below

	    *
	   * *
	  *   *
	 *     *
	*********           

	
	
for this generally we go for nested loop.
first we go for user input with Scanner class by creating the object.
	
			
			Scanner scanner = new Scanner(System.in);
	
	
first loop: this is to print no.of rows in simple 
	
	
			for(int i = 0; i < n; i++)
			{
			}
        
	
inner first loop: for this i choose to print space as per the requirement, here the spaces are in such a manner decreasing from n-1 to 0
	so that the loop will be like as follow
	
			
			for(int j = 0; j < n-i-1; j++)
			{
				System.out.print(" ");
			}
         
	 
inner second loop: here this goes for printing "*" s, 
	 
	 
	 		for(int j = 0; j < 2*i+1; j++)
			{
			}
			
here in this second loop, follows a condition, if it's at first or last iteration of outer loop it will print as usual
			
			
				if(i == 0 || i == n-1) 
				{
					System.out.print("*");
				}
				
				
else, again another condition follws like, if its its first or last iteration of its inner loop, then it will print "*", else, will print an space.
				
				
				else
				{
					if(j == 0 || j == 2*i) System.out.print("*");
					else System.out.print(" ");
				}
				
				
thats all it completes.
