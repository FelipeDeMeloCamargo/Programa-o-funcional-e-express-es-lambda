package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import model.entities.Product;

public class Function {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		//Stream � sequencia de dados
		//map n�o � o mesmo Map da estrutura de dados. O mesmo serve para aplicar o que eu quiser em tudo na lista usando string
		//n�o tem como usar sendo list, precisamos converter a lista para stream
		//list para stream : .stream(); e stream para list : .collect(Collectors.toList())
		
		
		//relembrando map aplica para cada item da minha lista o que eu estipular
		//List<String> name = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		//List<String> name = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());//M�todo Est�tico
		//List<String> name = list.stream().map(Product::NonStaticUpperCaseName).collect(Collectors.toList());//M�todo N�o Est�tico
		
		List<String> name = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());//expressao lambda inline
		
		name.forEach(System.out::println);
		
		
		
	}

}
