public class Fabrique2 extends Fabrique {
    @Override
    public ProduitA createProduit() {
        return new ProduitA2();
    }
}
