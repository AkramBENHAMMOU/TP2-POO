public class Adherent extends Personne{
    private long numAdherent;
    public Adherent(String nom, String prenom, String email, String tel, int age,long numA) {
        super(nom, prenom, email, tel, age);
        this.numAdherent=numA;
    }
    public String afficher(){
        return super.afficher()+"Num adherent : "+numAdherent;
    }

    public long getNumAdherent() {
        return numAdherent;
    }

    public void setNumAdherent(long numAdherent) {
        this.numAdherent = numAdherent;
    }
}
