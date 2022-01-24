package Accounts;

import Accounts.Conta;

public class ContaPoupanca extends Conta {
    protected final String TipoConta = "Accounts.Conta Poupança";

    @Override
    public String imprimirExtrato() {

        return getString(TipoConta);
        //"Tipo de Accounts.Conta: " + TipoConta +
    }
}
