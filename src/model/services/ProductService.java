package model.services;

import java.util.List;
import java.util.function.Predicate;

import model.entities.Product;

public class ProductService {
	
	public double filteredSum(List<Product> list, Predicate<Product> criteria) { //lista recebida por parametro, e tamb�m um predicate
		double sum = 0.0;
		for (Product p : list) {
			if(criteria.test(p)){ //Far� um teste e passar� como crit�rio o que eu informar pra ele na classe principal.Evitando manuten��o nessa classe
				sum += p.getPrice(); //soma 0 recebe o pre�o e o guarda. O for somar�
			}
		}
		return sum;
	}

}
