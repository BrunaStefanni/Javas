import java.util.Scanner;

public class palindromo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();

        String inversa = "";

        for (int i = palavra.length() - 1; i >= 0; i--) {
            inversa = inversa + palavra.charAt(i);
        }

        if (palavra.equalsIgnoreCase(inversa)) {
            System.out.println("É um palíndromo!");
        } else {
            System.out.println("Não é um palíndromo!");
        }

        sc.close();
    }
}

/*
Ler a palavra: String palavra = sc.nextLine(); ~Guarda a palavra que o utilizador escreve.

Criar uma palavra invertida: String inversa = ""; ~Começamos com uma String vazia.

Percorrer a palavra ao contrário:
for (int i = palavra.length() - 1; i >= 0; i--) {
    inversa = inversa + palavra.charAt(i);
}
palavra.length() - 1 → começa na última posição.
i >= 0 → continua até chegar à primeira posição.
i-- → diminui a posição em 1.
charAt(i) → obtém a letra da posição atual.

Comparar as palavras: if (palavra.equalsIgnoreCase(inversa))
~Compara a palavra original com a palavra invertida, ignorando diferenças entre maiúsculas e minúsculas.
 */