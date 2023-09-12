import java.util.Scanner;

public class TexteCentre {
    private String texte;
    private int largeur;
    public TexteCentre(String t){
        largeur = 80;
        texte = t;
    }
    public void fixeLargeur(){
        System.out.println("Enter the number of character per line : ");
        Scanner scan =new Scanner(System.in);
        largeur = Integer.parseInt(scan.nextLine());
    }
    public void fixeLargeur (int l){
        largeur = l;
    }
    public String texte(){
        return texte;
    }

    @Override
    public String toString() {
        int i;
        StringBuilder resultat = new StringBuilder();
        while(texte.length() > largeur){
            resultat.append(texte, 0, largeur);
            resultat.append('\n');
            texte = texte.replaceFirst(texte.substring(0, largeur), "");
        }
        i = (largeur-texte.length())/2;
        for(int j = 0; i != j; j++){
            resultat.append(' ');
        }
        resultat.append(texte);
        return resultat.toString();
    }
}
