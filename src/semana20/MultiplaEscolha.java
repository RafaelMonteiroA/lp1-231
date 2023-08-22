package semana20;

import java.util.ArrayList;
import java.util.List;

public class MultiplaEscolha extends Questao{
    private List<String> opcoes;
    private List<String> respostasCertas;

    public MultiplaEscolha(int numero, String enunciado, List<String> opcoes, List<String> respostasCertas) {
        super(numero, enunciado);
        this.opcoes = opcoes;
        this.respostasCertas = respostasCertas;

    }

    public List<String> getRespostasCertas(){
        return respostasCertas;
    }

    public List<String> getOpcoes(){
        return opcoes;
    }
}