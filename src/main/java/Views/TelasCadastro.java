package Views;


import java.util.Scanner;
import Domain.Salespersons;

public class TelasCadastro {

    static Salespersons salesperson = new Salespersons();
    static Scanner sc = new Scanner(System.in);


    public static void cadastroVendedor() {
        System.out.println(" ");
        System.out.println("Digite o nome do vendedor que deseja cadastrar: ");

        salesperson.name = sc.nextLine();
//
        System.out.println("Digite o sobrenome do vendedor: ");
        salesperson.lastName = sc.nextLine();

        System.out.println("Digite o telefone do vendedor: ");
        salesperson.phoneNamber = sc.nextLine();

        System.out.println("Digite o cpf do vendedor: ");
        salesperson.cpf = sc.nextLine();

        System.out.println("Digite o Email do vendedor: ");
        salesperson.email = sc.nextLine();

        System.out.println("Digite o endereço do vendedor: ");
        salesperson.address = sc.nextLine();

    }
}
