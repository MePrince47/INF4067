public class Fabrique1 extends Fabrique {
    @Override
    public ProduitA createProduit() {
        return new ProduitA1();
    }
}
