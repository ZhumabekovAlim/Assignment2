public class SalamiPizza extends PizzaDecorator{
    public SalamiPizza(PizzaInterface pizza) {
        super(pizza);
    }

    public String addSalamiToPizza(){
        return "and with salami ";
    }

    @Override
    public String makePizza() {
        return super.makePizza()+addSalamiToPizza();
    }
}
