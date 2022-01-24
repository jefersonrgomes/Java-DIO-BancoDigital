package Accounts;

import Accounts.Conta;

public interface IConta {

    /*** METODOS ***/
     void sacar(double valor);

     void depositar(double valor);

     //void transferir(double valor, Accounts.Conta contaDestino);

     void transferir(double valor, Conta clienteContaDestino, String titularContaDestino);

     String imprimirExtrato();

}
