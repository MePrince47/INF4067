public class fabriqueconcrete1 implements fabriqueAbstraite { // Classe publique
    public produitA createproduitA() {
        return new produitA1();
    }

    public produitB createproduitB() {
        return new produitB1();
    }
}
