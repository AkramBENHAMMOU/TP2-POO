public class App {
    public static void main(String[] args) {
        Ingenieur ing = new Ingenieur("AK","kAA","ddlml","062277382",122,"operationnel");
        Manager m = new Manager("LLO","lilo","eeeem","0998866",112,"strategique");
       System.out.println(ing.afficher());
        System.out.println(m.afficher());


    }
}
