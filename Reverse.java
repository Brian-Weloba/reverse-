import java.util.*;

public class Reverse{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers separated by single space:");
		String[] numString = sc.nextLine().split(" ");
		int[] numArray = new int[numString.length];
		for(int i = 0; i < numString.length; i++){
			numArray[i]=Integer.parseInt(numString[i]);
		}
		
		System.out.println(Arrays.toString(reverseArray(numArray)));
	}
	
	public static int[] reverseArray(int[] arr){
		for(int i = 0; i <arr.length / 2; i++){
				int temp = arr[i];
				arr[i] = arr[arr.length - 1 - i];
				arr[arr.length - 1 - i] = temp;
		}
		return arr;
	}
}