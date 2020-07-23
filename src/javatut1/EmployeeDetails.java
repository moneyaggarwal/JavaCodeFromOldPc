package javatut1;

public class EmployeeDetails {
public EmployeeDetails(String name, int age, String gender, String emailid, boolean isAvailable) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.emailid = emailid;
		this.isAvailable = isAvailable;
		System.out.println("constructor called");
	}
String name;
int age;
String gender;
String emailid;
boolean isAvailable;
//@override
public String toString() {
	return (name+ " "+age+" "+gender+ " " +emailid+ " "+isAvailable);
}
final void Changedetails()
{
	name= name+"singh";
	age=age+10;
	System.out.println(name+" "+age+" "+gender+ " " +emailid+ " "+isAvailable);
}
final void Changedetails(int ag)
{
}
}
