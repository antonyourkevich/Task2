

public class Task2_2 {
    public static void main(String[] args) {
        int [ ] myArr = {6, 42, 3, 7};
        int pr=1;
        for(int x=0; x<myArr.length; x++) {
            pr *= myArr[x];
        }
        System.out.println(pr);
    }
}