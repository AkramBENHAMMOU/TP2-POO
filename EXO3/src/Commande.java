import java.util.Date;

public class Commande {

   private String reference;
   private Client client;
   private Date dateCommande;
   private String etat;

    public Commande(String reference, Client client, Date dateCommande,String etat) {
        this.reference = reference;
        this.client = client;
        this.dateCommande = dateCommande;
        this.etat = etat;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

    @Override
    public String toString() {
        return "Commande : " +
                "reference='" + reference + '\'' +
                ", client=" +'{'+ client.toString() +'}'+
                ", dateCommande=" + dateCommande +
                ", etat='" + etat + '\'' +
                '}';
    }
}
