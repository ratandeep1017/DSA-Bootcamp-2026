public class SecondMaxMin {
    public static void main(String[] args) throws Exception {
        int[] arr = { 1, 3, 1, 4, 6, 7, 3, 7, 8, 3, 67, 63, 65, 67, 3, 2, 25 };
        // int[] arr = { 3, 3, 3, 1, 2 };
        // int[] arr = { 2, 1, 1, 3 };
        // int[] arr = { 2 };
        if (arr.length < 2) {
            System.out.println("Array must have at least two elements for Second Max and Min.");
            return;
        }

        // ! Initialize variables to edge limits
        int max = Integer.MIN_VALUE, secMax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE, secMin = Integer.MAX_VALUE;
        //------------------------------------------------------
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] > max) {
        //         secMax = max;
        //         max = arr[i];
        //     } else if (arr[i] != max && arr[i] > secMax) secMax = arr[i];
        //     if (arr[i] < min) {
        //         secMin = min;
        //         min = arr[i];
        //     } else if (arr[i] != min && arr[i] < secMin) secMin = arr[i];
        // }
        //------------------------------------------------------
        for (int ele : arr) {
            // ! Maximum tracking logic
            if (ele > max) {
                secMax = max;
                max = ele;
            } else if (ele != max && ele > secMax)
                secMax = ele;

            // ! Minimum tracking logic
            if (ele < min) {
                secMin = min;
                min = ele;
            } else if (ele != min && ele < secMin)
                secMin = ele;
        }

        
        System.out.println("Max = " + max + ", Second Max = " + secMax);
        System.out.println("Min = " + min + ", Second Min = " + secMin);

    }
}