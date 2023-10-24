package semana05;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira seu peso em quilos(kg)");
        double Peso = sc.nextDouble();

        System.out.println("Insira sua altura em centrimetros(cm)");
        double AlturaCM = sc.nextDouble();
        
        double Altura = AlturaCM/100;
        double IMC = Peso / (Altura*Altura);
        double PesoNormal1 = 18.5 * (Altura*Altura);
        double GanharPeso = PesoNormal1 - Peso;
        double PesoNormal2 = 24.9 * (Altura*Altura);
        double PerderPeso = Peso - PesoNormal2;
        if (IMC < 18.5) {
            System.out.println("Você está com baixo peso, para chegar ao peso normal você precisa ganhar " + GanharPeso + " quilos");
        } else {
        if (IMC < 25){
            System.out.println("Você está com o peso normal");    
        } else {
        if (IMC < 30) {
            System.out.println("Você está com excesso de peso, para chegar ao peso normal você precisa perder " + PerderPeso + " quilos");
        } else {
        if (IMC < 35) {
            System.out.println("Você está com obesidade de classe 1, para chegar ao peso normal você precisa perder " + PerderPeso + " quilos");
        } else {
        if (IMC < 40) {
            System.out.println("Você está com obesidade de classe 2, para chegar ao peso normal você precisa perder " + PerderPeso + " quilos");
        } else {
            System.out.println("Você está com obesidade de classe 3, para chegar ao peso normal você precisa perder " + PerderPeso + " quilos");
        }
        }
        }
        }
        sc.close();
    }
}
}
