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

        
        
        
        
        
         
