public class fabriqueconcrete2 implements fabriqueAbstraite { // Classe publique
    public produitA createproduitA() {
        return new produitA2();
    }

    public produitB createproduitB() {
        return new produitB2();
    }
}
