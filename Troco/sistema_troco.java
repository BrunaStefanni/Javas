import java.util.Scanner;

public class sistema_troco {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor a pagar: ");
        double valorAPagar = sc.nextDouble();
        System.out.print("Valor pago: ");
        double valorPago = sc.nextDouble();

        double troco = valorPago - valorAPagar;

        if (troco >= 0) {
            System.out.println("Troco: " + troco);
        } else {
            System.out.println("Valor pago insuficiente. Falta: " + (-troco));
        }
    }

}