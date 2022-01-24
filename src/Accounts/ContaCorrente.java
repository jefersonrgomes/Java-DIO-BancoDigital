package Accounts;

import Accounts.Conta;

public class ContaCorrente extends Conta {

    protected final String TipoConta = "Accounts.Conta Corrente";

    @Override
    public String imprimirExtrato() {
        return getString(TipoConta);    }
}
