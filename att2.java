package FOR;

import java.util.Scanner;

public class att2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String nome;
		
		for (int i = 0; i <= 5; i++) {
			System.out.print("Informe o nome: ");
		nome = ler.next();
		System.out.println("O seu nome é: " +nome);
		}
        
        
     
        ler.close();
	}

}
