package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test1 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < 10; i++) {
			list.add(i);
		}

		List<Integer> evenList = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(evenList);

		Object[] eList = list.stream().filter(i -> i % 2 == 0).toArray(Integer[]::new);
		System.out.println(eList[3]);

		String[] array = { "Ankit", "Anudeep", "Ashish", "Bravo", "Sachin" };

		Optional<String> reduced = Arrays.stream(array).reduce((s1, s2) -> s1 + "#" + s2);
		reduced.ifPresent(System.out::println);

	}

}
