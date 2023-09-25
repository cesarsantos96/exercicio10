import java.util.ArrayList;
import java.util.List;

public class Usuario {

    public String nomeUsuario;
    private String senha;

    private List<Usuario> amigos;
    private List<String> mensagens;

    public Usuario( String nomeUsuario, String senha){
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        this.amigos = new ArrayList<>();
        this.mensagens = new ArrayList<>();
    }
    public void adicionarAmigos(Usuario amigo){
        amigos.add(amigo);
    }
    public void publicarMensagem(String mensagem){
        mensagens.add(mensagem);
    }
    public List<String> verFeedDeNoticias(){
        List<String> feed = new ArrayList<>();
        for(Usuario amigo : amigos){
            feed.addAll(amigo.mensagens);
        }
        return feed;
    }
    public String getNomeUsuario(){
        return nomeUsuario;
    }

    public List<Usuario> getAmigos(){
        return amigos;
    }
}
