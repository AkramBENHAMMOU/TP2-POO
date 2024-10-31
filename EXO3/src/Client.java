import java.util.List;

public class Client {

    private String nom;
    private String prenom;
    private String adresse;
    private String email;
    private String ville;
    private String tel;
    private List<Commande> commandes;

    public Client(String nom, String prenom, String adresse, String email, String ville, String tel) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.email = email;
        this.ville = ville;
        this.tel = tel;
    }

    public void ajouterCommande(Commande commande){
        for (Commande c: commandes){
            if (c.equals(commande)){
                commandes.add(commande);
            }

        }
    }

    public void delete(Commande commande){

                commandes.remove(commande);

        }


    @Override
    public String toString() {
        return
                "nom='" + nom + "prenom=" + prenom + "adresse=" + adresse + " email=" + email +  " ville=" + ville +" telephone=" + tel +" commandes=" + commandes;


    }
}
