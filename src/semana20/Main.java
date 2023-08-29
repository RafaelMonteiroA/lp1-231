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
        String respostaCerta = questaoUnica.getRespostaCerta();

        if (resposta1.equals(respostaCerta))
        prova.adicionarQuestao(questaoUnica);


        VerdadeiroFalso questaoVerdadeiroFalso = new VerdadeiroFalso(2, "A Terra é plana? (responda com false ou true)", false);
        System.out.println(questaoVerdadeiroFalso.getEnunciado());
        Boolean resposta2 = sc.nextBoolean();

        if (resposta2 == questaoVerdadeiroFalso.getRespostaCerta())
        prova.adicionarQuestao(questaoVerdadeiroFalso);


        MultiplaEscolha questaoMult = new MultiplaEscolha(3,"qual dessas são capitais de algum país?", List.of("Paris", "Bangu", "Madri", "Cebolinha"), List.of("Paris","Madri"));
        System.out.println(questaoMult.getEnunciado() + "\n" + questaoMult.getOpcoes());
        String resposta3 = sc.nextLine();
        for (String resposta : resposta3.split(", ")) { // Madri, Paris
            if (resposta3.equals(questaoMult.getRespostasCertas()))
            prova.adicionarQuestao(questaoMult);
            
        }

        System.out.println("Pontuaçao total da prova: " + prova.CalcularPontuacaoTotal());

        sc.close();
     }
}