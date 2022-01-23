public class Main {
    public static void main(String[] args) {
        /* EXPECTED DATA
            String nome, Int Idade, Long CPF, Int TipoConta;
            TipoConta:
                 1 for ContaCorrente;
                 2 for ContaPoupanca;
        */
        Cliente julio = new Cliente(
                "Julio Batist",
                32,
                32445647885L,
                1,
                "julio.batist",
                "Mudar123");

        Cliente Renan = new Cliente(
                "Renan Santos Maia",
                45,
                45678912365L,
                2,
                "renan.maia",
                "Mudar123");


        StartBank startBank = new StartBank();
        System.out.println(startBank.presentation());
        System.out.println(julio.dadosClienteConta());

        julio.getConta() .imprimirExtrato();

        System.out.println(Renan.dadosClienteConta());

        Renan.getConta().depositar(7000);
        Renan.getConta().imprimirExtrato();
        //System.out.println(Renan.getConta().saldo);
       Renan.getConta().transferir(3000, julio.getConta(), julio.getNome());

        //julio.getConta().sacar(4000);

    }
}
