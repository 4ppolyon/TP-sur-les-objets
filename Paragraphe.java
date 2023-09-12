import java.util.ArrayList;

public class Paragraphe {
    ArrayList<String> mots;
    ArrayList<String> ligne;
    int largeur;
    int nbmot;
    int nblignes;
    public Paragraphe(){
        mots = new ArrayList<>();
        nbmot = 0;
        nblignes = 0;
        largeur = 80;
    }
    public void calculeLigne(){
    }
    public void fixeLargeur (int l){
        largeur = l;
    }
    public void ajoute(String mot){
        ligne.add(mot);
    }
    public int nblignes(){
        calculeLigne();
        return nblignes;
    }

    @Override
    public String toString() {
        return mots.toString();
    }
}
