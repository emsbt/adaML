import java.util.List;

public class Principal {
    public static void main(String[] args) {
        // 1. Criar as diferentes implementações de notificação
        Notificacao email = new Email();
        Notificacao sms = new SMS();
        Notificacao whatsapp = new WhatsApp();
        Notificacao pushNotification = new PushNotification();

        // 2. Colocar em uma lista
        List<Notificacao> listaDeNotificacoes = List.of(email, sms, whatsapp, pushNotification);

        // 3. Mensagem a ser enviada
        String mensagem = "Bem-vindo ao sistema de notificações adaML!";

        // 4. Enviar a mesma mensagem usando diferentes meios
        System.out.println("=================================");
        System.out.println("SISTEMA DE NOTIFICAÇÕES ADAML");
        System.out.println("=================================");
        
        for (Notificacao notificacao : listaDeNotificacoes) {
            notificacao.enviarMensagem(mensagem);
            System.out.println();
        }

        System.out.println("=================================");
        System.out.println("Todas as notificações foram enviadas!");
        System.out.println("=================================");
    }
}