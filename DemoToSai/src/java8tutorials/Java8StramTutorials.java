package java8tutorials;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java8StramTutorials {

	public static void main(String[] args) {
		List<Integer> intList = IntStream.rangeClosed(0, 100).boxed().collect(Collectors.toList());
List<String> stringList=Arrays.asList("Pavan","Pavan","Kalyan","Madhu","Nayidu","Ranji");

		Map<Integer, Integer> intSquares = intList.stream().collect(Collectors.toMap(i -> i, i -> i * i));
		System.out.println(intSquares);
		
		//Max values
		
		Optional<Integer> max=intList.stream().collect(Collectors.maxBy(Comparator.comparing(Integer::new)));
		
		System.out.println("Max Value "+max.get());
		
		//grouping by using an overloaded method contains classifier and a downstream
		Map<Integer, List<String>> anNames=stringList.stream().collect(Collectors.groupingBy(s->s.length(), 
				Collectors.filtering(s->s.contains("an"), Collectors.toList())));
		System.out.println(anNames);
		
		// grouping by with identifier
		
		Map<Integer, List<String>> anNames2=stringList.stream().collect(Collectors.groupingBy(s->s.length(), 
				LinkedHashMap::new,
				Collectors.filtering(s->s.contains("an"), Collectors.toList())));
		System.out.println(anNames2);
		
		
	}

}
