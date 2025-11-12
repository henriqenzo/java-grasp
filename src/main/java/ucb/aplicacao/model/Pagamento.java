package ucb.aplicacao.model;

/*
Princípio GRASP: Polymorphism
A classe abstrata Pagamento permite tratar diferentes formas de pagamento através
de uma interface comum, evitando o uso de condicionais (if/switch) e facilitando a extensão do sistema.
*/

public abstract class Pagamento {
    public abstract void processarPagamento(double valor);
}
