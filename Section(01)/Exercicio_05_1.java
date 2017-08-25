import java.util.Scanner;

/**
* @author Danilo Silva
*/
// 5.1- Algoritmo - Média ponderada de notas (ex: Exercicio_05);
// - Ler três notas de um aluno 
// - Inserir alunos em um array
// - Imprimir informações dos alunos inseridos no array

class Exercicio_05_1 {

	static Scanner ler = new Scanner(System.in);
	static Aluno[] alunos = new Aluno[10];

	public static void main(String[] args) {

		int opcao;
		do {
			System.out.println("(1)Inserir Aluno / (2)Mostrar lista / (3)Sair");
			opcao = ler.nextInt();
			switch (opcao) {
				case 1: // Inserir Aluno
					Aluno aluno = new Aluno();
					int[] notasLidas = new int[3];

					System.out.print("Nome do aluno: ");
					ler.nextLine();
					aluno.setNome(ler.nextLine()); // Setando nome do aluno

					for (int i = 0;i < notasLidas.length ;i++ ) {
						System.out.print("Nota "+ (i+1) +" : ");
						notasLidas[i] = ler.nextInt();  // Lendo notas e atribuindo ao array notasLidas
					}
					System.out.println("Notas lidas");
					aluno.setNotas(notasLidas); // Setando notas do aluno com base no array obtido

					// Inserir no array alunos(contem diversos alunos)
					for (int i = 0; i < alunos.length ; i++ ) {
						if (alunos[i] == null) 
							alunos[i] = aluno;
							System.out.println("Inserido no array");
							break;
					}
					break;

				case 2: // Array completo
					System.out.println("Imprimir todos os alunos e suas respectivas médias:");
					
					for (int i = 0; i < alunos.length ; i++ ) {
						if(alunos[i] != null)
							alunos[i].calcularMediaPonderada();
					}
					break;

				case 4: // Sair
					System.exit(0);
					break;

				default:
					System.out.println("Digite 1, 2, 3 ou 4, somente.\n");
					break;
			}
		} while(opcao != 4);		
	}
}
