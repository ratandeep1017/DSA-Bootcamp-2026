package Static_keyword;
public class ClassName
{
    //static = modifier
    //a single copy of variable / method is created and shared
    //the class "owns" the static member and methods
    //so the members and methods are directly accessible by Class
    public int count1;
    public static int count2; //static variable
    ClassName()
    {
        count1++;
        count2++;
    }
    public static void display (){
        System.out.println("total objects = " + count2  );
        //System.out.println("You have total " + count1 + " Friends" ); // [ERROR]
    }
}
