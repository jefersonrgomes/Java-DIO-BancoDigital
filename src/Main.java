public class Main {
    public static void main(String[] args) {

        /*** EXPECTED DATA
        String nome, Int Idade, Long CPF, Int TipoConta;
        TipoConta:
         1 for ContaCorrente;
         2 for ContaPoupanca;
        ***/
        Cliente julio = new Cliente("Julio Batist", 32, 32445647885L, 1);
        Cliente Renan = new Cliente("Renan Santos Maia", 45, 45678912365L, 2);
        Cliente Marcos = new Cliente("Marcos Andrade", 21, 3214567895L, 2);
        Cliente Maria = new Cliente("Maria Aparecida Dos Santos", 19, 4899874124L, 2);
        System.out.println("--- --- ---\n");
        System.out.println(julio.dadosClienteConta());
        System.out.println("--- --- ---\n");

        System.out.println(Renan.dadosClienteConta());
        System.out.println("--- --- ---\n");

        System.out.println(Marcos.dadosClienteConta());
        System.out.println("--- --- ---\n");

        System.out.println(Maria.dadosClienteConta());

    }
}
