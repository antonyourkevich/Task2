import com.sun.java_cup.internal.runtime.Scanner;

public class Task2_11 {
	public static void main(String[] args) {
        System.out.println("Введите количество чисел : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
       
        System.out.println("Введите " + n +" чисел.");
        for (int i = 0; i < arr.length; i++) {
 
            arr[i] = in.nextInt();
        }
        System.out.println("Вы ввели " + n +" чисел.");
        for (int i = 1; i < arr.length; i++) {
            if (arr.length < 3){
                System.out.println("Вы ввели слишком маленькое "
                                        + "число чисел. вначале");
                break;
            }
            if (i == arr.length-1) break;
             
            if (arr[i] == (arr[i - 1] + arr[i + 1]) / 2) {
             System.out.println("arr["+i+"]=" +arr[i] 
                               +" равно полусумме соседних членов");   
 
            }
           
 
 
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        
        }
        
        
    }

}
