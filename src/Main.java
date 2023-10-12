public class Main {
    public static void main(String[] args) {
        PizzaInterface pizza = new PepperPizza(new SalamiPizza(new Pizza()));

        System.out.println(pizza.makePizza());
    }
}