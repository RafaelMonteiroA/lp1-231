package semana07;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com 3 valores");
        double valor1 = sc.nextDouble();
        double valor2 = sc.nextDouble();
        double valor3 = sc.nextDouble();

        double media = (valor1 + valor2 + valor3)/3;

        System.out.println("A media aritmética dos valores é: " + media);

        sc.close();
    }
}
