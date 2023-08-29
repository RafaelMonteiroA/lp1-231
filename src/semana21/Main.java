package semana21;

import java.util.ArrayList;

public class Main {

    // interface = contrato
    // conjunto de métodos (somente assinaturam sem corpo)
    // classe concreta que implementa a interface

    // 

    // Quadrado - lado - calcular Area/Perimetro
    // Retangulo - base, altura - calcularArea/Perimetro
    // Circulo - ?

    public static void main(String[] args) {
        System.out.println("Main...");

        Tela tela = new Tela();

        Quadrado q1 = new Quadrado(10);
        Quadrado q2 = new Quadrado(20);

        Retangulo r1 = new Retangulo(20, 10);

        tela.addFigura(q1);
        tela.addFigura(q2);
        tela.addFigura(r1);

        System.out.println(tela.areaTotal());
        System.out.println(tela.perimetroTotal());
    
    // List
    // Set
    // Map

    ArrayList<String> nomes = new ArrayList<String>();

    // Adicionar
    nomes.add("Maria");
    nomes.add("João");
    nomes.add("Pedro");

    // Tamanho
    System.out.println(nomes.size());

    // Remover um elemento
    nomes.remove(1);

    // Remove todos os elementos do ArrayList
    nomes.clear();

    // Pegar valor
    System.out.println(nomes.get(0));

    for (int i = 0; i < nomes.size(); i++) {
        String nome = nomes.get(i);
    }

    for (String nome : nomes) {
        
    }
    }
}
