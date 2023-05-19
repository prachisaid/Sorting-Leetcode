import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
            
        System.out.println(missingNo(arr));
        // System.out.println(arr.length);
    }

    static int missingNo(int[] arr){
        int i = 0;

        while(i < arr.length){
            int correct = arr[i];
            if(arr[i] == arr.length){
                i++;
            }
            else if(arr[i] != arr[correct] && arr[i] != arr.length){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j){
                return j;
            }

        }
        return arr.length;
    }

    private static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
