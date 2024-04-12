import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cartao cartao = new Cartao();

        System.out.printf("Digite o limite do cartão: ");
        double limite = sc.nextDouble();
        cartao.definirLimite(limite);

        int opcao = 1;
        while (opcao == 1) {
            System.out.printf("Digite a descrição da compra: ");
            String produto = sc.next();

            System.out.printf("Digite o valor da compra: ");
            double valorCompra = sc.nextDouble();

            boolean compraRealizada = cartao.lancaCompra(produto, valorCompra);

            if (compraRealizada) {
                System.out.println("Compra realizada!\n");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                opcao = sc.nextInt();
            } else {
                System.out.println("Saldo insuficiente!\n");
                opcao = 0;
            }
        }

        Collections.sort(cartao.getListaDeCompras());

        System.out.println("--------------------------------------------");
        System.out.println("COMPRAS REALIZADAS:");
        System.out.println("--------------------------------------------");

        for (Compra compra : cartao.getListaDeCompras()) {
            System.out.printf("%s - %.2f%n%n", compra.getProduto(), compra.getValorCompra());
        }

        System.out.println("--------------------------------------------");
        System.out.println("Saldo do cartão: " + cartao.getSaldo());

    }
}
