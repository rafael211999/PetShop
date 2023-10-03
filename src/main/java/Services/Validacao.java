package Services;

import Views.Imprimir;
import Views.TelasCadastro;

public class Validacao {
    public static void chamadaCadastro(String opcao) {
        switch (opcao) {
            case "1":
                TelasCadastro.cadastroVendedor();
                break;
            case "2":
//                Cadastros.cadastroUsuario();
                break;
            case "3":
//                Cadastros.cadastroProduto();
                break;
            case "4":
                break;
            default:
                System.out.println("Escolha uma das opções apresentadas");

        }
    }



    public static void finalizarOuContinuar(String cp, String myTela) {

        if (cp.equals("sim")) {
            System.out.println(" ");

            switch (myTela) {
                case "1":
                    TelasCadastro.cadastroVendedor();
                    break;
                case "2":
//                    TelasCadastro.cadastroUsuario();
                    break;
                case "3":
//                    TelasCadastro.cadastroProduto();
                    break;
            }

        } else if (cp.equals("nao")){
            Imprimir.entradaOpcao();
        }

    }
}
