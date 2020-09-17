//Consumer foreach executa o que é estipulado em toda a lista sem precisar criar um for, inclusive imprimir
package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import model.entities.Product;

public class Consumer {

	public static void main(String[] args) {
Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet",350.50));
		list.add(new Product("HD Case",80.90));
		
		//list.forEach(new PriceUpdateConsumer());//vai percorrer toda coleção como se fosse um for e fará um consumer
		//list.forEach(Product ::staticProductUpdate);//referencia para o metodo dentro da classe product static
		//list.forEach(Product :: nonStaticProductUpdate);//referencia para o metodo dentro da classe non static
		
		double factor = 1.1;
		
		//Consumer<Product> cons = p -> p.setPrice(p.getPrice() * factor) //expressao lambda declarada
		
		list.forEach(p -> p.setPrice(p.getPrice() * factor));//expressao lambda declarada in line
		
		//para imprimir a lista existe um consumer também
		list.forEach(System.out::println); // System out usando o println //reference method
		
	}

}
