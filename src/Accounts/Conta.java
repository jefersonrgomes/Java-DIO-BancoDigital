package Accounts;

import Starter.Options;

public abstract class Conta implements IConta {
    Options initoptions = new Options();
    /*** ATRIBUTOS ***/
    private static final int AGENCIA_PADRAO = 0001;
    private static int SEQUENCIAL = 000001;
    protected int agencia;
    protected int numeroConta;
    protected double saldo;

    /*** CONSTRUTOR ***/
    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numeroConta = Conta.SEQUENCIAL++;
    }

    /*** GETTERS AND SETTERS ***/
    public int getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /*** METODOS E SOBRECARGAS***/

    @Override
    public void depositar(double valor) {
        if (valor < 0) System.out.println("Informe um valor positivo de deposito!");
        else {
            saldo += valor;
            System.out.println("Deposito realizado com sucesso" +
                               "\nvalor do Deposito: " + valor +
                               "\nSaldo atual: " + saldo + "\n\n");
            initoptions.options();
        }
    }

    @Override
    public void sacar(double valor) {
        boolean checker = true;
        do {
            try {
                if (saldo >= valor) {
                    saldo -= valor;
                    System.out.println("Saque realizado com sucesso" +
                                       "\nvalor do saque: " + valor +
                                       "\nSaldo atual: " + saldo);
                    initoptions.options();
                    checker = false;
                } else if (saldo < valor) {
                    System.out.println("Valor indisponivel para Saque!");
                    System.out.println("Para saques informe um valor igual ou menor ao do seu saldo atual\n" +
                                       "Saldo Atual RS:" + saldo + "\n\n");
                    initoptions.options();
                }
            } catch (NumberFormatException e) {
                System.out.println("Valor Invalido, para esta operação informe apenas valores numericos!");
            }
        } while (checker);
    }


    @Override
    public void transferir(double valor, Conta clienteContaDestino, String titularContaDestino) {
        if (saldo < valor) {
            System.out.println("Valor indisponivel para Transferencia!");
            initoptions.options();
        } else {
            System.out.println("Transferencia realizada com sucesso!\n");
            System.out.println("Transferido valor de R$:" + valor + " para conta: " + titularContaDestino + clienteContaDestino.numeroConta);
            this.sacar(valor);
            clienteContaDestino.depositar(valor);
            System.out.println("Saldo atualizado para R$:" + saldo);
        }
        initoptions.options();
    }

    protected String getString(String tipodaconta) {
        return "\n--- --- ---\n*** DADOS DA CONTA ***\n" + tipodaconta + "\nAgencia: " + agencia + "\nAccounts.Conta Poupança: " + numeroConta + "\nSaldo Disponivel: " + this.saldo + "\n--- --- ---\n";
    }
}

