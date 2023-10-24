package semana20;

import java.util.ArrayList;
import java.util.List;

public class UnicaEscolha extends Questao{
    private List<String> opcoes;
    private String respostaCerta;

    public UnicaEscolha(int numero, String enunciado, List<String> opcoes, String respostaCerta) {
        super(numero, enunciado);
        this.opcoes = opcoes;
        this.respostaCerta = respostaCerta;

    }

    public String getRespostaCerta(){
        return respostaCerta;
    }

    public List<String> getOpcoes(){
        return opcoes;
    }

}