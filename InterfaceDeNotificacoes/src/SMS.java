public class SMS implements Notificacao {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("--- Enviando SMS ---");
        System.out.println("Mensagem: " + mensagem);
        System.out.println("SMS enviado com sucesso!");
    }
}