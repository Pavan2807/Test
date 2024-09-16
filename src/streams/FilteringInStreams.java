package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringInStreams {
	public static void main(String[] args) {

		List<Employee> emps = getEmployees().stream().filter((employee) -> employee.getAge() < 40)
				.collect(Collectors.toList());

		emps.forEach((a) -> System.out.println(a.getName()));
	}

	public static List<Employee> getEmployees() {
		List<Employee> empList = new ArrayList<>();

		empList.add(new Employee("Pavan", 26));
		empList.add(new Employee("Sandeep", 24));
		empList.add(new Employee("Ram", 53));

		return empList;
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