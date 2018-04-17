package tests.streams;

import java.time.LocalDate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class StreamLocalDate {
	
	public static void main(String[] args) {
		
		Stream<LocalDate> s = Stream.of(LocalDate.now());
		UnaryOperator<LocalDate> u = l->l;
		s.filter(l-> l != null).map(u).peek(System.out::println);
	}

}
