package This_Keyword;
//Here, we can see that the reference of both obj and this is the same.
// It means "this" is nothing but the reference to the current object.

//1. this is used with Getters and Setters
    //Here, we have used this keyword:
    //to assign value inside the setter method
    //to access value inside the getter method

//2. Using this for Ambiguity Variable Names -:
    // If the instance variable and the parameter have the same name(here,age)
    // then the Java compiler is confused due to name ambiguity.
    //In such a situation, we use this keyword.

//3. this is used in Constructor Overloading (ComplexClass - Code)
    //While working with constructor overloading,
    // we might have to invoke one constructor from another constructor.
    // In such a case, we cannot call the constructor explicitly.
    // Instead, we have to use this keyword.

//4. Passing 'this' as an Argument (Square - code)
    //We can use this keyword to pass the current object as an argument to a method
    //Since this keyword contains the reference to the object obj of the class,
    //we can change the values of data inside the functions().



class Main {
    int age; String name;//instance variables
    void setName( String name ) {
        this.name = name;
    }

    // getter method
    String getName(){
        return this.name;
    }

    Main(int age) //Parameter
    {
        this.age = age;
        System.out.println("this reference = " + this);
        System.out.println("this value = " + this.age);
    }
}
public class ThisOperator {
    public static void main(String[] args) {
        Main obj = new Main(8);
        System.out.println("object reference = " + obj);
        System.out.println("object values = " + obj.age);
        System.out.println();
        obj.setName("Bro");
        System.out.println("object name = " + obj.getName());
    }
}
