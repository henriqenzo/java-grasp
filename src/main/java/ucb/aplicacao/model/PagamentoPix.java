package ucb.aplicacao.model;

public class PagamentoPix extends Pagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado via PIX.");
    }
}
