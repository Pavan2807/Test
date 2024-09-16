package foreach;

import java.util.HashSet;
import java.util.Set;

public class SetForEachExample {
	public static void main(String[] args) {
		Set<Employee> empSet = new HashSet<>();

		empSet.add(new Employee("Pavan", 26));
		empSet.add(new Employee("Ram", 25));
		empSet.add(new Employee("Sandeep", 24));

		// using Extended For Loop
		for (Employee emp : empSet) {
			System.out.println(emp);
		}

		System.out.println("============");
		empSet.forEach((emp) -> System.out.println(emp));
		System.out.println("============");

		empSet.stream().forEach((emp) -> System.out.println(emp));
	}

}
