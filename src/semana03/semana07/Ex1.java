package semana07;

public class Ex1 {

        public static double soma(double a, double b, double c) {
            return a + b + c;
        }

        public static double Media(double a, double b, double c) {
            return (a + b + c) / 3;
        }

        public static int MaiorValor(int a, int b, int c) {
            int maior = a;

            if (b > maior) {
                maior = b;
             }

           if (c > maior) {
            maior = c;

        }
        return maior;
    }

        public static int MenorValor(int a, int b, int c) {
            int menor = a;
        
            if (b < menor) {
                menor = b;
            }

            if (c < menor) {
                menor = c;
            }
        
             return menor;
        }

        public static double[] criarArray(double a, double b, double c) {
            double[] array = { a, b, c };
            return array;

       }
        public static double calcularSoma(double[] array) {
         double soma = 0;
            for (double valor : array) {
               soma += valor;
            }
            return soma;
        }

        public static double calcularMedia(double[] array) {
            return calcularSoma(array) / array.length;
        }

        public static double encontrarMaior(double[] array) {
            double maior = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > maior) {
                    maior = array[i];
                }
            }
            return maior;
        }

        public static double encontrarMenor(double[] array) {
            double menor = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] < menor) {
                    menor = array[i];
                }
            }
            return menor;
        }
        
        public static int[] juntarArrays(int[] array1, int[] array2) {
            int[] resultado = new int[array1.length + array2.length];
            int indice = 0;
            for (int valor : array1) {
                resultado[indice] = valor;
                indice++;
            }
            for (int valor : array2) {
                resultado[indice] = valor;
                indice++;
            }
            return resultado;
        }
    }