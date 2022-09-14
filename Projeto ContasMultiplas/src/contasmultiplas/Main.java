package contasmultiplas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String auxiliar;
        int opcao, numero, numero2;
        double deposito, saque, tranferencia;
        ArrayList <ContasMultiplas> listConta = new ArrayList();


        ContasMultiplas conta, conta2;

        do {

            System.out.println("\n----Menu----");
            System.out.println("Digite o número 1 para Criar uma Conta");
            System.out.println("Digite o número 2 para obter Dados Bancários");
            System.out.println("Digite o número 3 para realizar Depósito");
            System.out.println("Digite o número 4 para realizar Saque");
            System.out.println("Digite o número 5 para realizar Transferência");
            System.out.println("Digite o número 0 para sair do Menu\n");

            System.out.println("Opção: ");
            opcao = scan.nextInt();
            //considerado lixo de input, pois estava com problema em recolher o nome do titular na opção 1
            scan.nextLine();
            switch (opcao){
                case 1:
                    System.out.println("Digite o nome do titular: ");
                    auxiliar = scan.nextLine();
                    conta = new ContasMultiplas(auxiliar);
                    listConta.add(conta);
                    System.out.println("Conta criada com sucesso!");
                    break;
                case 2:
                    System.out.println("Digite o número da conta: ");
                    numero = scan.nextInt();
                    conta = listConta.get(numero - 1);
                    conta.dadosBancarios();
                    break;
                case 3 :
                    System.out.println("Digite o número da conta: ");
                    numero = scan.nextInt();
                    conta = listConta.get(numero - 1);
                    System.out.println("Digite o valor do depósito: ");
                    deposito = scan.nextDouble();
                    conta.depositar(deposito);
                    break;
                case 4:
                    System.out.println("Digite o número da conta: ");
                    numero = scan.nextInt();
                    conta = listConta.get(numero - 1);
                    System.out.println("Digite o valor do saque: ");
                    saque = scan.nextDouble();
                    conta.sacar(saque);
                    break;
                case 5:
                    System.out.println("Digite o número da conta de origem: ");
                    numero = scan.nextInt();
                    conta = listConta.get(numero - 1);

                    System.out.println("Digite o número da conta de destino: ");
                    numero2 = scan.nextInt();
                    conta2 = listConta.get(numero2 - 1);
                    System.out.println("Digite o valor da transferência: ");
                    tranferencia = scan.nextDouble();
                    conta.transferir(conta2, tranferencia);
                    break;
                case 0:
                    System.out.println("\nSaindo do Menu...\n");
                    break;
                default:
                    if(opcao != 0)
                    System.out.println("Digite uma opção válido");
                    break;
            }
        }while(opcao != 0);


    }
}
