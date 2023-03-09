
public class Staff extends Employee{
	private int role;
	public Staff(String name, int hours, int role) {
		super(name, hours);
		this.setRole(role);
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	
}
