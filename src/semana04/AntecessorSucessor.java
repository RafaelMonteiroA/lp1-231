package semana04;

import java.util.Scanner;

public class AntecessorSucessor {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com um número inteiro");
        int Numero = sc.nextInt();

        System.out.println("Número Antecessor = " + (Numero-1) + "\nNúmero Sucessor = " + (Numero+1));

        sc.close();
    }
}
