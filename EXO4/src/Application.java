import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Application {
    private static   Scanner scanner = new Scanner(System.in);
    private static   MetierProduitImpl m = new MetierProduitImpl();

    public static void main(String[] args) {
        while (true) {

                System.out.println("1. Afficher la liste des produits");
                System.out.println("2. Rechercher des produits par mot clé");
                System.out.println("3. Ajouter un nouveau produit");
                System.out.println("4. Chercher un produit par ID");
                System.out.println("5. Supprimer un produit par ID");
                System.out.println("6. Quitter");
                System.out.print("Saisir un numéro : ");
                int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                   System.out.println( m.getAll());
                    break;
                case 2:
                    findByNom();
                    break;
                case 3:
                    add();
                    break;
                case 4:
                    findById();
                    break;
                case 5:
                    delete();
                    break;
                case 6:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide!");
            }
                System.out.println("\nAppuyez sur Entrée pour retourner au menu");
                scanner.nextLine();
        }

    }

    private static void findByNom() {
        scanner.nextLine();
        System.out.print("Entrez le mot clé : ");
        String keyword = scanner.nextLine();
        List<Produit> results = m.findByNom(keyword);
        if (results.isEmpty()) {
            System.out.println("Aucun produit trouvé avec ce mot clé.");
        } else {
            System.out.println("Résultats de la recherche :");
            for(Produit p : results){
                System.out.println(p.afficher());
            }

        }
    }

    private static void add() {
        scanner.nextLine(); // Clear the buffer

        System.out.print("ID du produit : ");
        long id = scanner.nextLong();
        scanner.nextLine();

        System.out.print("Nom du produit : ");
        String nom = scanner.nextLine();

        System.out.print("Marque du produit : ");
        String marque = scanner.nextLine();

        System.out.print("Prix du produit : ");
        double prix = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Description du produit : ");
        String description = scanner.nextLine();

        System.out.print("Nombre en stock : ");
        int stock = scanner.nextInt();

        Produit produit = new Produit(id, nom, marque, prix, description, stock);
        m.add(produit);
        System.out.println("Produit ajouté avec succès !");
    }

    private static void findById() {
        System.out.print("Entrez l'ID du produit : ");
        long id = scanner.nextLong();
        m.findById(id);
    }

    private static void delete() {
        System.out.print("Entrez l'ID du produit à supprimer : ");
        long id = scanner.nextLong();
        m.delete(id);
        System.out.println("Produit supprimé avec succès !");
    }
}