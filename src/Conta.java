public abstract class Conta implements IConta{

    /*** ATRIBUTOS ***/
    private static final int AGENCIA_PADRAO = 0001;
    private static int SEQUENCIAL = 000001;
    protected int agencia;
    protected int numeroConta;
    protected double saldo = 0.0;
    /*** *** ***/

    /*** CONSTRUTOR ***/
    public Conta(){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numeroConta = Conta.SEQUENCIAL++;
    }
    /*** *** ***/

    /*** GETTERS ***/
    public int getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    @Override
    public void sacar(double valor) {
        if(saldo < valor) System.out.println("Valor indisponivel para Saque!");
        else saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if(saldo < valor)             System.out.println("Valor indisponivel para Saque!");
        else{
            System.out.println("Transferencia realizada com sucesso!");
            System.out.println("Transferido valor de R$:" + valor + " para conta: " + contaDestino);
            this.sacar(valor);
            contaDestino.depositar(valor);
            System.out.println("Saldo atualizado para R$:" + saldo);
        }
    }
    /*** *** ***/

    protected String getString(String tipodaconta) {
        return "\n--- --- ---\n*** DADOS DA CONTA ***\n"  + tipodaconta + "\nAgencia: " + agencia + "\nConta Poupança: " + numeroConta + "\nSaldo Disponivel: " + saldo +  "\n--- --- ---\n";
    }
}
