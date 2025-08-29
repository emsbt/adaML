1 - O que acontece se você adicionar mais animais diferentes no futuro?
    Se adicionarmos mais animais diferentes no futuro, basta criar novas classes que implementem a interface Animal (como Pato, Vaca, Leao, etc.). O código existente que percorre a lista de animais e chama emitirSom() continuará funcionando sem nenhuma modificação, demonstrando o princípio do aberto/fechado - aberto para extensão, fechado para modificação.

2 - Por que é interessante usar composição em Desenho em vez de herança?
    A composição é mais interessante porque permite que um Desenho contenha qualquer combinação de formas diferentes (quadrados, círculos, triângulos futuros) sem precisar herdar de múltiplas classes. Com herança, teríamos limitações de herança múltipla e acoplamento rígido. A composição oferece maior flexibilidade e reutilização de código

3 - Por que é mais flexível usar uma interface nesse caso do que criar apenas uma classe Pagamento com vários if/else?
    Usar interface é mais flexível porque:

        Elimina condicionais complexas (if/else ou switch)    
        Permite adicionar novas formas de pagamento sem modificar o código existente    
        Cada classe é responsável por sua própria lógica de pagamento    
        Facilita testes unitários isolados para cada forma de pagamento
        Segue o princípio de inversão de dependência do SOLID

4 - Como o uso de default ajuda a evitar duplicação de código nas classes?
    O uso de métodos default em interfaces permite que você forneça uma implementação padrão para métodos comuns, evitando a necessidade de duplicar esse código em todas as classes que implementam a interface. Isso reduz a redundância e facilita a manutenção, pois qualquer alteração na lógica padrão pode ser feita em um único lugar (na interface) em vez de em cada classe individualmente.O método default ajuda a evitar duplicação permitindo que múltiplas classes compartilhem uma implementação comum (como Carro e Moto que usam o método padrão), enquanto classes com comportamentos diferentes (como Bicicleta) podem sobrescrever apenas quando necessário. Isso reduz código repetido e mantém a interface enxuta.

5 - Qual vantagem de usar interface se no futuro você quiser adicionar WhatsApp ou Push Notification?
    A vantagem é que podemos adicionar WhatsApp, PushNotification ou qualquer novo canal criando apenas uma nova classe que implemente a interface Notificacao. O código cliente que envia mensagens não precisa ser alterado, demonstrando baixo acoplamento e facilitando a extensibilidade do sistema.