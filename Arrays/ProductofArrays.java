package Arrays;

public class ProductofArrays {
    public static void main(String[] args) {
        int[] arr = {10,20,5};
        int prod = 1;

        for (int i = 0; i < arr.length; i++) {
            prod = prod* arr[i];
        }

        System.out.println(prod);
    }
}
