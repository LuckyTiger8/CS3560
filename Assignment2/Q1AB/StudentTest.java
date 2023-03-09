
public class StudentTest {
	public static void main(String[] args) {
		Student john = new Student("John", "CS", 3.5);
		Student mary = new Student();
		
		mary.setName("Mary Ann");
		mary.setMajor("CE");
		mary.setGpa(3.3);
		
		
		System.out.println(john.toString());
		System.out.println(mary.toString());
	}
}

