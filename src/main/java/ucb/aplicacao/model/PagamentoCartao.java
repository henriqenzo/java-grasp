package ucb.aplicacao.model;

public class PagamentoCartao extends Pagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado com CARTÃO.");
    }
}
