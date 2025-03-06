public class Produto {
    private String nome;
    private double preço;
    private int quantidade;

    // Construtor
    public Produto(String nome, double preço, int quantidade) {
        this.nome = nome;
        this.preço = preço;
        this.quantidade = quantidade;
    }

    // Getters e Setters
    public String getnome() {
        return nome;
    }

    public double getpreço() {
        return preço;
    }

    public int getquantidade() {
        return quantidade;
    }

    public void setquantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // Método para calcular o custo total de cada produto
    public double getTotalCost() {
        return preço * quantidade;
    }

    @Override
    public String toString() {
        return nome + " (preço: $" + preço + ", quantidade: " + quantidade + ")";
    }
}