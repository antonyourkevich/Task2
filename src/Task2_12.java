
import static java.lang.System.out;
public class Task2_12 {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        int k = 3;
        int n = 12;
        //������ ��� �������, �����
        //���� � ������, ������ - ����. �������
        int [] mas = new int [n];
        int [] mas1 = new int [n+k];        
        out.println();
        out.println("��������� ������ ������ ���������� �������");
for (int i = 0; i < mas.length; i++){
    mas [i] = (int)(Math.random()*30);
    out.format("%3d", mas [i]);
}
out.println();
out.println("������� ������ ������ �� k ���������");
for (int i = 0; i < mas.length; i++){
    mas1 [i+k] = mas[i];
    mas[i] = mas1[i];
    out.format("%3d", mas [i]);
}
out.println();
out.println("����� ��������� ������ ������ ���������� �������");
for (int i = 0; i < mas.length; i++){
mas [i] = (int)(Math.random()*45);
out.format("%3d", mas [i]);
}
 
out.println();
out.println("������� ������ ����� �� k ���������");
for (int i = mas.length; i > 0 ; i--){
    mas1 [i-k] = mas[i];
    mas[i] = mas1[i];
    out.format("%3d", mas [i]);
}
 
}
}