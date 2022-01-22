public interface IConta {

    /*** METODOS ***/
     void sacar(double valor);

     void depositar(double valor);

     void transferir(double valor, Conta contaDestino);

     String imprimirExtrato();
    /*** *** ***/

}
