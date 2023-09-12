import java.util.Date;

public class Entete {
    private TexteCentre titre;
    private TexteCentre auteur;
    private TexteCentre date;

    public Entete (String titre, String auteur, Date date){
        this.titre = new TexteCentre(titre);
        this.auteur = new TexteCentre(auteur);
        this.date = new TexteCentre(date.toString());
    }
    public Entete (String titre, String auteur){
        this.titre = new TexteCentre(titre);
        this.auteur = new TexteCentre(auteur);
        this.date = new TexteCentre(new Date().toString());
    }
    public void fixeLargeur(int largeur){
        titre.fixeLargeur(largeur);
        auteur.fixeLargeur(largeur);
        date.fixeLargeur(largeur);
    }
@Override
    public String toString() {
        return titre.toString() + '\n' + auteur.toString() + '\n' + date.toString();
    }

}
