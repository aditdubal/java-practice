public class PizzaOrder {
    String size;
    int toppings;
    boolean extraCheese;

    public PizzaOrder(String size) {
        this(size, 0, false);
    }

    public PizzaOrder(String size, int toppings) {
        this(size, toppings, false);
    }

    public PizzaOrder(String size, int toppings, boolean extraCheese) {
        //validate size
        if (size == null) {
        }
    }
}


// git check