package ucb.aplicacao.model;

import java.util.ArrayList;
import java.util.List;

/* Princípio GRASP: Creator
Classe Pedido cria seus próprios ItemPedido, pois conhece os dados necessários para instanciá-los, reduzindo o acoplamento.
*/

public class Pedido {
    private List<ItemPedido> itens = new ArrayList<>();
    private Pagamento pagamento;

    // GRASP: Creator
    public void adicionarItem(Produto produto, int quantidade) {
        ItemPedido item = new ItemPedido(produto, quantidade);
        itens.add(item);
    }

    public void definirPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public double calcularTotal() {
        return itens.stream().mapToDouble(ItemPedido::calcularSubtotal).sum();
    }

    public List<ItemPedido> getItens() { return itens; }
    public Pagamento getPagamento() { return pagamento; }
}
