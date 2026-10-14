public class media_5notas {

    public static void main(String[] args) {

            double[] notas = {12.5, 15.0, 10.0, 18.0, 14.5};
            double soma = 0;

            for (int i = 0; i < notas.length; i++) {
                soma = soma + notas[i];
            }

            double media = soma / notas.length;

            System.out.println("A média das notas é: " + media);
        }

}

/*
double[] notas → cria um array com 5 notas.
double soma = 0; → começa a soma em zero.
for → percorre todas as notas do array.
soma = soma + notas[i]; → adiciona cada nota à soma.
soma / notas.length → divide a soma pelo número de notas.
 */

