package semana04;

import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o valor da compra");
        float Valor = sc.nextFloat();

        if (Valor < 10) {
            System.out.println("Sem desconto, o valor continua: " + Valor);
        } else {
        if (Valor < 100) {
            System.out.println("Com o desconto aplicado, o valor fica: " + (Valor-(Valor*0.05)));
        } else {
        if (Valor < 500) {
            System.out.println("Com o desconto aplicado, o valor fica: " + (Valor-(Valor*0.1)));
        } else {
            System.out.println("Com o desconto aplicado, o valor fica: " + (Valor-(Valor*0.15)));
        }
        }
        }
        sc.close();
    }
}
