package Pizza;

class Pizza {
    private String bread, cheese, sauce, toppings;

    public String toString() {
        return "Bread : " + bread + "\nCheese : " + cheese + "\nSauce : " + sauce + "\nToppings : " + toppings;
    }
    public Pizza() {
        this.bread = "Nothing";
        this.cheese = "Nothing";
        this.sauce = "Nothing";
        this.toppings = "Nothing";
    }

    public Pizza(String bread) {
        this.bread = bread;
    }

    public  Pizza(String bread, String cheese) {
        this.bread = bread;
        this.cheese = cheese;
    }

    public  Pizza(String bread, String cheese, String sauce) {
        this.bread = bread;
        this.cheese = cheese;
        this.sauce = sauce;
    }

    public  Pizza(String bread, String cheese, String sauce, String toppings) {
        this.bread = bread;
        this.cheese = cheese;
        this.sauce = sauce;
        this.toppings = toppings;
    }

//    void display() {
//        System.out.println("----------------");
//        System.out.println("Bread : " + bread);
//        System.out.println("Cheese : " + cheese);
//        System.out.println("Sauce : " + sauce);
//        System.out.println("Toppings : " + toppings);
//        System.out.println();
//    }



}
