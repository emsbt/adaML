public class PagamentoDinheiro implements MetodoPagamento {


    private double valorPago;
    @Override
    public void autorizarPagamento(double valor) {
        System.out.println("Autorizando Valor em Dinheiro de R$" + valor + ". Sujeito à horário bancário.");
    }

    @Override
    public void capturarPagamento(double valor) {
        System.out.println("Ordem de transferência (Dinheiro) no valor de R$" + valor + " enviada para processamento.");
        this.valorPago = valor; // 2. Armazenar o valor ao capturar
    }

    @Override
    public double consultarValorPago() {
        return this.valorPago; // 3. Retornar o valor armazenado
    }

    @Override
    public void cancelarPagamento() {
        System.out.println("Tentativa de cancelar Dinheiro. Só é possível se não tiver sido processada.");
    }

}