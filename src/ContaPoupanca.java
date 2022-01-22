public class ContaPoupanca extends Conta{
    protected final String TipoConta = "Conta Poupança";

    @Override
    public String imprimirExtrato() {

        return getString(TipoConta);
        //"Tipo de Conta: " + TipoConta +
    }
}
