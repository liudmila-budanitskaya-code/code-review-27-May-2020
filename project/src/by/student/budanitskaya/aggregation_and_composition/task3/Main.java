/* 4. Programming with classes
 *    Агрегация и композиция
 * 
 * 3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: 
 * вывести на консоль столицу, количество областей, площадь, областные центры.* 
 * 
 */

package by.student.budanitskaya.aggregation_and_composition.task3;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<District> districtList = new ArrayList<District>();
		State state = new State();
		View view = new View();
		// выводим столицу
		view.printCapital();
		// выводим количество областей
		view.printRegionNumber();
		// выводим площадь
		view.printArea();

	}

}
