import java.util.ArrayList;

public class Pedido {
    private ArrayList<Produto> listaProdutos;
    private double custoPedido;
    private double valorEntrega;
    private TipoEntrega tipoDeEntrega;
    Entrega entrega;

    public Pedido(ArrayList<Produto> listaProdutos, double custoPedido, double valorEntrega, TipoEntrega tipoDeEntrega) {
        this.listaProdutos = listaProdutos;
        this.custoPedido = calcularCustoPedidos();
        this.valorEntrega = valorEntrega;
        this.tipoDeEntrega = tipoDeEntrega;
        this.entrega = new Entrega();
    }

    public ArrayList<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public double getCustoPedido() {
        return custoPedido;
    }

    public double getValorEntrega() {
        return valorEntrega;
    }

    public TipoEntrega getTipoDeEntrega() {
        return tipoDeEntrega;
    }

    private double calcularCustoPedidos() {
        double valorTotal = 0;
        for (Produto produto : listaProdutos) {
            valorTotal += produto.getValor();
        }
        return valorTotal;
    }

    private double calcularPeso() {
        double pesoTotal = 0;
        for (Produto produto : listaProdutos) {
            pesoTotal += produto.getPeso();
        }
        return pesoTotal;
    }

    public void escolherTipoEntrega(TipoEntrega tipoEntrega) {
        this.tipoDeEntrega = tipoEntrega;
        double pesoTotal = calcularPeso();
        valorEntrega = entrega.calcular(tipoEntrega, pesoTotal);
    }

    public double calculoTotal() {
        return custoPedido + valorEntrega;
    }

    @Override
    public String toString() {
        return "Valor final: R$ " + calculoTotal();
    }
}
