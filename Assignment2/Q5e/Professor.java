
public class Professor extends Employee{
	private String field;
	
	public Professor(String name, int hours, String field) {
		super(name, hours);
		this.setField(field);
	}

	@Override
	public double calculateSalary() {
		return super.getHours() * 30;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}
}
