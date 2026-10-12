import java.util.Scanner;

public class calculadora {

public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduza o primeiro número: ");
        double numero1 = teclado.nextDouble();

        System.out.print("Introduza o segundo número: ");
        double numero2 = teclado.nextDouble();

        System.out.println("Escolha a operação:");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        System.out.print("A sua escolha: ");
        int operacao = teclado.nextInt();

        double resultado;

        if (operacao == 1) {
        resultado = numero1 + numero2;
        System.out.println("Resultado: " + resultado);
        }

        else if (operacao == 2) {
        resultado = numero1 - numero2;
        System.out.println("Resultado: " + resultado);
        }

        else if (operacao == 3) {
        resultado = numero1 * numero2;
        System.out.println("Resultado: " + resultado);
        }

        else if (operacao == 4) {
        if (numero2 != 0) {
            resultado = numero1 / numero2;
            System.out.println("Resultado: " + resultado);
        
            
        } else {
            System.out.println("Erro: não é possível dividir por zero!");

        }
            
        } else {
            System.out.println("Operação inválida!");
            }

        teclado.close();
    }
}
    

