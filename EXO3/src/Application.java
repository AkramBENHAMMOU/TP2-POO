import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Ordinateur> ordinateurs = new ArrayList<>();
        Ordinateur o1 = new Ordinateur("MacBook Pro","Apple",12,"hp core i5 10g",100);
        Ordinateur o2 = new Ordinateur("ThinkPad","Dell",44,"Dell core i7 10g",30);
        Ordinateur o3 = new Ordinateur("EliteBook","hp",33,"hp core i9 10g",50);
        ordinateurs.add(o1);
        ordinateurs.add(o2);
        ordinateurs.add(o3);
        Categorie categorie = new Categorie("Gaming","Pc performant",ordinateurs);
        Client client = new Client("akram","benha","rue kkllm","akr@nn.com","casa","09988776");
        Commande commande = new Commande("ddddmm",client,new Date(),"livré");
        LigneCommande l1 = new LigneCommande(12, commande, o1);
        LigneCommande l2 = new LigneCommande(14, commande, o2);
        LigneCommande l3 = new LigneCommande(34, commande, o3);
       System.out.println(commande.toString());


    }
}
