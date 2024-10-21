public abstract class MonteurPizza {
    protected Pizza pizza = new Pizza();

    public abstract void monterPate();
    public abstract void monterSauce();
    public abstract void monterGarniture();

    public Pizza getPizza() {
        return pizza;
    }
}
