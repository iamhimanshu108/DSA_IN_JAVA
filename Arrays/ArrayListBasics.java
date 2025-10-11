package Arrays;

import java.util.ArrayList;

public class ArrayListBasics {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25);
        arr.add(21);
        arr.add(18);
        arr.add(5);
        arr.add(10);

        System.out.println(arr.get(2));

        int n = arr.size();
        for (int i=0; i<n; i++){
            System.out.println(arr.get(i)+" ");
        }
        for(int ele : arr){
            System.out.println(ele+ " ");
        }
    }
}
