import java.util.ArrayList;

public class Pedido {
    private ArrayList<Profuto> listaProdutos;
    private float custoPedido;
    private float valorEntrega;
    private String tipoDeEntrega;
    Entrega entrega;

    public Pedido(ArrayList<Profuto> listaProdutos, float custoPedido, float valorEntrega, String tipoDeEntrega) {
        this.listaProdutos = listaProdutos;
        this.custoPedido = custoPedido;
        this.valorEntrega = valorEntrega;
        this.tipoDeEntrega = tipoDeEntrega;
    }

    public ArrayList<Profuto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(ArrayList<Profuto> listaProdutos) {
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

        for (Profuto profuto : listaProdutos) {
            valorTotal += profuto.getValor();
        }

        return valorTotal;
    }

    private float calcularPeso() {
        float pesoTotal = 0;

        for (Profuto profuto : listaProdutos) {
            pesoTotal += profuto.getPeso();
        }

        return pesoTotal;
    }

    private String escolherTipoEntrega(String tipoDeEntrega) {

        switch (tipoDeEntrega.toUpperCase().trim()) {
            case "PAC":
                valorEntrega = entrega.calcularPAC(calcularPeso());
                return "PAC escolhido com sucesso.";
            case "SEDEX":
                valorEntrega = entrega.calcularSedex(calcularPeso());
                return "Sedex escolhido com sucesso.";
            case "RETIRAR":
                valorEntrega = 0;
                return "Retirar na loja escolhido com sucesso.";
            default:
                return "Escolha uma opção válida.";
        }
    }
}
