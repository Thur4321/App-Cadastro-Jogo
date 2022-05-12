package cadastrojogo;

import javax.swing.JOptionPane;

public class CadastroJogo {

    public static void main(String[] args) {

        String plataforma[] = {"Computador", "Xbox", "Playstation"};

        String moeda[] = {"USD", "BRL", "EUR"};

        String operações[] = {"Informações da conta", "Mudar nome", "Mudar senha", "Mudar Gamertag", "Reajustar Score", "Adicionar dinheiro à carteira", "Sair"};

        InfoUser informaçoes;

        String nome = JOptionPane.showInputDialog(null, "Informe seu nome", "Cadastro", 3);

        String gamertag = JOptionPane.showInputDialog(null, "Informe sua Gamertag", "Cadastro", 3);

        String senha = JOptionPane.showInputDialog(null, "Informe sua senha", "Cadastro", 3);

        String plat = (String) JOptionPane.showInputDialog(null, "Escolha sua plataforma:", "Cadastro", 3, null, plataforma, plataforma[0]);

        String dinheiro = (String) JOptionPane.showInputDialog(null, "Escolha sua moeda:", "Cadastro", 3, null, moeda, moeda[0]);

        float score = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe seu Score:", "Cadastro", 3));

        if(score >= 0){
        informaçoes = new InfoUser(nome, senha, gamertag, new Plataforma(plat, score), new Carteira(dinheiro));

        String opçãoUser = "";

        do {

            opçãoUser = (String) JOptionPane.showInputDialog(null, "Selecione a operação desejada:", "Game", 3, null, operações, operações[0]);

            switch (opçãoUser) {
                case "Informações da conta":

                    JOptionPane.showMessageDialog(null, "As informações da sua conta são:\n" + informaçoes.dados(), "Informações", 1);

                    break;
                case "Mudar nome":

                    String mudaNome = JOptionPane.showInputDialog(null, "Informe seu nome:", "Score", 3);
                    informaçoes.mudaNome(mudaNome);

                    break;
                case "Mudar senha":

                    String mudaSenha = JOptionPane.showInputDialog(null, "Informe sua nova senha:", "Score", 3);
                    informaçoes.mudaSenha(mudaSenha);

                    break;
                case "Mudar Gamertag":

                    String mudaTag = JOptionPane.showInputDialog(null, "Informe sua nova Gamertag:", "Score", 3);
                    informaçoes.mudaTag(mudaTag);

                    break;
                case "Reajustar Score":

                    float conquista = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o valor do seu Score:", "Score", 3));
                    if(conquista >= 0){
                    informaçoes.getPlataforma().conquista(conquista);
                    } else{
                        JOptionPane.showMessageDialog(null, "Reajuste impossível, valor não permitido.", "Score", 1);
                    }

                    break;
                case "Adicionar dinheiro à carteira":

                    float carteira = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o valor do seu depósito:", "Carteira", 3));
                    if(carteira > 0){
                        informaçoes.getCarteira().reajusteCarteira(carteira);
                        JOptionPane.showMessageDialog(null, "Depósito realizado com sucesso.", "Carteira", 1);
                    } else{
                        JOptionPane.showMessageDialog(null, "Depósito impossível, valor não é possível de se adicionar.", "Carteira", 1);
                    }    

                    break;
            }
        } while (!opçãoUser.equals(operações[6]));
        System.exit(0);
    } else{
            JOptionPane.showMessageDialog(null, "Cadastro cancelado, Score possui valor não permitido.", "Carteira", 1);
        }
    }
}
