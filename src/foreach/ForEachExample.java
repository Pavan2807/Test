package foreach;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();

		empList.add(new Employee("Pavan", 26));
		empList.add(new Employee("Sandeep", 24));

		// using Extended For Loop
		for (Employee emp : empList) {
			System.out.println(emp);
		}

		System.out.println("============");
		empList.forEach((emp) -> System.out.println(emp));
		System.out.println("============");

		empList.stream().forEach((emp) -> System.out.println(emp));

	}

}

class Employee {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}

}
