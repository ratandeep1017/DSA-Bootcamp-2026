public class diagonal_sum_diff {
    public static void main(String[] args) {
        int arr[][] = {
            {1,2,3},
            {4,5,6},
            {6,7,8}
        };
        int r=3,c=3;

        int sum=0, diff=0;
        for(int i=0; i<r; i++)
            for(int j=0; j<c;j++)
                if(i==j){
                    sum+=arr[i][j];
                    diff-=arr[i][j];
                }
        System.out.println("Sum : " + sum + " ,Diff : " + diff);
        
    }
}
