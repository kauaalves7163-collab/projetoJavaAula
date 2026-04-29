package poo;

public class TestaCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// instanciamento 
		Carro c1 = new Carro("kombi", 4, 4, "Modelo xyz"); // c1 é um objeto
		
		//c1.marca = "kombi";
		//c1.portas = 4;
		//c1.setMarca("kombi");
		//c1.setPortas(4);
		
		c1.locomover();
		
	    System.out.println("Marca: " + c1.getMarca());
	    System.out.println("Qtd. portas: " + c1.getPortas());
		
	    System.out.println(c1.parar());
	}

}
