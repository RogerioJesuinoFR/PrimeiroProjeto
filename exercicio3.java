package aula01;

import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {
        Scanner entTcl = new Scanner(System.in);

        int maiorNum = 0;

        System.out.println("Informe o primeiro numero:");
        int num1 = entTcl.nextInt();
        System.out.println("Informe o segundo numero");
        int num2 = entTcl.nextInt();
        System.out.println("Informe o terceiro numero");
        int num3 = entTcl.nextInt();

        if (num1 > num2 && num1 > num3) {
            maiorNum = num1;
        } else if (num2 > num1 && num2 > num3) {
            maiorNum = num2;
        } else {
            maiorNum = num3;
        }

        System.out.println("O maior dos tres numeros e: " + maiorNum);

        entTcl.close(); // Fechar o Scanner quando não for mais utilizado
    }
}

