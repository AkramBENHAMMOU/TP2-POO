import java.util.ArrayList;
import java.util.List;

public class MetierProduitImpl implements IMetierProduit{
    private List<Produit> produits;

    public MetierProduitImpl(){
        this.produits = new ArrayList<>();
    }
    public Produit add(Produit p){
        produits.add(p);
        return p;
    }
    public String getAll(){
        StringBuffer s = new StringBuffer();
       for (Produit p : produits){
           s.append(p.afficher());
       }
       return s.toString();
    }
    public List<Produit> findByNom(String nom1){
        List<Produit> produitsTrouve = new ArrayList<>();
        for (Produit p : produits){
            if(p.getNom().equals(nom1)){
                produitsTrouve.add(p);
            }
        }
        return produitsTrouve;
    }
    public Produit findById(long id){

        for (Produit p : produits){
            if(p.getId()==id){
                return p;
            }
        }


        return null;
    }
    public void delete(long id){
        for (Produit p : produits){
            if(p.getId() == id){
                produits.remove(p);
            }
        }
    }

}
