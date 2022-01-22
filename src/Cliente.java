public class Cliente {
    /*** ATRIBUTOS ***/
    private String nome;
    private int Idade;
    private long CPF;
    private int TipoConta;
    private Conta conta;
    //private byte ContaType;
    /*** *** ***/

    /*** CONSTRUTORES ***/
    public Cliente(){

    }

    public Cliente(String nome, int Idade, long CPF){
        this.nome = nome;
        this.Idade = Idade;
        this.CPF = CPF;
    }

    public Cliente(String nome, int Idade, long CPF,  int tipoConta)
    {
        this.nome = nome;
        this.Idade = Idade;
        this.CPF = CPF;
        this.TipoConta = tipoConta;
        if(this.TipoConta == 1) this.conta = new ContaCorrente();
        else this.conta = new ContaPoupanca();
    }

    /*** *** ***/

    /*** GETTERS AND SETTERS ***/
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public long getCpf() {
        return CPF;
    }

    public void setCpf(long CPF) {
        this.CPF = CPF;
    }

    public long getCPF() {
        return CPF;
    }

    public void setCPF(long CPF) {
        this.CPF = CPF;
    }

    public int getTipoConta() {
        return TipoConta;
    }

    public void setTipoConta(int tipoConta) {
        TipoConta = tipoConta;
    }

    /*** *** ***/

    /*** MÉTODOS ***/
    public String dadosCliente(){
        return "*** SEJA BEM VINDO AO DIO BANK ***\n\n*** DADOS DO CLIENTE DIO BANK ***\n" + "nome: " + nome + "\nIdade: " + Idade + "\nCPF: " + CPF;
    }

    public String dadosClienteConta(){
    return  "*** SEJA BEM VINDO AO DIO BANK ***\n\n*** DADOS DO CLIENTE ***\n"+"nome: " + nome + "\nIdade: " + Idade + "\nCPF: " + CPF + conta.imprimirExtrato();
}
    /*** *** ***/
}