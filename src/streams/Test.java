package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		/*
		 * // ImmutableList List<Integer> list = List.of(10, 2, 8, 4, 5); // list.set(3,
		 * 10); System.out.println(list);
		 * 
		 * // Fixed size but the elements can be modified List<Integer> list1 =
		 * Arrays.asList(1, 2, 3, 4, 5); list1.set(3, 10); System.out.println(list1);
		 * 
		 * // Size varies dynamically List<Integer> list2 = new ArrayList<>();
		 * list2.add(1); list2.add(2); list2.add(3); list2.add(4);
		 * System.out.println(list2);
		 * 
		 * List<Integer> newList = list.stream().filter(i -> i % 2 ==
		 * 0).collect(Collectors.toList()); System.out.println(newList);
		 */

		int[] array1 = new int[] { 1, 2, 3 };
		Arrays.stream(array1);

		String[] array = { "Ankit", "Anudeep", "Ashish", "Bravo", "Sachin" };
		List<String> names = Arrays.asList(array);
		List<String> listWithA = names.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
		listWithA.forEach(name -> System.out.println(name));

		List<Integer> list1 = Arrays.asList(10, 50, 13, 47, 59);
		list1.stream().map(i -> i * i).forEach(i -> System.out.println(i));
		list1.stream().map(i -> i * i).sorted().forEach(i -> System.out.println(i));

		Integer minValue = list1.stream().map(i -> i * i).min((a, b) -> a.compareTo(b)).get();
		System.out.println(minValue);

		Integer maxValue = list1.stream().map(i -> i * i).max((a, b) -> a.compareTo(b)).get();
		System.out.println(maxValue);

		Stream<Integer> iterateStream = Stream.iterate(1000, (Integer i) -> i + 500).limit(10);
		iterateStream.forEach(i -> System.out.println(i));

		// FlatMAP

		List<List<String>> sentenceList = Arrays.asList(Arrays.asList("I", "Love", "Java"),
				Arrays.asList("I", "Love", "C++"), Arrays.asList("I", "Love", "Python"));
		Stream<String> words = sentenceList.stream().flatMap((List<String> list) -> list.stream());
		words.map(a -> a.toLowerCase()).forEach(word -> System.out.print(word + " "));

		List<Integer> list2 = Arrays.asList(10, 50, 10, 47, 10);
		list2.stream().map(i -> i * i).distinct().forEach(i -> System.out.print(i + " "));

		List<Integer> list3 = Arrays.asList(10, 50, 10, 47, 10);
		list3.stream().map(i -> i * i).distinct().sorted().forEach(i -> System.out.print(i + " "));
		System.out.println();

		List<Integer> list4 = Arrays.asList(101, 50, 105, 47, 104);
		list4.stream().filter(i -> i < 100).peek(i -> System.out.println(i)).forEach(i -> System.out.print(i + " "));

		List<Integer> list5 = Arrays.asList(101, 500, 1022, 4723, 101);
		list5.stream().filter(i -> i > 100).limit(2).forEach(i -> System.out.print(i + " "));
		System.out.println();

		List<Integer> list6 = Arrays.asList(101, 500, 1022, 4723, 101);
		list6.stream().filter(i -> i > 100).skip(2).forEach(i -> System.out.print(i + " "));
		System.out.println();

		List<Integer> list7 = Arrays.asList(11, 500, 12, 423, 101);
		list7.stream().filter(i -> i > 100).peek(i -> System.out.println("After filter:" + i)).map(i -> i * 2)
				.peek(i -> System.out.println("After map:" + i)).sorted()
				.peek(i -> System.out.println("After sorted:" + i)).forEach(i -> System.out.println(i));

		List<Integer> list8 = Arrays.asList(11, 500, 12, 423, 101);
		Object[] arrayint = list8.stream().filter(i -> i > 100).toArray(size -> new Integer[size]);
		System.out.println(arrayint.length);

		List<Integer> list9 = Arrays.asList(100, 50, 10, 20, 10);
		Integer reduceValue = list9.stream().reduce((Integer a, Integer b) -> a + b).get();
		int a = reduceValue.intValue();
		System.out.println(a);

		List<Integer> l1 = Arrays.asList(100, 50, 10, 20, 30);
		Integer minval = l1.stream().min((Integer a1, Integer a2) -> a1 - a2).get();
		System.out.println(minval);

		List<Integer> l2 = Arrays.asList(100, 50, 10, 20, 30);
		Integer maxval = l2.stream().max((Integer a1, Integer a2) -> a1 - a2).get();
		System.out.println(maxval);

		List<Integer> l3 = Arrays.asList(100, 50, 10, 20, 30);
		long count = l3.stream().filter(co -> co > 20).count();
		System.out.println(count);

		List<Integer> l4 = Arrays.asList(100, 50, 10, 20, 30);
		boolean anyMatch = l4.stream().anyMatch(anymatch -> anymatch < 5);
		System.out.println("Anymatch:" + anyMatch);

		List<Integer> l5 = Arrays.asList(100, 50, 10, 20, 30);
		boolean allMatch = l5.stream().allMatch(allmatch -> allmatch < 20);
		System.out.println("allMatch:" + allMatch);

		List<Integer> l6 = Arrays.asList(100, 50, 10, 20, 30);
		boolean noneMatch = l6.stream().noneMatch(nonematch -> nonematch > 5);
		System.out.println("Nonematch:" + noneMatch);

	}
}
