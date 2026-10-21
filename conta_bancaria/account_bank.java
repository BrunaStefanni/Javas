public class account_bank { // Class para Contas Bancárias

    private String owner; // guarda o nome ddo titular
    private double balance; // guarda o saldo
    private int transactionCount; // conta o nr de depósitos e levantamentos



// Construtor com saldo inicial igual a zero
public account_bank(String owner) { // construtor 
    this.owner = owner; // nnome do objeto + valor recebido
    this.balance = 0;
    this.transactionCount = 0;
}

// Construtor com saldo inicial indicado
public account_bank(String owner, double balance) {
    this.owner = owner;
    this.balance = balance;
    this.transactionCount = 0;
}

public void deposit(double amount) { // método depósito
    if (amount <= 0) { // recusando valores igual a zero
        System.out.println("Valor de depósito inválido.");
        return;
    }

    balance += amount;
    transactionCount++;
}

public boolean withdraw(double amount) { // método sobre levantamentos, saques
    if (amount <= 0 || amount > balance) { // impede que levante com saldo negativo, igual a zero ou superior ao saldo disponível
        return false;
    }

    balance -= amount;
    transactionCount++;
    return true;
}

public boolean transfer(account_bank target, double amount) { // método de transferência
    if (this.withdraw(amount)) { // sobre transferências com saldo disponível e falso para indisponível ou insuficiente.
        target.deposit(amount);
        return true;
    }

    return false;
}

public void show() { // médoto para mostrar o nome do titular, saldo e movimentações de conta.
    System.out.println("=== ACCOUNT BANK ===");
    System.out.println("Titular: " + owner);
    System.out.println("Saldo: " + balance + " €");
    System.out.println("Movimentos: " + transactionCount);
    System.out.println("===================");

}

}