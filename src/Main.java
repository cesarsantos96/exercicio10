import java.util.List;

public class Main {
    public static void main(String[] args) {
       Usuario gustavo = new Usuario("Gustavo", "senha!@3");
        Usuario cesar = new Usuario("Cesar", "aksjdhaksd");
        Usuario mac = new Usuario("Mac", "jkalksdjf");

        cesar.adicionarAmigos(mac);
        cesar.adicionarAmigos(gustavo);

        cesar.publicarMensagem("Fala mano!");
        mac.publicarMensagem("Fala");
        gustavo.publicarMensagem("E ai, vocês estão por aqui também !");


        List<String> feedCesar = cesar.verFeedDeNoticias();
        List<String> feedGustavo = gustavo.verFeedDeNoticias();


        System.out.println("Feed de notícias do Cesar: ");
        for(String mensagem : feedCesar){
            System.out.println(mensagem);
        }

        System.out.println("\nFeed de notícias de Gustavo: ");
        for(String mensagem : feedGustavo)
        {
            System.out.println(mensagem);
        }

    }
}