public class Task2_6 {
 
    public static void replacementEven(int [] arrray13) {
        int x;
        for (int i = 0; i < arrray13.length - 1; i += 2) {
            x = arrray13[i];
            arrray13[i] = arrray13[i + 1];
            arrray13[i + 1] = x;
        }
        for (int i : arrray13) {
            System.out.print(i + "\t");
        }
    }


    public static void main(String[] args) {
        int[] arr13 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        replacementEven(arr13);


    }
}