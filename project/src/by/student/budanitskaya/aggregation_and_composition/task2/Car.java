/*4. Programming with classes
 * 
Агрегация и композиция

2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться, 
менять колесо, вывести на консоль марку автомобиля.

 */

package by.student.budanitskaya.aggregation_and_composition.task2;

public class Car implements Movable {
	// здесь мы принимаем ряд полей финальными, так как марка, размер колеса и двигатель (в данном случае) не могут быть 
	// изменены впоследствии.

	private Wheel[] wheelArray = new Wheel[4];
	private final String brand;
	private final int wheelSize;
	private final Engine engine;
	

	public Car(String brand, int wheelSize, Engine engine) {
		super();
		this.brand = brand;
		this.engine = engine;

		int defaultWheelSize = 5;
		
		// проверка размера колеса на допустимость. Если в конструктор передано недопустимое значение, размер колеса принимается равным 5. 
		if (wheelSize <= 0) {
			this.wheelSize = defaultWheelSize;
		} else {
			this.wheelSize = wheelSize;
		}

		for (int i = 0; i < 4; i++) {
			this.wheelArray[i] = new Wheel(wheelSize);
		}

	}

	// геттеры (сеттеры исключены, чтобы свойства автомобиля задавались однозначно
	// при его создании
	// и не могли бы быть изменены впоследствии

	public Wheel[] getWheelArray() {
		return wheelArray;
	}

	public String getBrand() {
		return brand;
	}

	public int getWheelSize() {
		return wheelSize;
	}

	public Engine getEngine() {
		return engine;
	}

	// метод для замены колеса

	public void changeWheel(int wheelNumber) {
		if (wheelNumber < 0 || wheelNumber > 3) {
			System.out.println("Колеса с таким номером не существует. Так что это будет первое колесо.");
			wheelNumber = 0;
		}

		this.wheelArray[wheelNumber] = new Wheel(this.wheelSize);
	}

	// переопределяем метод интерфейса Movable для автомобиля

	public void driveAnywhere() {

		System.out.println("I am a car. I can drive thanks to the wheels and the engine!");
	}

	// метод для заправки автомобиля

	public void fuelMeUp() {
		System.out.println("Fueled up!");
	}
	
	// метод вывести на консоль марку автомобиля
	
	public void printCarBrand() {
		System.out.println("Марка автомобиля: " + this.brand);
	}

}