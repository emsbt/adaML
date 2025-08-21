public class PagamentoPIX implements MetodoPagamento {

    private String chavePIX;
    private boolean possuiSaldo = true;
    private double valorPago;// Simulação

    public PagamentoPIX(String chavePIX) {
        this.chavePIX = chavePIX;
    }

    @Override
    public void autorizarPagamento(double valor) {
        System.out.println("Verificando chave PIX " + chavePIX + " e saldo para R$" + valor + "...");
        if (possuiSaldo) {
            System.out.println("Chave válida e saldo disponível. Autorizado.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    @Override
    public void capturarPagamento(double valor) {
        System.out.println("Transferindo instantaneamente R$" + valor + " via PIX.");
        this.valorPago = valor; // 2. Armazenar o valor ao capturar
    }

    @Override
    public double consultarValorPago() {
        return this.valorPago; // 3. Retornar o valor armazenado
    }
    @Override
    public void cancelarPagamento() {
        // PIX é irreversível por natureza, mas um estorno pode ser iniciado.
        System.out.println("Solicitando estorno da transação PIX junto ao Banco Central...");
    }

    // Não sobrescreve gerarComprovante(), usa a implementação default da interface.
}