package util;

import java.util.function.Consumer;

import model.entities.Product;

public class PriceUpdateConsumer implements Consumer<Product> {

	@Override
	public void accept(Product p) { //aumentar cada produto em 10%
		p.setPrice(p.getPrice() * 1.1);//alterar o pre�o tem que pegar o pre�o e multiplicar por 1.1
		
	}

}
