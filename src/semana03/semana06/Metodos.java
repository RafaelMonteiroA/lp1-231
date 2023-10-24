package semana06;

public class Metodos {
    
    public static void main(String[] args) {
        System.out.println(Math.sqrt(25.0)); 
        imprimirPalavra("Olá mundo");

        System.out.println(Calculadora.soma(10.0, 3.0));
    }

    public static void imprimirPalavra(String palavra) {
        System.out.println(palavra.toUpperCase());
    }

    // public - modificador de acesso - qualquer classe em qualquer pacote pode acessar o método
    // static - o método fica associado a classe e não a objetos dela
    // void - tipo de retorno (void = sem retorno)
    // imprimirPalavra - nome do método

}
