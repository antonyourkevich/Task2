import java.util.Arrays;

public class Task2_8 {

	public static void main(String[] args) {
		int[] a = {-5, 16, 4, 0, 5, 12, -3, 2, 5, 13};
        
		// ��������� ������
		Arrays.sort(a);
		 
		// ���������� ��������. ����� ������� ������ ������� 3, �������.  
		for (int i = 0; i < a.length; i++)
		{
		    if (a[i] > 3)
		    {
		        System.out.println("����������� ������� �� ���������, ������� ������ 3: " + a[i]);
		        break;
		    }
		}
		 
		// ��� ���� �������
		int j = 0;
		int min = 0;
		    
		do
		{
		    min = a[j];
		    j++;
		}
		while (min < 3);
		System.out.println("����������� ������� �� ���������, ������� ������: " + min);

	}

}
