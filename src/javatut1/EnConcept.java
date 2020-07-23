package javatut1;

public class EnConcept {

	private String username;
	private String pwd;
	private int salary;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		if (salary<=0) {
			//System.out.println("set salary as positive");
			try {
				throw new Exception("salary negative");
			}catch(Exception e) {System.out.println(e.getMessage());
		} 
			System.exit(0);
		}
		this.salary = salary;
	}
	
}
