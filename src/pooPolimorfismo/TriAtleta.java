package pooPolimorfismo;

public class TriAtleta extends Pessoa implements ICiclista{

	int competicoes;

	public TriAtleta(String nome, int idade, int competicoes) {
		super(nome, idade);
		this.competicoes = competicoes;
	}
	
	public int getCompeticoes() {
		return competicoes;
	}

	public void setCompeticoes(int competicoes) {
		this.competicoes = competicoes;
		
	}
	
	public void competicoesConcluidas() {
	    System.out.println("Competições Concluidas: " + this.competicoes);
	}
	
	public void competicoesConcluidas(int numero) {
		 System.out.println("Competições Concluidas: " + numero);
			
	}
	
	// polimorfismo de sobreescrita (sobreescrita de metodo)
	public void visualizar() {
		super.visualizar();
		System.out.println("Competições: " + this.competicoes);
	}
	
	// metodos implementados das interfaces
	public void pedalar() {
		System.out.println("Estou pedalando....");
	}
}
