//=====WHAT WE LEARN IN THIS CODE=====

//1. Deep and Shallow Copying of array
//2. Deep Copying Arrays Using copyOfRange() method
//3. Deep Copying Arrays Using arraycopy() method
//4. Arrays concatenation with the help of for loop
//5. Array concatenation with the help of java.util.Arrays; package
//6. shortcut for printing array => System.out.println(Arrays.toString(arr_name)); which comes with that package

//we copy each element in both arrays to result by using arraycopy() function.
//arraycopy(Object src, int srcPos,Object dest, int destPos, int length); = 5 arguments
//here,   src - source array you want to copy
//        srcPos - starting position (index) in the source array
//        dest - destination array where elements will be copied from the source
//        destPos - starting position (index) in the destination array
//        length - number of elements to copy
//according to below code , The arraycopy(array1, 0, result, 0, aLen) function -> copies
// array1 starting from index 0 to result from index 0 to aLen.
//Likewise, for arraycopy(array2, 0, result, aLen, bLen) copies
//array2 starting from index 0 to result from index aLen to bLen.

//ArrayList and Java Vector ->  IS YET TO LEARN

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] a = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] b = a;
        a[3] = 11; // but it is shallow copy of array
        //because if we change element of array (a) then
        // element of array (b) also changed
        System.out.print("Shallow Copy  : " + Arrays.toString(b));

        System.out.println("\n===========================================================");
        //DEEP COPYING OF ARRAY
        int[] source = {6, 5, 4, 3, 2, 1};
        int[] destination = new int[6];
        for (int i = 0; i < source.length; ++i)
            destination[i] = source[i];
        System.out.println("Deep Copy : " + Arrays.toString(destination));

        System.out.println("===========================================================");
        System.out.println("Deep Copying Arrays Using arraycopy() method");
        int[] n1 = {2, 3, 12, 4, 12, -2};
        int[] n2 = new int[n1.length];
        // copying entire n1 array to n2
        System.arraycopy(n1, 0, n2, 0, n1.length);
        System.out.println("n2 = " + Arrays.toString(n2));

        // copying elements from index 2 on n1 array // copying element to index 1 of n3 array // 2 elements will be copied
        int[] n3 = new int[5];
        System.arraycopy(n1, 2, n3, 1, 2);
        System.out.println("n3 = " + Arrays.toString(n3));

        System.out.println("===========================================================");
        System.out.println("Deep Copying Arrays Using copyOfRange() method");
        int[] arr = {2, 3, 12, 4, 12, -2};
        int[] destination1 = Arrays.copyOfRange(arr, 0, arr.length);
        System.out.println("destination1 = " + Arrays.toString(destination1));
        // copying from index 2 to 5 (5 is not included)
        int[] destination2 = Arrays.copyOfRange(arr, 2, 5);
        System.out.println("destination2 = " + Arrays.toString(destination2));

        System.out.println("===========================================================");
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int aLen = array1.length;
        int bLen = array2.length;
        int[] result = new int[aLen + bLen];
        System.arraycopy(array1, 0, result, 0, aLen);
        System.arraycopy(array2, 0, result, aLen, bLen);
        System.out.println("concatenate with arraycopy() function : " + Arrays.toString(result));

        System.out.println("==========================================================");

        int[] array_1 = {7, 8, 9};
        int[] array_2 = {10, 11, 12};
        int length = array_1.length + array_2.length;
        int[] result0 = new int[length];
        int pos = 0;
        for (int element : array_1) {
            result0[pos] = element;
            pos++;
        }
        for (int element : array_2) {
            result0[pos] = element;
            pos++;
        }
        System.out.println("concatenate using simple for loop : " + Arrays.toString(result0));

        System.out.println("==========================================================");

        System.out.println("2d - Arrays\n");
        int[][] arr2d = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < arr2d.length; ++i) {
            for (int j = 0; j < arr2d[i].length; ++j)
                System.out.print(arr2d[i][j] + " ");
            System.out.println();
        }
        System.out.println();
        int[][] array2d = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int[] innerArray : array2d) {
            for (int data : innerArray)
                System.out.print(data + " ");
            System.out.println();
        }
    }
}
