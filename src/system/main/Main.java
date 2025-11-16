package system.main;
import system.service.User;
import system.service.UserService;
import system.ui.Menu;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        User user = new User("Felipe Morales", 123456789, 1, 0.0);
        int opcao;
        double valor;
        do {
            System.out.println("--- MENU ---\n");
            System.out.println("1 - Sacar Dinheiro");
            System.out.println("2 - Depositar Dinheiro");
            System.out.println("3 - Verificar Saldo");
            System.out.println("4 - Encerrar");
            opcao = scn.nextInt();
            switch(opcao){
                case 1:
                System.out.print("Valor para sacar: ");
                valor = scn.nextDouble();
                user.sacarSaldo(valor);
                break;
                case 2:
                System.out.print("Valor para depositar: ");
                valor = scn.nextDouble();
                user.somarSaldo(valor);
                break;
                case 3:
                user.informarSaldo();
                break;
                case 4:
                System.out.println("Encerrado...");
                break;
                default: System.out.println("Opção inválida!");
            }
        } while (opcao != 4);
        scn.close();
    }
}
