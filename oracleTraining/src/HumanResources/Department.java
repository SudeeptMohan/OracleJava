package HumanResources;

public class Department {
		private String name;
		private Employee[] e  = new Employee[10];
			
		public Department (String name) {
			this.name = name;
		}
		public String getName() {
			
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public Employee [] getEmployee() {
			return e;
		}
		
		public String toString() {
			return name;
		}
		
		public int numberEmployee() {
			return e.length;
		}
		
		public Employee checkEmployee(int empId) {
			 
			for (Employee emp : e)
			{	if (emp == null)
				break;
					if (emp.getId() == empId)
						return emp;
			}
			return null;
		}	
		
		int i=0;
		int flag = 0;
		public void addItems(Employee[] e) {
			
			flag++;
			
			if (e.length > this.e.length){
				//System.out.println(e.length+" "+this.e.length);
				System.out.println("Number of employees exceeds 10 in one deparetment!!!");
				}
			if (flag ==1)
				{
					for (;i<e.length;i++)
					this.e[i] = e[i];
					//System.out.print(" "+ (this.e[i].getName()));
				}
								
			
				if (flag>1)
				{ 
					for (int k=0;(i-1)<this.e.length ;i++)
					{
						//		System.out.println("inside for loop");
						this.e[i-1] = e[k];
						//System.out.println("k is "+k);
				
					}
				}
		}
	
		public double totalSalary(Employee [] e) {
			double sal=0;
			if (e == null)
				return sal;
			for (Employee emp : e)
			{	if (emp == null)
				break;
				sal = sal + emp.getSalary();
				
			}
			return sal;
		}
		
		public double averageSalary (Employee [] e) {
			double avg = 0;
			if (e.length == 0)
			return avg;
			avg = totalSalary(e)/e.length;
			return avg;
		}
		
		public int returnNotNull() {
			int i = 0;
			for (Employee s : this.e) {
				if (s==null)
					break;
				if (s.getName() != null)
				i++;
			}
			
			return i;
		}
		
		public Employee[] noNullValues()
		{
			Employee [] noNull = new Employee[10];
			int i=0;
				for (Employee a :e) {
					if (a == null)
						break;
					if (a.getName() != null) {
						noNull[i] = a;
						i++;
				}
					
			}
			return noNull;
		}
}