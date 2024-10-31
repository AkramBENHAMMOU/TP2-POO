import java.util.List;

public interface IMetierProduit {
    public Produit add(Produit p);
    public String getAll();
    public List<Produit> findByNom(String nom1);
    public Produit findById(long id);
    public void delete(long id);
}
