import java.util.Arrays;
import java.util.Random;
 
public class Task2_4 {
    public static void main(String[] args) {
        Random random = new Random();
 
        int lengthArray = random.nextInt(10) + 1; //�������� �������� ������ ������� �� 1 �� 10
        int[] a = new int[lengthArray];
 
        //��������� ������ ���������� ������� �� -10 �� 10
        for (int i = 0; i < a.length; i++) a[i] = random.nextInt(21) - 10;
        System.out.println("��� ������: " + Arrays.toString(a));
 
        //���� ���-�� ������������� ��������� (����� ���� � � ������ ����� ����� �����)
        int count = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i] < 0) count++;
            break;
        }
 
        System.out.print("�����: ��� ������ ����� " + count + " ������������� �����(-��);");
        for (int i = 0; i < a.length; i++){
            if (a[i] > 0) count++;
        }
 
        System.out.print("�����: ��� ������ �� ����� ������������� �����(-��);");
    }
}