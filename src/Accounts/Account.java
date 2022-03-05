package Accounts;

import java.util.ArrayList;
import java.util.Scanner;

public class Account {
    public static ArrayList<Cliente> clientes = new ArrayList<>();

    public void FirstAccounts(){
        clientes.add(new Cliente("Julio Batist",
                32,
                32445647885L,
                1,
                "julio.batist",
                "Mudar123"));

        clientes.add(new Cliente("Renan Santos Maia",
                59,
                45678912365L,
                2,
                "renan.maia",
                "Mudar123"));
    }

    public void NewAccount() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o nome do Titular da Conta");
        String nome = ler.next();
        System.out.println("Digite a idade do Titular da Conta");
        int idade = Integer.parseInt(ler.next());
        System.out.println("Digite o CPF do Titular da Conta");
        long cpf = Long.parseLong(ler.next());
        System.out.println("Digite o tipo de conta, 1 para Conta Corrente e 2 para Conta Poupança");
        int tipoconta = Integer.parseInt(ler.next());
        String login = String.valueOf(cpf);
        String password = String.valueOf(cpf);

        System.out.println("Conta Criada com sucesso" +
                "Nome: " + nome + "Idade: " + idade);

        //Utilizando Arraylist para receber novos objetos Cliente
        clientes.add(new Cliente(nome, idade, cpf, tipoconta, login, password));
        for (Cliente x : clientes) {
            System.out.println(x);

        }
    }
}
