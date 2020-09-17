import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import model.entities.Product2;

public class Exercicio2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enther the file full path: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			List<Product2> list = new ArrayList<>(); // lista

			String line = br.readLine(); // ler a primeira linha

			while (line != null) {
				String[] fields = line.split(",");// faz o string fields receber a linha e separa-los em 2 nesse caso
													// pela virgula
				list.add(new Product2(fields[0],fields[1],Double.parseDouble(fields[2])));// pega o vetor na posição 0 1 e 2. A 2 transforma em double pois e salary
																				
				line = br.readLine();
			}
		//declarar um valor recebido pelo usuario
		System.out.println("Enter the salary: "); //salario para que filtremos na lista o valor informado	
		double valor = sc.nextDouble();
		
		List<String> email = list.stream()
				.filter(p -> p.getSalary() > valor)//filtra pelo valor informado 
				.map(p -> p.getEmail())
				.sorted()
				.collect(Collectors.toList());
		System.out.println("Email of people whose salaryis more than " + valor);
		email.forEach(System.out::println);
		
		//somar o salario de todos que tem a letra M
		//double sum = list.stream().map(p -> p.getSalary())// somar tudo e gravar na variavel sum
		
		double sum = list.stream()
				.filter(p ->p.getName().charAt(0) == 'M')
				.map(p -> p.getSalary()).reduce(0.0, (x,y) -> x+y);
		
		System.out.printf("Sum of salary of people whose name starts with 'M': %.2f", sum);
				
				
			
		} catch (IOException e) {
			System.out.println("Error" + e.getMessage());
		}
	sc.close();
	}
	
}
