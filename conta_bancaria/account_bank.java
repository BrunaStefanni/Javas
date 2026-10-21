public class account_bank { // Class para Contas Bancárias

    private String owner; // guarda o nome ddo titular
    private double balance; // guarda o saldo
    private int transactionCount; // conta o nr de depósitos e levantamentos

}

public account_bank(String owner) { // construtor 
    this.owner = owner; // nnome do objeto + valor recebido
    this.balance = 0;
    this.transactionCount = 0;
}

public account_bank(String owner, double balance) {
    this.owner = owner;
    this.balance = balance;
    this.transactionCount = 0;
}

public void deposit(double amount) { // recusando valores igual a zero
    if (amount <= 0) {
        System.out.println("Valor de depósito inválido.");
        return;
    }

    balance += amount;
    transactionCount++;
}