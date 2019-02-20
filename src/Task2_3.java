
import java.util.Arrays;


public class Task2_3
{
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        System.out.println("Original array:");
        System.out.println(Arrays.toString(a));
        
        System.out.println("First method (using for):");
        firstMethod(a);
        System.out.println(Arrays.toString(a));
        
        System.out.println("Second method (using while):");
        secondMethod(a);
        System.out.println(Arrays.toString(a));
    }
    
    public static void firstMethod(int[] a) {
        for(int i = 2; i < a.length; i += 3) {
            a[i] *= 2;
        }
    }
    
    public static void secondMethod(int[] a) {
        int i = 2;
        
        while(i < a.length) {
            a[i] *= 2;
            i += 3;
        }
    }
}