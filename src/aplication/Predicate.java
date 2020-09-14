package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import model.entities.Product;

public class Predicate {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet",350.50));
		list.add(new Product("HD Case",80.90));
		
		//list.removeIf(p -> p.getPrice() >=100); //expressao lambda usando Predicate
		//list.removeIf(new ProductPredicate());  //expressao criada através de uma classe interface Productpredicate 
		//list.removeIf(Product::staticProductPredicate);//expressao static criada diretamente na classe product realizando referencia direto ao metodo  
		//list.removeIf(Product::nonstaticProductPredicate);//expressao não statuca criada usando os proprios dados da classe
		
		//java.util.function.Predicate<Product> pred = p -> p.getPrice() >=min; //expressao lambda declarada
		
		double min = 100.0;
		list.removeIf(p -> p.getPrice() >=min);// expressao lambda in line.
		
		for(Product p : list) {
			System.out.println(p);
		}

	}

}
