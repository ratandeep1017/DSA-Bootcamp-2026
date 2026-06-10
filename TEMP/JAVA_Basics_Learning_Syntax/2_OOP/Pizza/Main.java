package Pizza;

//UNDERSTANDING DIFFERENT TYPES OF CONSTRUCTOR
//NO-ARGS AND PARAMETERIZED CONSTRUCTOR (4 TYPES OF ARGUMENTS)
//AND Override toString() METHOD to print objects
public class Main {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("crunchy", "mozzarella", "tomato", "pepperoni");
        Pizza pizza2 = new Pizza("soft", "mayonnaise", "red chilli");
        Pizza pizza3 = new Pizza("crunchy", "milky");
        Pizza pizza4 = new Pizza("white");
        Pizza pizza5 = new Pizza();

        System.out.println("--- 5 Pizza order details ---");
        //EXPLICITLY calling of tostring method
        System.out.println("\n\tPizza 1\n" + pizza1.toString());
        //IMPLICITLY calling of tostring method
        System.out.println("\n\tPizza 2\n" + pizza2);
        System.out.println("\n\tPizza 3\n" + pizza3);
        System.out.println("\n\tPizza 4\n" + pizza4);
        System.out.println("\n\tPizza 5\n" + pizza5);

//        System.out.println("--- 5 Pizza order details ---\n");
//        System.out.println("\tPizza 1");        pizza1.display();
//        System.out.println("\tPizza 2");        pizza2.display();
//        System.out.println("\tPizza 3");        pizza3.display();
//        System.out.println("\tPizza 4");        pizza4.display();
//        System.out.println("\tPizza 5");        pizza5.display();


//GIVES ERROR BECAUSE THE DATA ARE PRIVATE
//System.out.println("Pizza 2 cheese : " + pizza2.cheese);

    }

}
