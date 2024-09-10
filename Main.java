public class Main {
    public static void main(String[] args) {
        System.out.println("---------- now we'll create somthing --------");
        // on crée une instance normale pour montrer que la classe Personne fonction
        Personne joel = new Personne("Joel", 45);

        System.out.println( "Affichage de la personne crée manuellement: " + joel);

        System.out.println("--------- test de création d'une personne au hazard avec notre methode static: ---------");
        /*
         * Ici, on remarque que je génère un object de type Personne via une méthode de cette même classe..
         */
        Personne p = Personne.genererPersonne();
        System.out.println("Affichage de la personne générée au hazard: " + p);
        
    }
}