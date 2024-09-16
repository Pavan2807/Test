package comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();

		empList.add(new Employee("Pavan", 26));
		empList.add(new Employee("Sandeep", 24));
		empList.add(new Employee("Kumarr", 22));
		empList.add(new Employee("Reddy", 14));

		Collections.sort(empList, new sortEmployeeByAge());

		System.out.println(empList);

		Collections.sort(empList, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getAge() - o2.getAge();
			}
		});

		Collections.sort(empList, (Employee o1, Employee o2) -> {
			return o1.getAge() - o2.getAge();

		});

	}
}

class sortEmployeeByAge implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getAge() - o2.getAge();
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
