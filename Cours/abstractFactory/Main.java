public class Main { // Classe publique
    public static void main(String[] args) {
        // Fabrique 1
        fabriqueAbstraite FA1 = new fabriqueconcrete1();
        produitA p1 = FA1.createproduitA();
        p1.methodeA();

        produitB p11 = FA1.createproduitB();
        p11.methodeA();

        // Fabrique 2
        fabriqueAbstraite FA2 = new fabriqueconcrete2();
        produitA p2 = FA2.createproduitA();
        p2.methodeA();

        produitB p21 = FA2.createproduitB();
        p21.methodeA();
    }
}
