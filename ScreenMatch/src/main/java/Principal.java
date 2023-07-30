
public class Principal {
	
	public static void main(String[] args) {
		Filme meuFilme = new Filme();	
		meuFilme.nome = " Gente grande 2 " ;
		meuFilme.anoDeLancamento = 2023 ;
		meuFilme.duracacaoEmMinutos = 180 ;		
		
		
		meuFilme.exibeFichaTecnica();
		meuFilme.avalia(10);
		meuFilme.avalia(20);
		meuFilme.avalia(10);
		
		System.out.println(meuFilme.somaAvaliacao);
		System.out.println(meuFilme.totalDeAvaliacao);
		
	}
}
