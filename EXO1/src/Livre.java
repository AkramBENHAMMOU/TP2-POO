public class Livre {

    private int ISBN ;
    private String titre;
    private Auteur aut;

    public Livre(int ISBN, String titre, Auteur aut) {
        this.ISBN = ISBN;
        this.titre = titre;
        this.aut = aut;
    }

    public String afficher(){
        return "L'ISBN :"+ISBN +"\n le titre : "+titre +"\n"+aut.afficher();
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Auteur getAut() {
        return aut;
    }

    public void setAut(Auteur aut) {
        this.aut = aut;
    }
}
