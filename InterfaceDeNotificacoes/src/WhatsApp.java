public class WhatsApp implements Notificacao {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("--- Enviando WhatsApp ---");
        System.out.println("Mensagem: " + mensagem);
        System.out.println("WhatsApp enviado com sucesso!");
    }
}