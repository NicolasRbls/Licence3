package atelier_1_java.exercice2;

public class TestEntier {
    public static void main(String[] args) {
        // Création d'un entier avec des bornes de 1 à 10 et une valeur initiale de 5
        Entier entier = new Entier(1, 10, 5);

        // Consultation de la valeur actuelle
        System.out.println("Valeur actuelle : " + entier.getValeur());

        // Incrémentation de la valeur
        entier.incremente();
        System.out.println("Valeur après incrémentation : " + entier.getValeur());

        // Incrémentation de la valeur par un pas de 3
        entier.incremente(3);
        System.out.println("Valeur après incrémentation par pas : " + entier.getValeur());

        // Modification de la valeur
        entier.setValeur(8);
        System.out.println("Nouvelle valeur : " + entier.getValeur());

        Entier entier1 = new Entier(1, 10, 5);
        Entier entier2 = new Entier(1, 10, 5);

        System.out.println(entier1.toString()); // Affiche "5"
        System.out.println(entier1.equals(entier2)); // Affiche "true"
    }
}
