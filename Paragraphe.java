import java.util.ArrayList;

public class Paragraphe {
    private ArrayList<String> mots;
    private ArrayList<String> ligne;
    private int largeur;
    private int nbmot;
    private int nblignes;
    public Paragraphe(){
        mots = new ArrayList<>();
        ligne = new ArrayList<>();
        nbmot = 0;
        nblignes = 0;
        largeur = 80;
    }
    public void calculeLigne(){
        int i = 0;
        nbmot = nbmot();
        int larg = largeur;
        while(!(i==nbmot)){
            if(larg >= mots.get(i).length()+1) {
                ligne.add(mots.get(i) + ' ');
                larg -= (mots.get(i).length()+1);
            }else{
                larg = largeur;
                ligne.add("\n");
                nblignes++;
            }
            i++;
        }
        ligne.add("\n");
    }
    public void fixeLargeur (int l){
        largeur = l;
    }
    public int nbmot(){
        return mots.size();
    }
    public void ajoute(String mot){
        mots.add(mot);
    }
    public int nblignes(){
        calculeLigne();
        return nblignes;
    }

    @Override
    public String toString() {
        calculeLigne();
        StringBuilder resultat = new StringBuilder();
        ligne.forEach(resultat::append);
        return resultat.toString();
    }
}
