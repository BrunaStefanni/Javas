import java.util.Scanner;

public class contar_vogais {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();

        int contador = 0;

        palavra = palavra.toLowerCase();

        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);

            if (letra == 'a' || letra == 'e' || letra == 'i' ||
                    letra == 'o' || letra == 'u') {
                contador++;
            }
        }

        System.out.println("Quantidade de vogais: " + contador);

        sc.close();
    }
}

/*
String palavra → guarda a palavra digitada pelo utilizador.
int contador = 0; → começa a contagem em zero.
palavra.toLowerCase() → transforma todas as letras em minúsculas.
palavra.length() → indica quantos caracteres tem a palavra.
palavra.charAt(i) → permite obter a letra que está numa determinada posição.
if → verifica se a letra é uma vogal.
contador++ → aumenta o contador em 1 quando encontra uma vogal.
O símbolo "||" significa "OU".
length() → conta quantos caracteres existem.
charAt(i) → obtém o carácter de uma posição.
contador++ → aumenta o contador em 1.
 */