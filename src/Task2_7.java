import java.util.Arrays;

public class Task2_7 {

	public static void main(String[] args) {

		
		int[] a = {5, 13, 21, 37, 43, 55, 62, 78, 84, 93};
        int temp = a[0];
        a[0] = a[9];
        a[9] = temp;
        System.out.println(a[0]);
        System.out.println(a[9]);
}
}
