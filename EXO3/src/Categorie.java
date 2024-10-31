import java.util.List;

public class Categorie {
    private String nom;
    private String description;

    public Categorie(String nom, String description, List<Ordinateur> ordinateurs) {
        this.nom = nom;
        this.description = description;
        this.ordinateurs = ordinateurs;
    }

    private List<Ordinateur> ordinateurs;

    Ordinateur ajouterOrdinateur(Ordinateur o){
        for(Ordinateur o1 : ordinateurs){
            if (o1.equals(o)){
                System.out.println("cet ordinateur existe dj");
            }
            else {
                ordinateurs.add(o);
                return o;
            }
        }
        return null;
    }

    void delete(String nom){
        for (Ordinateur o : ordinateurs){
            if(o.getNom().equals(nom)){
                 ordinateurs.remove(o);
            }
        }
    }

    Ordinateur rechercherParPrix(double prix){
        for (Ordinateur o : ordinateurs){
            if(o.getPrix()==prix){
                return o;
            }
        }
        return null;
    }

}
