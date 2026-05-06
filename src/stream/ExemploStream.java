package stream;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.List;

public class ExemploStream {

	public static void main(String[] args) {
		
		List<String> estados = Arrays.asList("São Paulo", "Rio de Janeiro", "Minas Gerais","Espirito Santo", 
				"São Paulo", "Rio de Janeiro", "Minas Gerais", "São Paulo", "Rio de Janeiro");
		
		//Stream
		List<String> estadosEmMaiusculo = estados.stream()
				.map(x -> x.toUpperCase()) // operaçao intermediaria (processamento)
				.collect(Collectors.toList()); // operaçao terminal (finalizacao)
		
		List<String> estadosUnicos = estados.stream()
				.distinct()
				.collect(Collectors.toList());
		
		long quantidadeDeEstados = estados.stream()
				.distinct()
				.count(); // Operaçao Terminal
		        
		
		System.out.println("Estados em Maiúsculo: " + estadosEmMaiusculo);
		System.out.println("\nEstados Unicos: " + estadosUnicos);
		System.out.println("\nQuantidade de Estados Unicos: " + quantidadeDeEstados);
		
		System.out.println("\nColeção/Dados Inicial: " + estados);
				
	}

}
