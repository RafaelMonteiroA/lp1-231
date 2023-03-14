package semana03;

import java.util.Scanner;

public class Introducao {
    public static void main(String[] args){
        // Comentário de uma linha

        /*
         * Comentário de várias
         * linhas
         */

         // Tipos primitivos
         // Inteiros
         // byte, short, int, long
         byte n1 = 100; // 1 Byte | -128 a 127
         short n2 = 3243; // 2 Bytes | -32768 a 32767
         int n3 = 432526; // 4 Bytes | 2 Bilhões 
         long n4 = 432582375657l; // 8 Bytes

         // Ponto flutuante
         float nota1 = 10.3f; // 4 Bytes
         double nota2 = 10.3; // 8 Bytes

         // char
         char letra = 'A';

         // boolean
         boolean ligado = true;
         boolean teste = false;

         // String
         String nome = "Abacate inexistente";
         System.out.println(nome);
         System.out.println(nome.toLowerCase());
         System.out.println(nome.toUpperCase());
         
         // variáveis e constantes
         int idade = 20;
         
         int idade2;
         idade2 = 30;

         // Java 10 - inferência de tipo com var
         var idade3 = 15;
         var nome2 = "Maria";

         // Constantes - keyword final
         final double TESTE = 20.2;
         final double PI = 3.14;

         // Entrada e saída de dados

         // Entrada - Classe Scanner
         // Saída - System.out

         Scanner sc = new Scanner(System.in);

         System.out.println("Entre com seu nome");
         String nomeInformado = sc.nextLine();

         System.out.println("Entre com a sua idade");
         int IdadeInformada = sc.nextInt();

         System.out.println(nomeInformado + " " + IdadeInformada);

         sc.close();
         

    }
}
