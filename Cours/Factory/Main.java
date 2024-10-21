public class Main {
    public static void main(String[] args) {
        // Nos fabriques
        Fabrique fabrique1 = new Fabrique1();
        Fabrique fabrique2 = new Fabrique2();
        Fabrique fabrique3 = new Fabrique3();

        // Création des objets via les fabriques
        ProduitA produit1 = fabrique1.createProduit();
        ProduitA produit2 = fabrique2.createProduit();
        ProduitA produit3 = fabrique3.createProduit();

        // Appel des méthodes sur chaque produit
        produit1.methodeA();
        produit2.methodeA();
        produit3.methodeA();
    }
}
