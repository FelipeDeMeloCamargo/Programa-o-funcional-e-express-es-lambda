package aplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import model.entities.Product;

public class Exercicio1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter full file path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) { //acessar o arquivo
			
			List<Product> list = new ArrayList<>(); //lista
			
			String line = br.readLine(); //ler a primeira linha
			
			while(line != null) {
				String[] fields = line.split(",");//faz o string fields receber a linha e separa-los em 2 nesse caso pela virgula
				list.add(new Product (fields[0], Double.parseDouble(fields[1])));//pega o vetor na posição 0 e posicao 1. O 1 é convertido em double
				line = br.readLine();
			}
			//precisamos achar a soma dos preços
			double avg = list.stream().map(p ->p.getPrice()).reduce(0.0, (x,y) -> x+y) / list.size();
			//map para pegar 1 item só
			//reduce faz a somatoria dos itens
			// e será dividida pela quantidade de itens na lista para achar a media
			
			System.out.println("Avarage price: " + String.format("%.2f", avg));

			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());//converte tudo pra maiúsculo
			
			//Achar os nomes dos produtos que tem abaixo da media
			List<String> names = list.stream() //lista convertida em Stream
					.filter(p -> p.getPrice() < avg)//filtrar todo mundo que tem o preço abaixo da media e gera um stream
					.map(p -> p.getName())//pega o nome de cada produto que foi filtrado
					.sorted(comp.reversed()) //ordena por ordem decrescente
					.collect(Collectors.toList());//converte novamente para lista
			
			//impressao
			names.forEach(System.out::println);
			
			
		}
		catch (IOException e) { //tratativa do erro
			System.out.println("Error: " + e.getMessage());
		}
				
		sc.close();
	}

}
