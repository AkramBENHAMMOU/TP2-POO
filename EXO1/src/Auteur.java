public class Auteur extends Personne{
  private long numAuteur;
    public Auteur(String nom, String prenom, String email, String tel, int age,long numAut) {
        super(nom, prenom, email, tel, age);
        this.numAuteur=numAut;
    }

    @Override
    public String afficher() {
        return super.afficher()+"\n Num auteur : "+numAuteur;
    }

    public long getNumAuteur() {
        return numAuteur;
    }

    public void setNumAuteur(long numAuteur) {
        this.numAuteur = numAuteur;
    }
}
