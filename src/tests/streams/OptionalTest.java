package tests.streams;

import java.util.Optional;
import java.util.stream.Stream;

public class OptionalTest {
	
	public static void magic(Stream<Integer> s) {
		Optional o = s.filter(x -> x < 5).limit(3).max((x,y)->x-y);
		System.out.println(o.get());
	}
	
	public static void main(String[] args) {
		
		//magic(Stream.empty()); throws java.util.NoSuchElementException
		//magic(Stream.of(5,10)); throws java.util.NoSuchElementException
		
		
	}

}
