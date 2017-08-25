import java.util.Scanner;

/**
* @author Danilo Silva
*/
// 2.`Padaria Hotpão
// Pãozinho: 0,12 centavos		Broa: 1,50 centavos
// - Total da arrecadação de venda de pães e broas juntos
// - Guardar 10% do valor arrecadado

class Exercicio_02 {
	
	static Scanner ler = new Scanner(System.in);
	static final float PAOZINHO = 0.12F;
	static final float BROA = 1.5F;

	public static void main(String[] args) {
		System.out.println("\t\t\t>>>>>Padaria Hotpão <<<<\t\t\t");

		System.out.println("Quantos paes vendeu?");
		float qtPaes = ler.nextFloat();			
		System.out.println("Quantas broas vendeu?");			
		float qtBroas = ler.nextFloat();			
	
		float total = calcularTotalVenda(qtPaes, qtBroas);
		System.out.printf("Valor total = %.2f \n", total);

		total = guardarParteDoValor(total);
		System.out.printf("Valor total em caixa = %.2f \n", total);		
	}	

	static float calcularTotalVenda(float qtPaes, float qtBroas) {
		float vendaPaes = qtPaes * PAOZINHO;
		float vendaBroas = qtBroas * BROA;

		return vendaPaes + vendaBroas;
	}

	static float guardarParteDoValor(float valorTotal) {
		float dezPorcento = valorTotal / 10.0f;
		System.out.printf("10(porcento) guardado: %.2f \n", dezPorcento);

		return valorTotal - dezPorcento;
	}
}