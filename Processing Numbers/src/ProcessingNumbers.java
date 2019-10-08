//Alice Peterson
//Pair programming assignment code
import java.util.*;
public class ProcessingNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int max = input.nextInt();
		int min = input.nextInt();
		int sum = input.nextInt();
		int numTimes = input.nextInt();
		for(int i = 0; i<numTimes; i++) {
			int num = input.nextInt();
			if(num%2==0) {
				sum += num;
			}
			if(num>max) {
				max = num;
			}
			else if(num < min) {
				min = num;
		}
		System.out.println("max ="+ max);
		System.out.println("min ="+ min);
		System.out.println("even sum ="+ sum);
		}
	}
}
