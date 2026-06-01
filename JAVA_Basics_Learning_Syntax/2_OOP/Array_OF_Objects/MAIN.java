package Array_OF_Objects;

import java.util.Arrays;

public class MAIN {
    public static void main(String[] args) {
        //ARRAY OF OBJECTS
        Food food1 = new Food("Pizza");
        Food food2 = new Food("Burger");
        Food food3 = new Food("Momo");

        Food[] Fridge = {food1, food2, food3};
        System.out.println(Arrays.toString(Fridge)); //By using Arrays utility with toString method

        for(Food display : Fridge)        //By using For-Each Loop
            System.out.print(display + " ");
        System.out.println();

//        By Implicit call of toString method
        System.out.println(Fridge[0]);
//        By Explicit call of toString method
        System.out.println(Fridge[1].toString());
//        gives error when data is private
        System.out.println(Fridge[2].name);

//        Or we can use -:
//        Food[] Fridge = new Food[3];
//        Fridge[0] = food1;
//        Fridge[1] = food2;
//        Fridge[2] = food3;
    }
}
