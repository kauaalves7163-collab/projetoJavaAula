package pooHeranca;

public class Estudante extends Pessoa {
	
	// Atributos
    private String matricula;
    private String curso;
    
	// metodo construtor
    public Estudante (String nome, int idade, String email, String matricula, String curso) {
		super(nome, idade, email); // super => Classe mae, metodo construtor da classe mae
		// Pessoa(nome, idade, email)
		this.matricula = matricula;
		this.curso = curso;
	}
	
	// metodos de acesso (get-pega ou mostra / set- atualiza ou processa
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
}