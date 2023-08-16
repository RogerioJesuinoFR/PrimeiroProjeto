package aula01;

import java.util.Scanner;

public class Exercício2 {

	public static void main (String[] args) {
		Scanner entradaTeclado = new Scanner(System.in);
		
		System.out.println("Informe o seu nome completo:");
		String nome = entradaTeclado.nextLine();
		System.out.println("Informe o sexo:");
		String sexo = entradaTeclado.nextLine();
		System.out.println("Informe o estado civil:");
		String estadoCivil = entradaTeclado.nextLine();
		System.out.println("Informe a quantidade de filhos:");
		int filhos = entradaTeclado.nextInt();
		System.out.println("Informe a escolaridade:");
		entradaTeclado.nextLine();
		String escolaridade = entradaTeclado.nextLine();
		System.out.println("Informe sua renda mensal:");
		double renda = entradaTeclado.nextDouble();
		System.out.println("----------------------------------");
		
		System.out.println("Nome: " + nome);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado Civil: " + estadoCivil);
		System.out.println("Quantidade de filhos: " + filhos);
		System.out.println("Escolaridade: " + escolaridade);
		System.out.println("Renda: R$" + renda);
		
		entradaTeclado.close();
	}
}
