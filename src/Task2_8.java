import java.util.Arrays;

public class Task2_8 {

	public static void main(String[] args) {
		int[] a = {-5, 16, 4, 0, 5, 12, -3, 2, 5, 13};
        
		// Сортируем массив
		Arrays.sort(a);
		 
		// Перебираем элементы. Когда находим первый больший 3, выходим.  
		for (int i = 0; i < a.length; i++)
		{
		    if (a[i] > 3)
		    {
		        System.out.println("Минимальный элемент из элементов, которые больше 3: " + a[i]);
		        break;
		    }
		}
		 
		// Еще один вариант
		int j = 0;
		int min = 0;
		    
		do
		{
		    min = a[j];
		    j++;
		}
		while (min < 3);
		System.out.println("Минимальный элемент из элементов, которые больше: " + min);

	}

}
