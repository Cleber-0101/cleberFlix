package cleberFlix;

public class Condicionais {

	public static void main(String[] args) {
		
		int anoDeLancamento = 1999;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = " plus ";

        if (anoDeLancamento >= 1999) {
            System.out.println(" Clientes gostam de assistir! ");
        } else if (anoDeLancamento <= 1999) {
            System.out.println(" Clientem não gostam de assistir ");
        }


        if (!incluidoNoPlano && !tipoPlano.equals("plus")) {
            System.out.println(" Deve primeiro pagar o plano para assistir ");
        } else {
            System.out.println(" Filme liberado !! ");
        }

	}

}
