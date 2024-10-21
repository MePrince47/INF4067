public class Main {
    public static void main(String[] args) {
        // Utilisation du MonteurPizzaPiquante
        MonteurPizza monteurPiquante = new MonteurPizzaPiquante();
        PizzaBuilder builderPiquante = new PizzaBuilder(monteurPiquante);
        Pizza pizzaPiquante = builderPiquante.construirePizza();
        pizzaPiquante.print();

        // Utilisation du MonteurPizzaReine
        MonteurPizza monteurReine = new MonteurPizzaReine();
        PizzaBuilder builderReine = new PizzaBuilder(monteurReine);
        Pizza pizzaReine = builderReine.construirePizza();
        pizzaReine.print();
    }
}
