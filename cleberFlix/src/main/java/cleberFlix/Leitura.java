package cleberFlix;

import java.util.Scanner;

public class Leitura {
   public static void main (String[] args) {
	   //Rastreamento do teclado
       Scanner leitura = new Scanner(System.in);
       
       System.out.println("Digite seu filme favorito");
       String filme = leitura.nextLine();
       System.out.println("Qual ano de lançamento");
       int anoDeLancamento = leitura.nextInt();
       System.out.println("Diga sua avaliação do filme");
       double avalie = leitura.nextDouble();

       System.out.println("O filme : " + filme);
       System.out.println("Criado no ano de : " + anoDeLancamento);
       System.out.println("teve a avaliação de :" + avalie);

       System.out.println("Obrigado por responder !!!");
	   
	   
   }
		
}
