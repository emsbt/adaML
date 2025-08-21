import java.util.List;

public class ProcessadorDePagamentos {

    public static void main(String[] args) {
        // 1. Criar os métodos de pagamento
        MetodoPagamento cartao = new PagamentoCartao("1234 5678 9012 3456", "Fulano");
        MetodoPagamento pix = new PagamentoPIX("fulano@email.com");
        MetodoPagamento dinheiro = new PagamentoDinheiro();

        // 2. Colocar em uma lista
        List<MetodoPagamento> listaDeMetodos = List.of(cartao, pix, dinheiro);

        // 3. Criar o Gerenciador
        GerenciadorDePagamentos gerenciador = new GerenciadorDePagamentos(listaDeMetodos);

        // 4. Processar TODOS com um valor específico (ex: R$100,00 cada)
        double valorPorPagamento = 150.00;
        gerenciador.processarTodos(valorPorPagamento);

        // 5. GERAR O RELATÓRIO e mostrar o total
        double totalPago = gerenciador.gerarRelatorio();
        System.out.println("\n=================================");
        System.out.println("RELATÓRIO FINANCEIRO");
        System.out.println("Total arrecadado: R$" + totalPago);
        System.out.println("=================================");
    }
}