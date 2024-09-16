package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortinginStreams {

	public static void main(String[] args) {

		List<String> fruits = new ArrayList<>();

		fruits.add("Apple");
		fruits.add("Neem");
		fruits.add("Mangosss");
		fruits.add("Banana");

		List<String> fruitlist = fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		// fruitlist.forEach((s) -> System.out.println(s));
		fruitlist.forEach(System.out::println);

		List<String> fruitlist2 = fruits.stream().sorted((s1, s2) -> s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println(fruitlist2);

		List<String> fruitlist3 = fruits.stream().sorted().collect(Collectors.toList());
		System.out.println(fruitlist3);

		// Descending order

		List<String> fruitlistdesc = fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		// fruitlist.forEach((s) -> System.out.println(s));
		fruitlistdesc.forEach(System.out::println);

		List<String> fruitlistdesc2 = fruits.stream().sorted((s1, s2) -> s2.compareTo(s1)).collect(Collectors.toList());
		System.out.println(fruitlistdesc2);

		// Compare based on length
		List<String> fruitlistsize = fruits.stream().sorted(Comparator.comparingInt(String::length).reversed())
				.collect(Collectors.toList());
		// fruitlist.forEach((s) -> System.out.println(s));
		fruitlistsize.forEach(System.out::println);
	}

}
