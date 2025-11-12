package ucb.aplicacao;

import ucb.aplicacao.controller.PedidoController;
import ucb.aplicacao.view.PedidoView;
import ucb.aplicacao.model.*;

public class Main {
    public static void main(String[] args) {
        PedidoController controller = new PedidoController();
        PedidoView view = new PedidoView();

        Produto p1 = new Produto("Notebook", 3500.0);
        Produto p2 = new Produto("Mouse", 150.0);

        Pedido pedido = controller.criarPedido();
        controller.adicionarItem(pedido, p1, 1);
        controller.adicionarItem(pedido, p2, 2);

        controller.finalizarPedido(pedido, new PagamentoPix());

        view.exibirResumo(pedido);
    }
}