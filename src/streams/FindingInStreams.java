package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class FindingInStreams {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(100, 1, 4, 6, 2);
		Optional<Integer> i = list.stream().findFirst();
		if (i.isPresent()) {
			System.out.println(i.get());
		} else {
			System.out.println("List is empty");
		}

		Optional<Integer> key = list.stream().findAny();

		if (key.isPresent()) {
			System.out.println(key.get());
		} else {
			System.out.println("List is empty");
		}

		Stream<Integer> streams = Stream.of(100, 44, 28);
		System.out.println(streams.count());

		Integer integer = Stream.of(100, 44, 28).min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(integer);

		Integer integer1 = Stream.of(100, 44, 28).max(Comparator.comparing(Integer::valueOf)).get();

		System.out.println(integer1);

	}
}
