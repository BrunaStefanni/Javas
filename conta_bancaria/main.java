public class main {
    
}


public class Main {

    public static void main(String[] args) {

        account_bank conta1 = new account_bank("Bruna", 200);
        account_bank conta2 = new account_bank("Jéssica", 100);

        // A Bruna deposita 50 €
        conta1.deposit(50);

        // A Bruna tenta levantar 30 €
        boolean levantamento = conta1.withdraw(30);
        System.out.println("Levantamento efetuado: " + levantamento);

        // A Bruna transfere 70 € para o Jéssica
        boolean transferencia = conta1.transfer(conta2, 70);
        System.out.println("Transferência efetuada: " + transferencia);

        // Mostrar as duas contas
        conta1.show();
        conta2.show();
    }
}
