/*4. Programming with classes
 * 
Агрегация и композиция

2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться, 
менять колесо, вывести на консоль марку автомобиля.

 */

package by.student.budanitskaya.aggregation_and_composition.task2;

public class Wheel implements Movable {

	private final int size;

	public Wheel(int size) {
		super();
		int defaultSize = 5;
		if (size <= 0) {
			this.size = defaultSize;
		} else {
			this.size = size;
		}

	}

	public int getSize() {
		return size;
	}

	public void driveAnywhere() {
		System.out.println("I am the wheel! Me and three my companions make the car move!");
	}

}