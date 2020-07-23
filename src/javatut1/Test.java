package javatut1;

public class Test {

	
	public static void main(String[] args) {
		//constructor concept calling employeedetails class
		
		/*EmployeeDetails emp= new EmployeeDetails("ab",23,"male","ab@gmail.com",true);
		emp.Changedetails();
		System.out.println(emp);*/
		
		//encapsulation concept
		/*EnConcept ec=new EnConcept();
		ec.setUsername("abc");
		ec.setPwd("123");
		ec.setSalary(-1000);
		System.out.println(ec.getUsername());
		System.out.println(ec.getSalary());
		ec.getPwd();*/
 
		//abstarction concept
		/*AbstractConceptShape acs=new Circle("Red",12);
		System.out.println(acs);*/
		
		//interface concept
		/*Smartworker sw=new Smartworker();
		Lazyworker lw=new Lazyworker();
		Manager mn=new Manager();
		mn.manageworks(sw);
		Manager mn1=new Manager();
		mn1.manageworks(lw);*/
		int a=20;
		System.out.println(a);
		
	}

}
class Test1 extends Test
{
	public static void main(String args[])
	{
		int i=10;
		System.out.println(i);
	}
}
