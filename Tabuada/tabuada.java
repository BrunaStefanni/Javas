import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        sc.close();
    }
}

/*
Scanner sc = new Scanner(System.in); → permite ler o número digitado pelo utilizador.
int numero = sc.nextInt(); → guarda o número introduzido.
for (int i = 1; i <= 10; i++) → repete o código 10 vezes, de 1 até 10.
numero * i → calcula a multiplicação.
System.out.println() → mostra o resultado no ecrã.
 */