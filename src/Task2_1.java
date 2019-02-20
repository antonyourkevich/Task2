
public class Task2_1 {
	public static void main(String[] args) {
		String str = "абвгдеёжзи";
		String reverse = new StringBuffer(str).reverse().toString();
		System.out.println("\nСтрока до реверса: " + str);
		System.out.println("Строка в обратном порядке, после реверса: " + reverse);
	}
}