package streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {

		// Creating stream objects
		Stream<String> stream = Stream.of("A", "B", "C");
		stream.forEach((s) -> System.out.println(s));

		// Converting the collection to stream
		Collection<String> collection = Arrays.asList("Apple", "Banana");
		Stream<String> stream2 = collection.stream();
		stream2.forEach(System.out::println);

		List<String> list = Arrays.asList("Apple", "Banana");
		Stream<String> stream3 = list.stream();
		stream3.forEach(System.out::println);

		Set<String> set = new HashSet<>(list);
		Stream<String> stream4 = set.stream();
		stream4.forEach(System.out::println);

		String[] array = new String[] { "A", "B", "C" };
		Stream<String> stream5 = Arrays.stream(array);
		stream5.forEach(System.out::println);
	}

}
