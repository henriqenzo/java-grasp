package ucb.aplicacao.view;

import ucb.aplicacao.model.ItemPedido;
import ucb.aplicacao.model.Pagamento;
import ucb.aplicacao.model.Pedido;

public class PedidoView {

    public void exibirResumo(Pedido pedido) {
        System.out.println("\nResumo do Pedido:");
        for (ItemPedido item : pedido.getItens()) {
            System.out.println(" - " + item);
        }
        System.out.println("Total: R$ " + pedido.calcularTotal());

        Pagamento pagamento = pedido.getPagamento();
        if (pagamento != null) {
            pagamento.processarPagamento(pedido.calcularTotal());
        }
    }

}
