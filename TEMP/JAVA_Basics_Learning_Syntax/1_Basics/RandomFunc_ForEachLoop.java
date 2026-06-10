// =====WHAT WE LEARN IN THIS CODE====
// pseudo random class for generating random numbers
// if else , else if , switch = same as that of c++
// while , do while , for loop  = same as that of c++
// but in java = for-each Loop is introduced with syntax => for(dataType item : array) {....}
// "auto" keyword is not used in java
// array_name.length = length of an array
// Arrays in Java => datatype[] array_name = new datatype[size];
// declare then initialization then accessing elements of array (same as c/c++)
// Array indices always start from 0. That is, the first element of an array is at index 0.
// If the size of an array is n, then the last element of the array will be at index n-1.
// multidimensional array have also same concept as that of c/c++

import java.util.Random;

public class RandomFunc_ForEachLoop {
    public static void main(String[] args) {
        System.out.println("==========================================================================================");
        System.out.println("---RANDOM NUMBERS---\n");
        Random random = new Random();
        int q = random.nextInt(); //random number from -2 billion to 2 billion
        int x = random.nextInt(6); //within limits but from (0-5)
        int y = random.nextInt(6) + 1; //within limits (1-6)
        double z = random.nextDouble();
        boolean p = random.nextBoolean();
        System.out.println(q);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(p);

        System.out.println("==========================================================================================");

        System.out.println("---FOR-EACH LOOP---\n");
        //double datatype Array with sum
        double sum = 0;
        double arr[] = {10.9, 8, 9.7, 67.8, 78.99}; // c-style array declaration
        for (double array : arr) {
            System.out.print(array + " ");
            sum += array;
        }
        System.out.println("\nArray Length = " + arr.length);
        System.out.println("Sum = " + sum);
        System.out.println("==========================================================================================");
        //int datatype Array with factorial
        long factorial = 1;
        int[] arr1 = {2, 3, 4, 5, 6, 7, 8, 9}; // // java-style array declaration
        for (int array : arr1) {
            System.out.print(array + " ");
            factorial *= array;
        }
        System.out.println("\nArray Length = " + arr1.length);
        System.out.println("Factorial = " + factorial);
        System.out.println("==========================================================================================");
        //char datatype
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < vowels.length; ++i) //non-enhanced for loop
            System.out.println(vowels[i] + " ");
        //OR
        for (char array : vowels)
            System.out.print(array + " ");
        System.out.println("\n==========================================================================================");

        //String datatype
        String[] names = {"Ross Geller", "Rachael", "Chandler", "Monica", "Phoebe", "Joey"};
        for (String array : names)
            System.out.println(array + " ");
        System.out.println("==========================================================================================");
//        String[] array0;
//        array0 = new String[6];
        //OR
//        String[] array1 = new String[10];

        //declare then initialization of an array(same as c/c++)
        int[] age = new int[3];
        age[0] = 10;
        age[1] = 12;
        age[2] = 21;
        for (int i = 0; i < age.length; i++)
            System.out.print(age[i] + " ");
        System.out.println("\n==========================================================================================");



    }
}
