package Starter;

import Accounts.Cliente;
import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Options {


    public void options() {
        Cliente Julio = new Cliente(
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



        int valor = 0;
        Scanner ler = new Scanner(System.in);
        Presentation testePresentation = new Presentation();

        System.out.println(
                "*********************************************************\n" +
                "***  WELLCOME TO DIO BANK | #MAKE THE CHANGE!         ***\n" +
                "*********************************************************\n"+
                "BEM VINDO SR. " + Julio.getNome() + " | AG: " + Julio.getConta().getAgencia() + " | CONTA: " + Julio.getConta().getNumeroConta() +
                "\n***** SELECIONE UMA OPERAÇÃO *****\n\n" +
                "1 - CONSULTAR DIO-CONTA\n" +
                "2 - DEPOSITAR DIO-CONTA\n" +
                "3 - SACAR DA  DIO-CONTA\n" +
                "4 - EXTRATO   DIO-CONTA\n" +
                "5 - TRANSFERIR PARA OUTRA DIO-CONTA\n" +
                "6 - SAIR / EXIT\n");
        String opcaoSelecionada = ler.next();
        switch (opcaoSelecionada) {
            case "1" -> {
                System.out.println("***** DIO BANK - CONSULTA DE SALDO *****");
                System.out.println("Voce escolheu a opção 1 CONSULTAR SALDO");
                System.out.println("Seu Saldo Atual é de R$: " + Julio.getConta().getSaldo() + "\n");
                options();
            }

            case "2" -> {
                System.out.println("***** DIO BANK - DEPOSITAR *****");
                System.out.println("Voce escolheu a opção 1 DEPOSITAR");
                System.out.println("Informe o valor do Deposito");
                valor = Integer.parseInt(ler.next());
                Julio.getConta().depositar(valor);
                options();

            }
            case "3" -> {
                System.out.println("***** DIO BANK - SACAR *****");
                System.out.println("Voce escolheu a opção 3 SACAR");
                System.out.println("!!! IMPORTANTE !!!" +
                        "Para realizar saque, informe um valor Igual ou Menor ao seu valor de Saldo Atual" +
                        "Seu Saldo Atual é de R$: " + Julio.getConta().getSaldo());

                System.out.println("Digite o valor do saque\n");
                valor = Integer.parseInt(ler.next());
                Julio.getConta().sacar(valor);
                options();

            }

            case "4" -> {
                System.out.println("***** DIO BANK - EXTRATO BANCARIO *****");

                System.out.println("Voce escolheu a opção 4 VER EXTRATO");
                options();

            }
            case "5" -> {
                System.out.println("***** DIO BANK - TRANSFERENCIA *****");

                System.out.println("Voce escolheu a opção 5 TRANSFERIR");
                options();

            }


            case "6" -> {
                System.out.println("***** DIO BANK - SAIR *****");
                System.out.println("Voce escolheu a opção 6 SAIR");
                System.out.println("Até a proxima!");
                testePresentation.presentation();
                options();
            }
            default -> {
                System.out.println("Opção invalida, escolha uma das opção entre 1 a 6");
                options();
            }
        }
    }
}