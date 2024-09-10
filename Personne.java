import java.util.Random;

public class Personne {
    private String nom;
    private int age;
    public Personne(String nom, int age){
        this.nom = nom;
        this.age = age;
    }

    public static Personne genererPersonne(){
        /* cette fonction vas creer et ret
            ourner un object de la classe Personne 
            (et donc la même classe pour montrer que le données sont au hazard)

            * la "Personne générée vas générer le nom et l'afge au hazard"
        */
        Personne result;
        Random random = new Random();
        String nomAhHazard ="";
        for(int i=0; i<7; i++){ // On génère un nom de 7 caractères
            /*
             * Entre 65 et 90 de la table ascii, on a les lettre de A à Z
             */
            nomAhHazard+= (char) ( (byte) random.nextInt(65, 90));
        }
        result = new Personne(
                    nomAhHazard,
                    random.nextInt(90) 
                );
            return result;
    }

    public String toString(){
        return "Personne:: nom: " + nom + " -- age: " + age;
    }
}