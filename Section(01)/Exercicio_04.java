import java.util.Scanner;
import javax.swing.JOptionPane;

/**
* @author Danilo Silva
*/
// 4. R$12,00  o quilo da refeição.
// - Ler o peso do prato montado(considerar o peso do prato) 
// - Imprimir o valor a ser pago

class Exercicio_04 {
	
		static final float QUILO = 12.0f;
		static final float PESO_PRATO = 0.2f;
		static float total = 0f;
	public static void main(String[] args) {
	
		JOptionPane.showMessageDialog(null, "Restaurante Bem-Bao");
		float peso_pratoMontado = Float.parseFloat(JOptionPane.showInputDialog("Peso do prato montado:"));

		float saida = calculaValorASerPago(peso_pratoMontado);
		System.out.println("P3 = "+ saida);

		JOptionPane.showMessageDialog(null, "Preco total = R$"+ saida);			
	}

	static float calculaValorASerPago(float prato_montado) {
		prato_montado -= PESO_PRATO;
		System.out.println("P1 = "+ prato_montado);
		total = prato_montado * QUILO;
		System.out.println("P2 = "+ total);
		return total;
	}

}