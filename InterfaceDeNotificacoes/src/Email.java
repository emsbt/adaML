public class Email implements Notificacao {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("--- Enviando Email ---");
        System.out.println("Mensagem: " + mensagem);
        System.out.println("Email enviado com sucesso!");
    }
}