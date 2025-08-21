public class PagamentoCartao implements MetodoPagamento {

    private String numeroCartao;
    private String nomeTitular;
    private boolean autorizado = false;
    private double valorPago;

    public PagamentoCartao(String numeroCartao, String nomeTitular) {
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
    }

    @Override
    public void autorizarPagamento(double valor) {
        // Simula a lógica complexa de autorização com a operadora do cartão
        System.out.println("Autorizando pagamento de R$" + valor + " no cartão " + numeroCartao + "...");
        // Simula uma verificação bem-sucedida
        this.autorizado = true;
        System.out.println("Pagamento autorizado pela operadora.");
    }

        @Override
        public void capturarPagamento(double valor) {
            if (autorizado) {
                System.out.println("Capturando valor de R$" + valor + " para o portador " + nomeTitular + ".");
                this.valorPago = valor; // AQUI: Armazena o valor quando a captura é feita
            } else {
                System.out.println("ERRO: Pagamento não foi autorizado. Capture não realizada.");
            }
        }

    @Override
    public double consultarValorPago() {
        return this.valorPago;
    }

    @Override
    public void cancelarPagamento() {
        System.out.println("Cancelando autorização no cartão...");
        this.autorizado = false;
        System.out.println("Transação cancelada com sucesso.");
    }

    // Pode sobrescrever o método default para ser mais específico
    @Override
    public void gerarComprovante() {
        System.out.println("--- Comprovante de Cartão de Crédito ---");
        System.out.println("Titular: " + nomeTitular);
        System.out.println("Cartão final: " + numeroCartao.substring(numeroCartao.length() - 4));
        System.out.println("Transação processada com sucesso.");
    }
}