

//Uma classe é a caracteristica de objeto e suas abstrações 
//Modelagem de classes 
public class Filme {
	String nome ;
	int anoDeLancamento;
	boolean incluidoNoPlano ;
	double somaAvaliacao ;
	int totalDeAvaliacao ;
	int duracacaoEmMinutos ;
	
	
	//metodo 
	void exibeFichaTecnica() {
		System.out.println(" Nome do filme é :  " + nome);
		System.out.println(" O ano de lançamento é : " + anoDeLancamento);
	}	
	
	
	void avalia(double nota) {
		somaAvaliacao += nota ;
		totalDeAvaliacao++;
	}
	
	
}
