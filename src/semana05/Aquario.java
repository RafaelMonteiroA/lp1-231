package semana05;

import java.util.Scanner;

public class Aquario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o comprimento do aquário em cm");
        double Comprimento = sc.nextDouble();

        System.out.println("Insira a altura do aquário em cm");
        double Altura = sc.nextDouble();

        System.out.println("Insira a largura do aquário em cm");
        double Largura = sc.nextDouble();

        System.out.println("Insira a temperatura desejada em Celsius");
        double TempDesejada = sc.nextDouble();

        System.out.println("Insira a temperatura ambiente em Celsius");
        double TempAmbiente = sc.nextDouble();

        double Volume = (Comprimento*Altura*Largura)/1000;
        double PotenciaTermostrato = Volume * 0.05 * (TempDesejada - TempAmbiente);
        double Filtragem = Volume*3;

        System.out.println("O volume do aquário é: " + Volume);
        System.out.println("A potencia do termostrato necessária para manter a temperatura adequada é: " + PotenciaTermostrato);
        System.out.println("A quantidade necessária de filtragem (em litros) é: " + Filtragem);

        sc.close();
    }
}
