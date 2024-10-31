public class Ingenieur extends Employe{
String specialite;

    public Ingenieur(String nom,String prenom,String email,String tel,double salaire,String specialite) {
        super(nom,prenom,email,tel,salaire);
        this.specialite = specialite;
    }

    @Override
    public double calculerSalaire() {
        return this.getSalaire()*0.15;
    }

    @Override
    public String afficher() {
        return super.afficher()+"\n specialite : "+specialite;
    }
}
