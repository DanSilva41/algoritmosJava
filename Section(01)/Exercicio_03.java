import java.util.Scanner;
import javax.swing.JOptionPane;

/**
* @author Danilo Silva
*/
// 3. Ler o nome e a idade de alguém pelo teclado e depois via JOptionPane
// - Retornar o quanto de dias já viveu

class Exercicio_03 {
	
	static Scanner ler = new Scanner(System.in);
	static String nome;
	static int idade, opcao;
	public static void main(String[] args) {

		System.out.println("1 - Teclado \t 2 - JOptionPane");
		opcao = ler.nextInt();

		switch(opcao) {
			case 1: 
				viaTeclado();
				break;
			case 2:
				viaJOptionPane();
				break;
			default:
				System.out.println("Opçao incorreta!");
		}

	}	

	static void viaTeclado(){
		System.out.println("\t\t\t>>>>>Idade em dias <<<<\t\t\t");

		System.out.println("Qual o seu nome: ");
		ler.nextLine();
		nome = ler.nextLine();
		System.out.println("Informe sua idade: ");
		idade = ler.nextInt();

		calcularEmDias(idade, 1);
		System.out.println("\n\t FIM ");
	}

	static void viaJOptionPane(){
		
		JOptionPane.showMessageDialog(null, "Idade em dias");
		nome = JOptionPane.showInputDialog("Qual o seu nome?");
		idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade:"));

		calcularEmDias(idade, 2);	
		JOptionPane.showMessageDialog(null, "FIM");
	}

	static void calcularEmDias(int idade, int opcao) {
		int dias = idade * 365;
		if (opcao == 1) 
			System.out.println(nome.toUpperCase() + ", voce ja viveu " + dias + " dias." );			
		else
			JOptionPane.showMessageDialog(null, nome.toUpperCase() + ", voce ja viveu " + dias + " dias.");
	}
}