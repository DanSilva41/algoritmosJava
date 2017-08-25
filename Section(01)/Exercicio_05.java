import java.util.Scanner;

/**
* @author Danilo Silva
*/
// 5. Algoritmo - Média ponderada de notas
// - Ler três notas de um aluno 
// - Imprimir a média ponderada(notas tem pesos respectivos 1,2 e 3);

class Exercicio_05 {

	static Scanner ler = new Scanner(System.in);
	
	public static void main(String[] args) {
		Aluno user = new Aluno();
		System.out.println("Digite o seu nome: ");
		user.setNome(ler.nextLine());

		int[] notasLidas = new int[3];

		/* Primeira alternativa(extensa)

		System.out.println("Nota 1:");
		notasLidas[0] = ler.nextInt();
		System.out.println("Nota 2:");
		notasLidas[1] = ler.nextInt();
		System.out.println("Nota 3:");
		notasLidas[2] = ler.nextInt();

		user.setNotas(notasLidas);
		*/

		// Segunda alternativa(robusta)
		for (int i = 0;i < notasLidas.length ;i++ ) {
			System.out.print("Nota "+ (i+1) +" : ");
			notasLidas[i] = ler.nextInt(); 
		}
		user.setNotas(notasLidas);
		user.calcularMediaPonderada();
		// user.getNotas();


	}
}