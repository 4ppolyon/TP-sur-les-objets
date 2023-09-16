import java.util.ArrayList;

public class Paragraphe {
    private ArrayList<String> mots;
    private int largeur;
    private int nbmot;
    private int nbligne;
    public Paragraphe(){
        mots = new ArrayList<>();
        nbmot = 0;
        nbligne = 0;
        largeur = 80;
    }
    public void calculeLigne(ArrayList<String> lignes) {
        int i = 0;
        nbmot = nbmot();
        int larg = largeur;
        while (!(i == nbmot)) {
            if (larg >= mots.get(i).length() + 1) {
                lignes.add(mots.get(i) + ' ');
                larg -= (mots.get(i).length() + 1);
                i++;
            } else {
                if (mots.get(i).length() + 1 > largeur) {
                    System.out.println("Le mot " + mots.get(i) + " est trop long pour être affiché");
                    System.exit(1);
                } else {
                    larg = largeur;
                    lignes.add("\n");
                    nbligne++;
                }
            }
        }
        lignes.add("\n");
        nbligne++;
    }
    public void calculeLigne(){
        int i = 0;
        nbmot = nbmot();
        int larg = largeur;
        while(!(i==nbmot)){
            if(larg >= mots.get(i).length()+1) {
                larg -= (mots.get(i).length()+1);
                i++;
            }else{
                larg = largeur;
                nbligne++;
            }
        }
        nbligne++;
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
        return nbligne;
    }

    @Override
    public String toString() {
        ArrayList<String> lignes = new ArrayList<>();
        calculeLigne(lignes);
        StringBuilder resultat = new StringBuilder();
        lignes.forEach(resultat::append);
        return resultat.toString();
    }
}
