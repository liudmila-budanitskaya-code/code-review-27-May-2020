/*4. Programming with classes
 * 
Агрегация и композиция

2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться, 
менять колесо, вывести на консоль марку автомобиля.

 */

package by.student.budanitskaya.aggregation_and_composition.task2;

public class Engine implements Movable {

	private final boolean ifGasoline;

	public Engine(boolean ifGasoline) {
		super();
		this.ifGasoline = ifGasoline;
	}

	public boolean getIfGasoline() {
		return ifGasoline;
	}

	public void driveAnywhere() {
		System.out.println("I am the engine that makes the car move!");
	}

}