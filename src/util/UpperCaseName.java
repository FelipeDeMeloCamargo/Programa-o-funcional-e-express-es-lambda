package util;

import java.util.function.Function;

import model.entities.Product;

public class UpperCaseName implements Function<Product,String> {//tipo de entrada e tipo de saida

	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
	}

}
