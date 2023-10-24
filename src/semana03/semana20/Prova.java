package semana20;

import java.util.ArrayList;
import java.util.List;

public class Prova{
    private List<Questao> questoes;

    public Prova() {
        questoes = new ArrayList<>();
    }

    public void adicionarQuestao(Questao questao){
        questoes.add(questao);
    }

    public int CalcularPontuacaoTotal(){
        int pontuacaoTotal = 0;
        for (Questao questao : questoes) {
            pontuacaoTotal += questao.CalcularPontuacao();
        }
        return pontuacaoTotal;
    }
}