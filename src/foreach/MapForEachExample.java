package foreach;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapForEachExample {

	public static void main(String[] args) {

		Map<Integer, Employee> mp = new HashMap<>();

		mp.put(1, new Employee("Pavan", 26));
		mp.put(2, new Employee("Sandeep", 24));

		// using Extended For Loop
		for (Entry<Integer, Employee> e : mp.entrySet()) {
			System.out.println(e.getValue().getName());
		}

		System.out.println("============");

		mp.forEach((K, V) -> System.out.println(V.getName()));

		System.out.println("============");

		for (int i : mp.keySet()) {
			System.out.println(mp.get(i));
		}

	}

}
