package FOR;

import java.util.Scanner;

public class lex {

	public static void main(String[] args) {
  Scanner ler = new Scanner(System.in);
  int inicio, fim;
  
  System.out.println("Informe o valor inicial: ");
  inicio = ler.nextInt();
  
  System.out.println("Informe o valor final: ");
  fim = ler.nextInt();
  
  for(int i = inicio; i <= fim; i++) {
	  if (i % 2 != 0)
	System.out.println("Os numeros impares no intervalo de " + inicio + " a " + fim  + " são: " + i);
	ler.close();
  }
  }
	  
  }
  

