public class App {
    public static void main(String[] args) {
Adherent a = new Adherent("Akram","ben","abenn","099887",18,122);
Auteur auteur = new Auteur("ak","bek","ss","0099888",13,33);
Livre l = new Livre(1222,"les miserables",auteur);
System.out.println(a.afficher());
System.out.println("--------------");
System.out.println(l.afficher());
    }
}
