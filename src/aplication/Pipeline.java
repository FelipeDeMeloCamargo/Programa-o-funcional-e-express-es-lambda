package aplication;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Pipeline {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		
		List<Integer> newList = list.stream().filter(x -> x % 2 ==0).map(x -> x * 10).collect(Collectors.toList());
		//pega os numeros pares da lista e multiplica por 10
		
		System.out.println(Arrays.toString(newList.toArray()));  
	}

}
