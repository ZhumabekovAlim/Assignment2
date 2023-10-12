public class PepperPizza extends PizzaDecorator{
    public PepperPizza(PizzaInterface pizza) {
        super(pizza);
    }

    public String addPepperToPizza(){
        return "and with papper.";
    }

    @Override
    public String makePizza() {
        return super.makePizza()+addPepperToPizza();
    }
}
