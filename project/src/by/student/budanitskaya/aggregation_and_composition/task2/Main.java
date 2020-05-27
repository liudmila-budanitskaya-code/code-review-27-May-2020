/*4. Programming with classes
 * 
Агрегация и композиция

2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться, 
менять колесо, вывести на консоль марку автомобиля.

 */

package by.student.budanitskaya.aggregation_and_composition.task2;

public class Main {

	public static void main(String[] args) {
		String carName = "Toyota";

		int wheelSize = -5;

		Engine ourEngine = new Engine(true);
		
		ourEngine.driveAnywhere();

		Car car = new Car(carName, wheelSize, ourEngine);
		car.driveAnywhere();

		System.out.println("Размер колеса машины: " + car.getWheelSize());
		
		car.printCarBrand();

	}

}

