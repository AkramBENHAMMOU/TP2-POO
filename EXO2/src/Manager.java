public class Manager extends Employe{

    String service;

    public Manager(String nom, String prenom, String email, String tel, double salaire,String service) {
        super(nom, prenom, email, tel, salaire);
        this.service=service;
    }

    @Override
    public double calculerSalaire() {
        return this.getSalaire()*0.2;
    }

    @Override
    public String afficher() {
        return super.afficher()+"\n service : "+service;
    }
}
