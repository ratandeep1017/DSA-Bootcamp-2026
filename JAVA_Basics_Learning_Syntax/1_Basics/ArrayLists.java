/*
 * wrapper class = provides a way to use primitive datatypes as reference datatypes
 * Reference data_types contains useful inbuilt methods and can be used with collections like
 * ex - (ArrayList<wrapper_class_datatype>)
 * primitive  = boolean int char double
 * wrapper = String Boolean Integer Character Double ( starts with capital letter)
 *
 *
 *
 * */


import java.util.ArrayList;
public class ArrayLists {
    public static void main(String[] args) {
//ArrayList<Integer> numbers  = new ArrayList<Integer>(); // need to use wrapper class
        //FOR PRINTING ARRAYLISTS USING FOR LOOPS
//        for(String name : names)
//            System.out.println(name);
//        for(int i= 0 ; i<names.size() ; i++)
//            System.out.println(names.get(i));

        ArrayList<String> names = new ArrayList<>();
        names.add("Ross");
        names.add("Rachel");
        names.add("joey");
        System.out.println(names);

        names.set(1, "Phoebe"); //1 = index of arraylist
        names.remove(2);
        System.out.println(names);
        System.out.println(names.get(0));
        names.clear(); // it clears the whole list
        System.out.println(names);

        System.out.println("================================================================");

        System.out.println("2d - ArrayLists");

        ArrayList<String> food = new ArrayList<>();
        food.add("pizza");
        food.add("burger");
        food.add("pasta");

        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("coffee");
        drinks.add("tea");
        drinks.add("soda");

        ArrayList<String> vegetable = new ArrayList<>();
        vegetable.add("Tomatoes");
        vegetable.add("potato");

        ArrayList<ArrayList<String>> GroceryList = new ArrayList<>();
        GroceryList.add(food);
        GroceryList.add(drinks);
        GroceryList.add(vegetable);
        System.out.println(GroceryList);
        System.out.println(GroceryList.get(1)); //1st get is for index of list
        System.out.println(GroceryList.get(1).get(2)); // 2nd get is for index of element within list
        //read as get list 1 with item number 2 (everything starts from zero)


    }
}
