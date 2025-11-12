# Princípios GRASP 

Este projeto foi desenvolvido com o objetivo de demonstrar a aplicação prática de quatro princípios GRASP (General Responsibility Assignment Software Patterns): 
* Controller
* Creator
* Low Coupling
* Polymorphism.

O projeto simula um mini-sistema de pedidos, onde é possível retratar as vantagens no uso deles.

_______

## Justificativa dos princípios aplicados:

Na classe PedidoController foi aplicado o **Controller**, a fim de centralizar o fluxo de criação e finalização de pedidos, isolando a lógica de controle da interface e das entidades. Isso garante que o controle do sistema não fique espalhado entre as classes de domínio, tornando o código mais organizado e fácil de manter.

Na classe Pedido foi aplicado o **Creator**, já que ela é responsável por criar seus próprios objetos ItemPedido, pois conhece as informações necessárias para instanciá-los. Essa decisão reduz o acoplamento entre as classes e segue o princípio de que o criador deve ser aquele que possui ou utiliza intensivamente os objetos criados.

Nas classes PedidoController e Pedido é possível perceber o **Low Coupling**, pois o sistema foi estruturado de forma que cada classe tenha uma responsabilidade bem definida e mínima dependência de detalhes internos de outras classes. Favorecendo a manutenção e a reutilização do código.

Na classe abstrata Pagamento e suas subclasses concretas foi aplicado o **Polymorphism**, pois a classe Pagamento define a interface comum, enquanto suas subclasses implementam comportamentos específicos, evitando o uso de estruturas condicionais (if/switch).
