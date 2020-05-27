/* 4. Programming with classes
 *    Агрегация и композиция
 * 
 * 3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: 
 * вывести на консоль столицу, количество областей, площадь, областные центры.* 
 * 
 */

package by.student.budanitskaya.aggregation_and_composition.task3;

public class View {

	State famousState = new State();

	// вывести на консоль столицу

	public void printCapital() {
		System.out.println("Так называется столица государства:");
		System.out.println(famousState.getCapital().getName());
	}

	// вывести на консоль количество областей

	public void printRegionNumber() {
		System.out.println("Количество областей в государстве: ");
		System.out.println(famousState.getDistrictList().size());
	}

	// вывести на консоль площадь

	public void printArea() {
		System.out.println("Площадь государства: ");
		System.out.println(famousState.getArea());
	}

}
