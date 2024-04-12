import java.util.ArrayList;
import java.util.List;

public class Cartao {
    private double limite;
    private double saldo;
    private List<Compra> listaDeCompras;

    public void definirLimite(double limite) {
        this.saldo = limite;
        this.limite = limite;
        this.listaDeCompras = new ArrayList<>();
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getListaDeCompras() {
        return listaDeCompras;
    }

    public boolean lancaCompra(Compra compra) {
        if (compra.getValorCompra() <= this.saldo) {
            this.saldo -= compra.getValorCompra();
            listaDeCompras.add(compra);

            return true;
        } else {

            return false;
        }
    }

}
