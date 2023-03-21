package semana04;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Codigo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o código identificador");
        String codigo = sc.nextLine();

        boolean codigoValido = Pattern.matches("^BR\\d{4}X$", codigo);

        if (codigoValido) {
            System.out.println("O código identificador é valido");
        } else {
            System.out.println("O código identificador é invalido");
        }
        sc.close();
    }
}
