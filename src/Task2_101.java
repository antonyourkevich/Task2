import java.util.Arrays;
 
public class Task2_101 {
    public static void main(String[] args) {
        int [] mas = new int[40];
 
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int)(Math.random()*90)+10;
        }
        System.out.println(Arrays.toString(mas));
 
        boolean flag = true;
        for (int i = 1; i < mas.length; i++) {
             if(mas[i]<=mas[i-1]){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("������ �������� ������ ������������ �������������������");
        } else {
            System.out.println("������ �� �������� ������ ������������ �������������������");
        }
    }
}