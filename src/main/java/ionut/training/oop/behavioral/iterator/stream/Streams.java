package ionut.training.oop.behavioral.iterator.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
	
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Toby", "Anna", "Leroy", "Alex", "Jamie");
		
		//Exercise: Get first two names of four letters sorted alphabetically
		List<String> ourNames = names.stream()
		                            .filter((String name) -> name.length() == 4) //abstract boolean test(String )
		                            .sorted(Comparator.reverseOrder())
			                        .map(name -> name.toUpperCase()) //String apply(String name )
		                            .limit(2)
		                            .collect(Collectors.toList());
		System.out.println(ourNames);
		
	}
}
