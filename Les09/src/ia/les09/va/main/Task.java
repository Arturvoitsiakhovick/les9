package ia.les09.va.main;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		double x;
		double sum;
		x = inputDoubleFromConsole("Введите значение x: ");
		sum = addition(x);
		simplePrint(x, sum);
		richPrint(x, sum);

	}

	@SuppressWarnings("resource")
	public static double inputDoubleFromConsole(String message) {
		double value;
		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.print("Неверный ввод. " + message);
		}
		value = sc.nextDouble();
		return value;
	}

	public static double addition(double x) {
		double sum;
		sum = Math.sqrt(Math.pow(Math.E, (2.2 * x))) - Math.abs(Math.sin((Math.PI * x) / (x + (2.0 / 3.0)))) + 1.7;
		return sum;
	}

	public static void simplePrint(double x, double sum) {
		System.out.println("Результат выражения при x - " + x + " = " + sum);
	}

	public static void richPrint(double x, double sum) {
		System.out.printf("Результат выражения при x - [%.2f] = [%.7f]", x, sum);
	}

}
