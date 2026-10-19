public class metodo {
    // toLowerCase() para converter o texto para minúsculas.
    //length() para obter o comprimento do texto.
    //charAt(i) para obter o caráter na posição i.

    // 1. Imprime um caráter várias vezes
    public static void printLine(int n, char c) {
        for (int i = 0; i < n; i++) {
            System.out.print(c); // Imprime o caráter
        }
        System.out.println(); // Muda de linha
    }

    // 2. Devolve o quadrado de um número
    public static int square(int x) {
        return x * x; // Multiplica o número por ele próprio
    }

    // 3. Devolve o maior de dois números
    public static int max(int a, int b) {
        if (a > b) {
            return a; // Se a for maior, devolve a
        } else {
            return b; // Caso contrário, devolve b
        }
    }

    // 4. Verifica se um número é par
    public static boolean isEven(int n) {
        return n % 2 == 0; // Se o resto for 0, é par
    }

    // 5. Calcula a média dos números de um array
    public static double average(double[] values) {
        double soma = 0;

        // Percorre todos os números do array
        for (int i = 0; i < values.length; i++) {
            soma = soma + values[i];
        }

        // Divide a soma pela quantidade de números
        return soma / values.length;
    }

    // 6. Conta as vogais de um texto
    public static int countVowels(String text) {
        int contador = 0;

        // Percorre todas as letras do texto
        for (int i = 0; i < text.length(); i++) {

            // Converte a letra para minúscula
            char letra = Character.toLowerCase(text.charAt(i));

            // Verifica se a letra é uma vogal
            if (letra == 'a' || letra == 'e' ||
                    letra == 'i' || letra == 'o' ||
                    letra == 'u') {

                contador++; // Aumenta o contador
            }
        }

        return contador; // Devolve o número de vogais
    }

    // Método principal: executa os testes
    public static void main(String[] args) {

        printLine(5, '*');

        System.out.println(square(4));

        System.out.println(max(10, 7));

        System.out.println(isEven(8));

        double[] numeros = {10, 20, 30, 40};
        System.out.println(average(numeros));

        System.out.println(countVowels("Programming in Java"));
    }

}
