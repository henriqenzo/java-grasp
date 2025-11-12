package ucb.aplicacao.controller;

import ucb.aplicacao.model.Pagamento;
import ucb.aplicacao.model.Pedido;
import ucb.aplicacao.model.Produto;

/*
Princípio GRASP: Controller
Classe PedidoController centraliza o fluxo de criação e finalização de pedidos,
isolando a lógica de controle da interface e das entidades.
*/

/*
Princípio GRASP: Low Coupling
As classes possuem responsabilidades bem separadas e o controlador não acessa detalhes
internos das classes de modelo, mantendo baixo acoplamento entre as camadas.
*/

public class PedidoController {

    public Pedido criarPedido() {
        return new Pedido();
    }

    public void adicionarItem(Pedido pedido, Produto produto, int quantidade) {
        pedido.adicionarItem(produto, quantidade);
    }

    public void finalizarPedido(Pedido pedido, Pagamento pagamento) {
        pedido.definirPagamento(pagamento);
    }

    public double calcularTotal(Pedido pedido) {
        return pedido.calcularTotal();
    }
}
