
public class MergeTwoSortedArray {
    public static void merge(int[] a, int m, int[] b, int n) {
        int[] c = new int[m+n];
        //i for array a , j for array b , k for array c
        int i=0, j=0, k=0;
        while(i<m && j<n){
            if(a[i] < b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        while(i<m) c[k++] = a[i++]; //b array completed. then take elements from a
        while(j<n) c[k++] = b[j++]; //a array completed. then take elements from b
        for(int ele: c)
            System.out.print(ele + " ");
    }
    public static void main(String[] args) {
        int a[] = {2,4,6,8,10};
        int b[] = {1,3,5,7,9,11,14,15};
        merge(a, a.length, b, b.length);

    }
}




