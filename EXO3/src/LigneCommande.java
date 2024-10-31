public class LigneCommande {

    private int quantité;
    private Commande commande;
    private Ordinateur ordinateur;

    public LigneCommande(int quantité, Commande commande, Ordinateur ordinateur) {
        this.quantité = quantité;
        this.commande = commande;
        this.ordinateur = ordinateur;
    }
}
