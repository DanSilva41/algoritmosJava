class Aluno{
	private static int id;
	private String nome;
	private int[] notas;

	Aluno(){
		notas = new int[3];
		++id;
	}
	public int getId(){
		return id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}

	public void setNotas(int[] notas){
		this.notas = notas;
	}
	public int getNota(int index){
		return notas[index];
	}

	public void getNotas(){
		for (int i = 0; i < this.notas.length ; i++ ) {
			System.out.println("Nota "+ (i+1) +" : " + this.notas[i]+ ";");
		}
	}

	public void calcularMediaPonderada(){
		int media = 0;
		int s = 0;
		for (int i = 0; i < this.notas.length ; i++ ) {
			s = notas[i] * (i+1);
			media += s;
		}
		System.out.println("\nNome: "+ this.nome +"\nMedia ponderada: "+ media);

	}

}