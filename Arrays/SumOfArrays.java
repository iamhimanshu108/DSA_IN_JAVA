package Arrays;

public class SumOfArrays {
    public static void main(String[] args) {
        int[] arr = {10,20,30,-30};

        int n = arr.length;
        int sum=0;

        for(int i=0; i<n; i++){
            sum +=arr[i];
        }
        System.out.println(sum);
    }
}
