public class PushNotification implements Notificacao {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("--- Enviando Push Notification ---");
        System.out.println("Mensagem: " + mensagem);
        System.out.println("Push Notification enviada com sucesso!");
    }
}