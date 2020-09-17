package model.services;

import java.util.List;
import java.util.function.Predicate;

import model.entities.Product;

public class ProductService {
	
	public double filteredSum(List<Product> list, Predicate<Product> criteria) { //lista recebida por parametro, e também um predicate
		double sum = 0.0;
		for (Product p : list) {
			if(criteria.test(p)){ //Fará um teste e passará como critério o que eu informar pra ele na classe principal.Evitando manutenção nessa classe
				sum += p.getPrice(); //soma 0 recebe o preço e o guarda. O for somará
			}
		}
		return sum;
	}

}
