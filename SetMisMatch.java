import java.util.Arrays;

public class SetMisMatch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4};
        System.out.println(Arrays.toString(setMismatch(arr)));
    }

    static int[] setMismatch(int[] arr){
        int i = 0;

        while(i < arr.length){
            int correct = arr[i]-1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if((arr[j]-1) != j){
                return new int[] {arr[j], j+1};
            }
        }
        return new int[] {-1, -1};
    }

    private static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
