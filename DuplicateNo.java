public class DuplicateNo {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        System.out.println(missingNo(arr));
    }

    static int missingNo(int[] arr){
        int i = 0;

        while(i < arr.length){

            if(arr[i] != i+1){
                int correct = arr[i]-1;
                if(arr[i] != arr[correct]){
                    swap(arr, i, correct);
                }else{
                    return arr[i];
                }
            }else{
                i++;
            }
        }

        return -1;
    }

    private static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
