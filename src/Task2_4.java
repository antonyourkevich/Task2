import java.util.Arrays;
import java.util.Random;
 
public class Task2_4 {
    public static void main(String[] args) {
        Random random = new Random();
 
        int lengthArray = random.nextInt(10) + 1; //случайно выбираем длинну массива от 1 до 10
        int[] a = new int[lengthArray];
 
        //заполняем массив случайными числами от -10 до 10
        for (int i = 0; i < a.length; i++) a[i] = random.nextInt(21) - 10;
        System.out.println("Наш массив: " + Arrays.toString(a));
 
        //ищем кол-во отрицательных элементов (можно было и в первом цикле сразу найти)
        int count = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i] < 0) count++;
            break;
        }
 
        System.out.print("ОТВЕТ: Наш массив имеет " + count + " отрицательных числа(-ел);");
        for (int i = 0; i < a.length; i++){
            if (a[i] > 0) count++;
        }
 
        System.out.print("ОТВЕТ: Наш массив не имеет отрицательных числа(-ел);");
    }
}