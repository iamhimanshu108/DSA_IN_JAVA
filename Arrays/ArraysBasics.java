package Arrays;

public class ArraysBasics {
    public static void main(String[] args) {
        int[] x = {6,10,12,33,66,55,88,78,96,45,12,44};

        //Indexing
        System.out.println(x[8]);
        //Output = 96

        //updating elements  - Mutable
        x[8] = 100;
        System.out.println(x[8]);

        int[] arr = new int[4];   // 4 size ka array

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[4] = 50;


    }
}
