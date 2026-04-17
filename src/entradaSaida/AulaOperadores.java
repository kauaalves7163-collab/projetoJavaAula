package entradaSaida;

import java.util.Scanner;

public class AulaOperadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Variaveis
		float celsius, fahrenheit;
		Scanner leia = new Scanner(System.in);
				
		// Entrada de Dados
		System.out.println("Insira a temperatura em Celsius: ");
		celsius = leia.nextFloat();	// 28,3
				
		// Processamento
		fahrenheit = celsius * 1.8f + 32;
				
		// Saída
		System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
		
	}

}
