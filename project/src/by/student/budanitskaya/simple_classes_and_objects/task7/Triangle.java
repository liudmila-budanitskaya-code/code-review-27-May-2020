/*4. Programming with classes
 * 
Простейшие классы и объекты.

7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления площади,
периметра и точки пересечения медиан.

 */

package by.student.budanitskaya.simple_classes_and_objects.task7;

public class Triangle {

	private int[] x;
	private int[] y;

	// конструкторы (с аргументами и без)

	public Triangle() {

		int[] x_defaultSet = { 1, 2, 3 };
		int[] y_defaultSet = { 4, 5, 6 };

		this.x = x_defaultSet;
		this.y = x_defaultSet;

		new Triangle(x_defaultSet, y_defaultSet);

	}

	public Triangle(int[] x, int[] y) {// массивы координат по оси x и y
		super();

		double l1, l2, l3; // длины сторон треугольника

		int[] x_defaultSet = { 1, 2, 3 };
		int[] y_defaultSet = { 4, 5, 6 };

		l1 = Math.sqrt(Math.pow(x[0] - x[1], 2) + Math.pow(y[0] - y[1], 2));
		l2 = Math.sqrt(Math.pow(x[1] - x[2], 2) + Math.pow(y[1] - y[2], 2));
		l3 = Math.sqrt(Math.pow(x[0] - x[2], 2) + Math.pow(y[0] - y[2], 2));

		// сейчас будет проверка, существует ли треугольник с такими координатами

		if (l1 + l2 <= l3 || l1 + l3 <= l2 || l2 + l3 <= l1) {
			System.out.println(
					"Треугольник с такими координатами не существует.\nМы будем использовать координаты по умолчанию.");
			this.x = x_defaultSet;
			this.y = x_defaultSet;
		} else {
			this.x = x;
			this.y = y;
		}

	}

	// геттеры

	public int[] getX() {
		return x;
	}

	public int[] getY() {
		return y;
	}

}
