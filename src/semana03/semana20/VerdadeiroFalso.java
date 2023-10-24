package semana20;

public class VerdadeiroFalso extends Questao{
    private boolean respostaCerta;


    public VerdadeiroFalso(int numero, String enunciado, boolean respostaCerta) {
        super(numero, enunciado);
        this.respostaCerta = respostaCerta;
    }

    public boolean getRespostaCerta(){
        return respostaCerta;
    }
}