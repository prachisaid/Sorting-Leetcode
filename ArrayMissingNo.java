import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayMissingNo {
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 3, 2, 3, 4, 8, 6};
       
        // System.out.println(Arrays.toString( missingNo(arr)));
        // System.out.println(arr.length);
    }

    static List<Integer> missingNo(int[] arr){
        int i = 0;

        while(i < arr.length){
            int correct = arr[i]-1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if((arr[j]-1) != j){
                ans.add(j+1);
            }
        }
        return ans;
    }

    private static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
