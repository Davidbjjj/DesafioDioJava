package PraticaDePOO.Pilares;

public class TelegramMensage extends Mensag {

    @Override
    public void enviarMensagem() {
        System.out.println("Mensagem eviada Pelo Telegram");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Mensagem recebida Pelo Telegram");

    }
}
