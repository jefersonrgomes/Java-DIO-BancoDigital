
public class ContaCorrente extends Conta{

    protected final String TipoConta = "Conta Corrente";

    @Override
    public String imprimirExtrato() {
        return "\n*** SEJA BEM VINDO AO DIO BANK ***\n" + "Tipo de Conta: " + TipoConta + "\nAgencia: " + agencia + "\nConta Poupança: " + numeroConta + "\nSaldo Disponivel: " + saldo;
    }
}
