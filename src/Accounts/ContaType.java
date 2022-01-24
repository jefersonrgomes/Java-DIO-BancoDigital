package Accounts;

public enum ContaType {

    CONTA_CORRENTE("Accounts.Conta Corrente"),
    CONTA_POUPANCA("Accounts.Conta Poupança");


    public String TipoConta ;
    ContaType(String tipo){
        TipoConta = tipo;
    }

}
