import java.util.Scanner;

/**
* @author Danilo Silva
*/
// 1. A imobiliária Imóbilis vende apenas terrenos retangulares. Faça um algoritmo para ler as
// dimensões de um terreno e depois exibir a área do terreno. 

class Exercicio_01 {
	
	static Scanner cap = new Scanner(System.in);

	public static void main(String[] args) {
			float comprimento, largura;

			System.out.println("Digite o COMPRIMENTO do terreno: ");
			comprimento = cap.nextFloat();
			System.out.println("Digite a LARGURA do terreno: ");
			largura = cap.nextFloat();

			calculaArea(comprimento, largura);
	}

	/**
	* @param comp 
	* @param larg
	*/
	static 	void calculaArea(float comp, float larg) {
		float area;
		area = comp * larg;

		System.out.println("Area = "+ area);
		System.out.printf("Area = %.1f", area);
	}	
}