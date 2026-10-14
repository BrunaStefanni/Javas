import java.util.Scanner;

public class soma_numeros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = 1;
        int soma = 0;

        while (numero != 0) {
            System.out.print("Digite um número (0 para terminar): ");
            numero = sc.nextInt();

            soma = soma + numero;
        }

        System.out.println("A soma dos números é: " + soma);

        sc.close();
    }
}

/*
int numero = 1; → começa com 1 para que o while possa ser executado.
int soma = 0; → inicia a soma em zero.
while (numero != 0) → repete enquanto o número for diferente de zero.
numero = sc.nextInt(); → lê o número digitado pelo utilizador.
soma = soma + numero; → adiciona o número à soma.
Quando digitares 0, o ciclo termina e o programa mostra o resultado.

 */