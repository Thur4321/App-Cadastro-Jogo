package cadastrojogo;

public class InfoUser {

    private String nome, senha, gamertag;

    private Plataforma plataforma;
    
    private Carteira carteira;

    public InfoUser(String nome, String senha, String gamertag, Plataforma plataforma, Carteira carteira) {
        this.nome = nome;
        this.senha = senha;
        this.gamertag = gamertag;
        this.plataforma = plataforma;
        this.carteira = carteira;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getGamertag() {
        return gamertag;
    }

    public void setGamertag(String gamertag) {
        this.gamertag = gamertag;
    }

    public Plataforma getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(Plataforma plataforma) {
        this.plataforma = plataforma;
    }

    public Carteira getCarteira() {
        return carteira;
    }

    public void setCarteira(Carteira carteira) {
        this.carteira = carteira;
    }
    
    public String dados() {
        return "Nome: " + nome
                + "\nGamertag: " + gamertag
                + "\nSenha: " + senha
                + "\nPlataforma: " + plataforma.getPlatUser()
                + "\nScore: " + plataforma.plataforma()
                + "\nCarteira: " + carteira.dinheiro();

    }

    public void mudaNome(String mudaNome){
        nome = mudaNome;
    }
    
    public void mudaSenha(String mudaSenha){
        senha = mudaSenha;
    }
    
    public void mudaTag(String mudaTag){
        gamertag = mudaTag;
    }

}
