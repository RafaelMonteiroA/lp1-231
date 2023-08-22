package semana20;

import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        Prova prova = new Prova();
        Scanner sc = new Scanner(System.in);

        UnicaEscolha questaoUnica = new UnicaEscolha(1,"qual é a capital da França?", List.of("Paris", "Londres", "Madri", "Berlim"), "Paris");
        System.out.println(questaoUnica.getEnunciado() + "\n" + questaoUnica.getOpcoes());
        String resposta1 = sc.next();

        if (resposta1 == questaoUnica.getRespostaCerta()){
        prova.adicionarQuestao(questaoUnica);
        }


        VerdadeiroFalso questaoVerdadeiroFalso = new VerdadeiroFalso(2, "A Terra é plana?", false);
        System.out.println(questaoVerdadeiroFalso.getEnunciado());
        Boolean resposta2 = sc.nextBoolean();

        if (resposta2 == questaoVerdadeiroFalso.getRespostaCerta())
        prova.adicionarQuestao(questaoVerdadeiroFalso);


        MultiplaEscolha questaoMultipla = new MultiplaEscolha(1,"Quais dessas são capitais de países?", List.of("Paris", "Bangu", "Madri", "Paraiba"), List.of("Paris", "Madri"));
        prova.adicionarQuestao(questaoMultipla);
        System.out.println(questaoMultipla.getEnunciado() + "\n" + questaoMultipla.getOpcoes());

        System.out.println("\n Primeira opção: ");

        String resposta3 = sc.nextLine();

        System.out.println("\nSegunda opção: ");
        
        String resposta4 = sc.nextLine();


        System.out.println("Pontuaçao total da prova: " + prova.CalcularPontuacaoTotal());

        sc.close();
     }
}