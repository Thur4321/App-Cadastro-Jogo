
package cadastrojogo;

public class Plataforma {
    
    private String platUser, pontos;
    
    private float score;

    public Plataforma(String platUser, float score) {
        this.platUser = platUser;
        this.score = score;
    }

    public String getPlatUser() {
        return platUser;
    }

    public void setPlatUser(String platUser) {
        this.platUser = platUser;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }
  
    public String score(){
        if(platUser.equals("Computador")){
            pontos = "pontos";
        }else if (platUser.equals("Xbox")){
            pontos = "G";
        }else if(platUser.equals("Playstation")){
            pontos = "troféus";
        }
        return pontos;
    }
    
    public void conquista(float conquista){
        if(conquista >= 0){
        score = conquista;
        }
    }
    
    public String plataforma(){
        return score + " " + score();
    }
    
}
