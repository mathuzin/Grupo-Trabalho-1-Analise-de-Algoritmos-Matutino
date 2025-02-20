import java.util.ArrayList;

public class Pedido {
    private ArrayList<Produto> listaProdutos;
    private float custoPedido;
    private float valorEntrega;
    private String tipoDeEntrega;
    Entrega entrega;

    public Pedido(ArrayList<Produto> listaProdutos, float custoPedido, float valorEntrega, String tipoDeEntrega) {
        this.listaProdutos = listaProdutos;
        this.custoPedido = custoPedido;
        this.valorEntrega = valorEntrega;
        this.tipoDeEntrega = tipoDeEntrega;
    }

    public ArrayList<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(ArrayList<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    public float getCustoPedido() {
        return custoPedido;
    }

    public void setCustoPedido(float custoPedido) {
        this.custoPedido = custoPedido;
    }

    public float getValorEntrega() {
        return valorEntrega;
    }

    public void setValorEntrega(float valorEntrega) {
        this.valorEntrega = valorEntrega;
    }

    public String getTipoDeEntrega() {
        return tipoDeEntrega;
    }

    public void setTipoDeEntrega(String tipoDeEntrega) {
        this.tipoDeEntrega = tipoDeEntrega;
    }

    private float calcularCustoPedidos() {
        float valorTotal = 0;

        for (Produto Produto : listaProdutos) {
            valorTotal += Produto.getValor();
        }

        return valorTotal;
    }

    private float calcularPeso() {
        float pesoTotal = 0;

        for (Produto Produto : listaProdutos) {
            pesoTotal += Produto.getPeso();
        }

        return pesoTotal;
    }

    private String escolherTipoEntrega(String tipoDeEntrega) {

        switch (tipoDeEntrega.toUpperCase().trim()) {
            case "PAC":
                valorEntrega = (float) entrega.calcularPAC(calcularPeso());
                return "PAC escolhido com sucesso.";
            case "SEDEX":
                valorEntrega = (float) entrega.calcularSedex(calcularPeso());
                return "Sedex escolhido com sucesso.";
            case "RETIRAR":
                valorEntrega = 0;
                return "Retirar na loja escolhido com sucesso.";
            default:
                return "Escolha uma opção válida.";
        }
    }

    private float calculoTotal() {
        return calcularCustoPedidos() + valorEntrega;
    }

    @Override
    public String toString() {
        return "Valor final: " + calculoTotal();
    }
}
