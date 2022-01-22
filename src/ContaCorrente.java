
public class ContaCorrente extends Conta{

    protected final String TipoConta = "Conta Corrente";

    @Override
    public String imprimirExtrato() {
        return getString(TipoConta);    }
}
