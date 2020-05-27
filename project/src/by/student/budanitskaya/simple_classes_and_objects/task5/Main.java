/*4. Programming with classes
 * 
Простейшие классы и объекты.

5. Опишите класс, реализующий десятичный счётчик, который может увеличивать или уменьшать своё значение на единицу в заданном
диапазоне. Предусмотрите инициализацию счётчика значениями по умолчанию и произвольными значениями. Счётчик имеет методы 
увеличения и уменьшения состояния, и метод, позволяющий получить его текущее состояние. Написать код, демонстрирующий
все возможности класса. 

 */

package by.student.budanitskaya.simple_classes_and_objects.task5;

public class Main {

	public static void main(String[] args) {

		Counter counter = new Counter();

		System.out.println("Текущее состояние счётчика:");

		System.out.println(counter.getCurrentState());

		counter.incrementValue();
		counter.incrementValue();
		counter.incrementValue();
		counter.decrementValue();

		System.out.println("Текущее состояние счётчика:");

		System.out.println(counter.getCurrentState());

	}

}
