import java.util.Scanner;

public class calculadora_funcao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("OPERADORES DECLARADOS: + , - , * , /");

        System.out.print("Primeiro Valor: ");
        double firstValue = sc.nextDouble();

        System.out.print("Escolha um Operador: ");
        String operador = sc.next();

        System.out.print("Segundo Valor: ");
        double secondValue = sc.nextDouble();

        double result = 0;

        switch (operador.charAt(0)) {
            case '+' -> result = firstValue + secondValue;
            case '-' -> result = firstValue - secondValue;
            case '*' -> result = firstValue * secondValue;
            case '/' -> result = firstValue / secondValue;
            default -> System.out.println("Operação não encontrada!");
        }

        System.out.println("Resultado: " + result);

        sc.close();
    }
}