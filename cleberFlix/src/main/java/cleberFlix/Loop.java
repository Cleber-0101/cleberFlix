package cleberFlix;

import java.util.Scanner;

public class Loop {
	 public static void main(String[] args) {
	        Scanner leitura = new Scanner(System.in);
	        double media = 0;
	        double nota = 0;

	        //Estrutura de repetição , nesse caso foram repetidas 
	        //3 vezes a pergunta para digita a nota do filme
	        for (int i = 0; i < 3 ; i++) {
	            System.out.println("Digite sua avaliação");
	            nota = leitura.nextDouble();
	            media += nota;
	        }

	        System.out.println("media de avaliação " + media/3 );


	    }
}
