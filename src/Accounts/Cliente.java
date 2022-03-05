package Accounts;

public class Cliente {
    /*** ATRIBUTOS ***/
    private String nome;
    private int Idade;
    private long CPF;
    private String login;
    private String password;
    private int TipoConta;
    private Conta conta;
    /*** CONSTRUTORES ***/
    public Cliente(){}

    public Cliente(String name, int Idade, long CPF, String login, String password)
    {
        this.nome = name;
        this.Idade = Idade;
        this.CPF = CPF;
        this.login = login;
        this.password = password;
    }

    public Cliente(String nome, int Idade, long CPF, int tipoConta, String login, String password)
    {
        this.nome = nome;
        this.Idade = Idade;
        this.CPF = CPF;
        this.TipoConta = tipoConta;
        if(this.TipoConta == 1) this.conta = new ContaCorrente();
        else this.conta = new ContaPoupanca();
        this.login = login;
        this.password = password;
    }
    /*** GETTERS AND SETTERS ***/
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
    /*** MÉTODOS ***/
    public String dadosCliente(){
        return "*** SEJA BEM VINDO AO DIO BANK ***\n\n*** DADOS DO CLIENTE DIO BANK ***\n" + "nome: " + nome + "\nIdade: " + Idade + "\nCPF: " + CPF;
    }

    public String dadosClienteConta(){
    return  "*** SEJA BEM VINDO AO DIO BANK ***\n\n*** DADOS DO CLIENTE ***\n"+"nome: " + nome + "\nIdade: " + Idade + "\nCPF: " + CPF + getConta().saldo ;
    }
}
