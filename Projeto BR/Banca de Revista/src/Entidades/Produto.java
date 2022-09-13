package Entidades;

public abstract class Produto {
    private int codigo;
    private String nome;
    private double valorUnitario;
    private static int estoque;

    public Produto(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public void incluirEstoque(int quantidade){
        estoque = estoque + quantidade;
    }

    private void tirarEstoque(int quantidade){
        if(quantidade <= estoque){
            System.out.println("Não Há produtos no estoque");
        } else {
            estoque = estoque - quantidade;
        }

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public int getEstoque() {
        return estoque;
    }

}
