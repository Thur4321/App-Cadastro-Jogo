package cadastrojogo;

public class Carteira {

    private String moeda;

    private float dinheiro = 0;

    public Carteira(String moeda) {
        this.moeda = moeda;
    }

    public String getDinheiro() {
        return moeda;
    }

    public void setDinheiro(String dinheiro) {
        moeda = dinheiro;
    }

    public void reajusteCarteira(float carteira) {
        if (carteira > 0) {
            dinheiro = dinheiro + carteira;
        }
    }

    public String dinheiro() {
        return moeda + " " + dinheiro;
    }
}
