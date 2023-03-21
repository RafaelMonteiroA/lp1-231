package semana04;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o primeiro valor (conjunto real)");
        float Valor1 = sc.nextFloat();
        System.out.println("Insira o segundo valor (conjunto real)");
        float Valor2 = sc.nextFloat();
        System.out.println("Insira o terceiro valor (conjunto real)");
        float Valor3 = sc.nextFloat();

        float Resultado = (Valor1+Valor2+Valor3)/3;

        System.out.println("A média aritmética é: " + Resultado);

        sc.close();
    }
}
