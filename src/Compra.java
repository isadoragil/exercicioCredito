public class Compra implements Comparable<Compra>{
    private double valorCompra;
    private String produto;

    public Compra(double valorCompra, String produto) {
        this.valorCompra = valorCompra;
        this.produto = produto;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public String getProduto() {
        return produto;
    }

    //comparar valor da compra
    @Override
    public int compareTo(Compra outraCompra) {
        return Double.valueOf(this.valorCompra).compareTo(Double.valueOf(outraCompra.valorCompra));
    }

    @Override
    public String toString() {
        return "Compra - descrição: " + produto + "; valor: " + valorCompra;
    }
}
