public class numeros_positivos {
    public static void main(String[] args) {

        int[] numeros = {-3, 5, 8, -2, 0, 10, -1};

        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                contador++;
            }
        }

        System.out.println("Quantidade de números positivos: " + contador);
    }
}

/*
int[] numeros → cria um array com números positivos, negativos e zero.
int contador = 0; → começa o contador em zero.
for → percorre todos os elementos do array.
if (numeros[i] > 0) → verifica se o número é positivo.
contador++; → aumenta o contador em 1 sempre que encontra um número positivo.
 */