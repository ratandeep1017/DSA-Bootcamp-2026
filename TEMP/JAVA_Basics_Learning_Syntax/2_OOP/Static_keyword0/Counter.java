package Static_keyword0;

public class Counter {
   static  int count;

    public Counter() {
        count++;
    }

    public static void main(String[] args) {
        //although we don't need to access count variable
        // using object of counter, if we are using static keyword
        Counter c1 = new Counter();
        System.out.println("Total count: " + c1.count);
        Counter c2 = new Counter();
        System.out.println("Total count: " + c2.count);
        Counter c3 = new Counter();
        System.out.println("Total count: " + c3.count);
    }
}

