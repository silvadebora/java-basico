package contasmultiplas;

import java.util.ArrayList;

public class ContasMultiplas {
    private int numero;
    private String titular;
    private double saldo;

    static int qtdcontas = 0;

    public ContasMultiplas(String pTitular){
        this.titular = pTitular;
        qtdcontas++;
        this.numero = qtdcontas;
        this.saldo = 0;
    }

    public void dadosBancarios(){
        System.out.println("----Dados Bancários----\n");
        System.out.println("- Número: " + this.numero);
        System.out.println("- Titular: " + this.titular);
        System.out.println("- Saldo: " + this.saldo);
        System.out.println("\n----Fim dos Dados Bancários----\n");
    }

    public void depositar(double valor){
        System.out.println("\n----Realizando Depósito----\n");
        System.out.println("Saldo anterior: " + this.getSaldo());
        this.saldo = this.saldo + valor;
        System.out.println("Saldo atual: " + this.getSaldo());
    }

    public void sacar(double valor){
        if (this.saldo < valor){
            System.out.println("Saldo insuficiente");
            System.out.println("Saldo disponível no momento: " + this.saldo);
        } else {
            System.out.println("Saldo anterior: " + this.saldo);
            System.out.println("----Realizando Saque----");
            this.saldo = this.saldo - valor;
            System.out.println("Saldo atual: " + this.saldo);
        }
    }

    public void transferir(ContasMultiplas contaDestino, double valor){
        if (this.saldo < valor){
            System.out.println("Saldo insuficiente");
            System.out.println("Saldo disponível no momento: " + this.saldo);
        } else {
            System.out.println("Saldo anterior: " + this.saldo);
            System.out.println("----Realizando Transferência----");
            this.saldo = this.saldo - valor;
            contaDestino.saldo = this.saldo + valor;
            System.out.println("Saldo atual: " + this.saldo);
        }
        System.out.println("----Fim da Transferência----");
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
