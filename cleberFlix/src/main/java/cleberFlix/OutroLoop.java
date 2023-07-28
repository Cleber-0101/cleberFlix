package cleberFlix;

import java.util.Scanner;

public class OutroLoop {
	 public static void main(String[] args) {
	        Scanner leitura = new Scanner(System.in);
	        double media = 0;
	        double nota = 0;
	        int totalDeNotas = 0;

	        //while quer dizer "ENQUANTO " ou seja é uma expressãp booleana
	        while (nota != -1) {
	            System.out.println("Digite sua avaliação para o filme ou -1 pra encerrar");
	            nota = leitura.nextDouble();


	            if (nota != -1){
	                media += nota;
	                totalDeNotas++;
	            }

	        }

	        System.out.println("media de avaliação " + media/3 );

	    }
}
