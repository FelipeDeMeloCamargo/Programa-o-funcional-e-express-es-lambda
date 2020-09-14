package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.entities.Product;

public class Program1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>(); //lista vazia
	
		list.add(new Product("Tablet", 400.0));
		list.add(new Product("Notebook", 2000.0));
		list.add(new Product("TV",1500.0));
	
		list.sort((p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));//Expressao lambda anonima. Função anonima de primeira classe.
		//pode ser feita tudo dentro do sort
		
		for(Product p : list) {
			System.out.println(p);
		}
		
		sc.close();
	}

}
