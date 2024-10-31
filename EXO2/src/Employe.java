public abstract class Employe {
    private String nom;
    private String prenom;
    private String email;
    private String tel;
    private double salaire;


    public Employe(String nom, String prenom, String email, String tel, double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.tel = tel;
        this.salaire = salaire;
    }

    public double getSalaire() {
        return salaire;
    }

    public abstract double calculerSalaire();

    public String afficher(){
        return "Nom : "+nom+"\n prenom : "+prenom+"\n email:"+email+"\ntelephone : "+tel+"\nsalaire:"+calculerSalaire();
    }
}
