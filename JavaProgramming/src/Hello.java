import java.util.Arrays;


public class Hello {

	public static void main(String[] args) {
		System.out.println("Hello, world!");
		
		int[] arr = new int[8];
		for(int i = 0; i < arr.length; i++){
			arr[i] = i + 1;
		}
		
		for(int i = 0; i < 1000; i++){
			int random = (int)(Math.random() * arr.length);
			int temp = arr[0];
			arr[0] = arr[random];
			arr[random] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
