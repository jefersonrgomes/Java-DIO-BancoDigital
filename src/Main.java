import Accounts.Cliente;
import Starter.StartBank;

public class Main {
    public static void main(String[] args) {

        /* EXPECTED DATA
            String nome, Int Idade, Long CPF, Int TipoConta;
            TipoConta:
                 1 for Accounts.ContaCorrente;
                 2 for Accounts.ContaPoupanca;
        */

        StartBank initstartBank = new  StartBank();
       initstartBank.starterbank();
      //  System.out.println(julio.dadosClienteConta());

        //julio.getConta() .imprimirExtrato();

     //   System.out.println(Renan.dadosClienteConta());

     //   Renan.getConta().depositar(7000);
     //   Renan.getConta().imprimirExtrato();
        //System.out.println(Renan.getConta().saldo);
    //   Renan.getConta().transferir(3000, julio.getConta(), julio.getNome());

        //julio.getConta().sacar(4000);

    }
}
