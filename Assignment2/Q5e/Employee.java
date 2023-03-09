
public class Employee {
	private String name;
	private int hours;

	public Employee(String name, int hours) {
		this.setName(name);
		this.hours = hours;
	}
	
	public double calculateSalary() {
		return hours * 20;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}
}
