package Views;

import Services.Validacao;

import java.util.Scanner;

public class Imprimir {
    static Scanner sc = new Scanner(System.in);
    static String opcao = " ";
    static String Cp = " ";
    static String myTela = " ";


    public static void entradaOpcao() {

        System.out.println("Bem vindo!!! ");
        System.out.println("Escolha uma das opções informando o número da opção: ");
        System.out.println(" 1 - Cadastrar vendedor.");
        System.out.println(" 2 - Cadastrar Cliente.");
        System.out.println(" 3 - Cadastrar Produto.");
        System.out.println(" 4 - Sair do sistema.");
        System.out.println(" ");
        opcao = sc.nextLine();

        Validacao.chamadaCadastro(opcao);
    }




    public static void telaSairOuNao() {
        System.out.println(" ");
        System.out.println("Deseja fazer um novo cadastro?");
        System.out.println(" ");
        System.out.println("Digite sim para fazer um novo cadastro");
        System.out.println("Digite nao para voltar ao inicio");
        System.out.println(" ");
        System.out.println(" ");
        Cp = sc.nextLine();

        Validacao.finalizarOuContinuar(Cp, myTela);


    }

}
