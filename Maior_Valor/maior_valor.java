public class maior_valor {

    public static void main(String[] args) {

        int[] numeros = {10, 25, 7, 40, 15};

        int maior = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                    maior = numeros[i];
            }
        }

            System.out.println("O maior valor é: " + maior);

    }
}


/*
int[] numeros → cria um array com 5 números.
int maior = numeros[0]; → considera inicialmente que o primeiro número é o maior.
for → percorre os restantes números do array.
if (numeros[i] > maior) → verifica se o número atual é maior.
maior = numeros[i]; → se for maior, atualiza o valor guardado.
 */