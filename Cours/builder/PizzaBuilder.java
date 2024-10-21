//Directeur 
public class PizzaBuilder {
    private MonteurPizza monteurPizza;

    public PizzaBuilder(MonteurPizza monteurPizza) {
        this.monteurPizza = monteurPizza;
    }

    public Pizza construirePizza() {
        monteurPizza.monterPate();
        monteurPizza.monterSauce();
        monteurPizza.monterGarniture();
        return monteurPizza.getPizza();
    }
}
