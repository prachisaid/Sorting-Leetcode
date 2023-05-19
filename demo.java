import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class demo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();

        int[] numbers = new int[len];

        for (int i = 0; i < len; i++) {
            numbers[i] = scanner.nextInt();
        }

        int cost = new demo().reductionCost(numbers);
        System.out.println("Array -------------  " + Arrays.toString(numbers));
        System.out.println("Array reduction cost " + cost);
    }

    protected int reductionCost(int[] arr) {
        //covert into ArrayList for easy insert, delete
        List<Integer> numList = Arrays.stream(arr)
                .boxed()
                .sorted()
                .collect(Collectors.toList());

        int cost = 0;
        while (numList.size() > 1) {
            if (numList.get(numList.size() - 1) < numList.get(numList.size() - 2)) {
                int element = numList.remove(numList.size() - 1);
                binarySearchInsertion(numList, element);
            }
            int sum = numList.remove(0) + numList.remove(0);
            numList.add(sum);
            cost += sum;
        }

        return cost;
    }

    protected void binarySearchInsertion(List<Integer> list, int element) {
        int low = 0;
        int high = list.size() - 1;
        int mid = 0;

        while (low <= high) {
            mid = (low + high) / 2;
            if (element < list.get(mid)) {
                high = mid - 1;
            } else if (element > list.get(mid)) {
                low = mid + 1;
            } else {
                break;
            }
        }
        list.add(mid, element);
    }


}
