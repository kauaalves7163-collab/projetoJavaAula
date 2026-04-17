package entradaSaida;

import java.util.Scanner;

public class AulaScaner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declarando as Variaveis
		Scanner leia = new Scanner(System.in);
		String nome;
				
		// Entrada de Dados
		System.out.println("Digite o seu nome: ");
				
		// Processamento 
		nome = leia.nextLine();

		// Saída de Dados
		System.out.println("Bom dia, " + nome + "."); // ( + ) concatenar
		
		
		
	}

}
