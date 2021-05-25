package HumanResources;

public class HRApp {

	public static void main(String[] args) {
		System.out.println("The application is starting ...");
		

		Department d = new Department("IT");
		System.out.println(d.toString());
		
		
		
		Employee [] e = new Employee[10];
		Employee [] e1 = new Employee[10];
		
		Employee a1 = new Employee (1,"AAM",1000);
		Employee a2 = new Employee (2,"SAM",1000);
		Employee a3 = new Employee (3,"PAM",1000);
		Employee a4 = new Employee (4,"QAM",1000);

		Employee a5 = new Employee (5,null,1000);
		Employee a6 = new Employee (6,"EAM",1000);
		Employee a7 = new Employee (7,null,1000);
		Employee a8 = new Employee (8,"TAM",1000);
		
		Employee a9 = new Employee (9,"UAM",1000);
		Employee a10 = new Employee (10,"VAM",1000);
		//Employee a11 = new Employee (11,"NAM",1000);
		Employee a12 = new Employee (12,"MAM",1000);
		
		e1[0] = a1;
		e1[1] = a2;
		e1[2] = a3;
		e1[3] = a4;
		e1[4] = a5;
		e1[5] = a6;
		e1[6] = a7;
		e1[7] = a8;
		e1[8] = a9;	
		e[0] = a10;
		//e[1] = a11;
		//e[2] = a12;
		d.addItems(e1);		//add an array of employees to a department
		d.addItems(e);
		//print list of employees in a department
		e=d.getEmployee();	
		System.out.println("This is the list of employee in department "+d.getName());
		for (Employee e3 : e)
		{
			if (e3 == null)
				break;
				System.out.println(e3.getId()+" "+e3.getName()+" "+e3.getSalary());
		}
		
		System.out.println("Number of elements that are not null in "+d.getName()+" "+d.returnNotNull() );
		
		//check if an employee exists in a department
		a12=d.checkEmployee(30);
		if (a12==null){
			System.out.println("Employee doesn't exist");
		}
		else
			{
				System.out.println("Employee "+a12.getName()+" with employee id "+a12.getId()+" exists");
				System.out.println("Here is the complete record for the employee "+a12.getId()+" "+a12.getName()+" "+a12.getSalary());
			}
		
		//print an array with no null values
		Employee[] e4 ;
		e4 = d.noNullValues();
		for (Employee a : e4)
		{
			if (a == null)
				break;
				System.out.println(a.getId()+" "+a.getName()+" "+a.getSalary());
		}
		//Code to print salaries
		System.out.println("total salary in department "+d.getName()+" is "+d.totalSalary(e1));
		System.out.println("average salary of department "+ d.getName()+" is "+d.averageSalary(e1));
	}

}