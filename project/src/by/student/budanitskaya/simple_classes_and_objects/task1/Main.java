/*4. Programming with classes
 * 
Простейшие классы и объекты.

1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных. Добавьте метод,
который находит сумму значений этих переменных, и метод, который находит наибольшее значение из этих двух переменных.

 */

package by.student.budanitskaya.simple_classes_and_objects.task1;

public class Main {

	public static void main(String[] args) {

		int sum;
		int max;

		Test1 test;
		test = new Test1(11, 16);

		test.setNum1(0);

		sum = test.sumOfNumbers(test);
		max = test.findMax(test);

		// вывод суммы

		System.out.println("Сумма чисел равна " + sum);

		// вывод максимального значения

		System.out.println("Максимум равен " + max);

		// вывод значения каждого числа

		System.out.println("Первое число равно " + test.getNum1() + "\nВторое число равно " + test.getNum2());

	}

}
