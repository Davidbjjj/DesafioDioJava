package PraticaDePOO.Pilares;

public class ComputadorDavid {
    public static void main(String[] args) {
        FacebookMensage face = new FacebookMensage();
        System.out.println("Face");
        face.enviarMensagem();
        face.receberMensagem();

        MSNMensage msm = new MSNMensage();
        System.out.println("MSN");
        msm.enviarMensagem();
        msm.receberMensagem();

        TelegramMensage tele = new TelegramMensage();
        System.out.println("Telegram");
        tele.receberMensagem();
        tele.receberMensagem();

    }
}
