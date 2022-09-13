package contaunica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String auxiliar;
        int opcao;
        double deposito;
        double saque;

        System.out.println("Digite o titular da conta: ");
        auxiliar = scan.nextLine();

        Conta conta = new Conta(auxiliar);
        //conta.dadosBancarios();

        do {

            System.out.println("\n----Menu----");
            System.out.println("Digite o número 1 para obter Dados Bancários");
            System.out.println("Digite o número 2 para realizar Depósito");
            System.out.println("Digite o número 3 para realizar Saque");
            System.out.println("Digite o número 0 para sair do Menu\n");

            System.out.println("Opção: ");
            opcao = scan.nextInt();
            switch (opcao){
                case 1:
                    conta.dadosBancarios();
                    break;
                case 2 :
                    System.out.println("Digite o valor do depósito: ");
                    deposito = scan.nextDouble();
                    conta.depositar(deposito);
                    break;
                case 3:
                    System.out.println("Digite o valor do saque: ");
                    saque = scan.nextDouble();
                    conta.sacar(saque);
                    break;
                case 0:
                    System.out.println("Saindo do Menu...");
                    break;
            }
        }while(opcao != 0 && opcao <= 3);


    }
}
