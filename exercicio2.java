package aula01;

import java.util.Scanner;

public class exercicio2 {

	public static void main (String[] args) {
		Scanner entTcl = new Scanner(System.in);
		
		
		System.out.println("Informe o valor da compra:");
		double compra = entTcl.nextDouble();
		
		double desconto = (compra >= 50.00) ? compra*0.10 : compra*0.05;
		
		System.out.println(desconto);
		
		entTcl.close();
	}
}
