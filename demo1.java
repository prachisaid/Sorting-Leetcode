import java.util.PriorityQueue;
import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();

        int[] numbers = new int[len];

        for (int i = 0; i < len; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println(reductionCost(numbers));
    }

    public static int reductionCost(int[] num) {
		// num.length >= 2
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int totalCost = 0;
		for (int i = 0; i < num.length; i++) {
			pq.add(num[i]);
		}
		
		while (pq.size() > 1) {
			int num1 = pq.poll();
			int num2 = pq.poll();
			int cost = num1 + num2;
			totalCost += cost;
			pq.add(cost);
		}
		return totalCost;
	}	
}
