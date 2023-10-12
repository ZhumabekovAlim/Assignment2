public class PizzaDecorator implements PizzaInterface{
    PizzaInterface pizza;
    public PizzaDecorator(PizzaInterface pizza) {
        this.pizza = pizza;
    }
    @Override
    public String makePizza() {
        return pizza.makePizza();
    }
}
