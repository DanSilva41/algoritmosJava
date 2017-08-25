import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

class Ordena {
	public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner(System.in);
		SortedSet<String> ss =  new TreeSet<String>();
		FileWriter arq = new FileWriter("example.txt");
		PrintWriter gravarArq = new PrintWriter(arq);

		String linha = "";
		for (int i = 0; i < 28; i++) {
			System.out.print((i+1) + " nome:");
			linha = ler.nextLine();
			ss.add(linha + "\n");
		}
		gravarArq.print(ss);
		arq.close();
	}	
}