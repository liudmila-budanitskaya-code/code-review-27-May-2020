/*4. Programming with classes
 * 
Простейшие классы и объекты.

7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления площади,
периметра и точки пересечения медиан.

 */

package by.student.budanitskaya.simple_classes_and_objects.task7;

public class Main {

	public static void main(String[] args) {

		int[] x_array = { 1, 2, 3 };
		int[] y_array = { 4, 5, 6 };

		Triangle triangle = new Triangle(new int[] { 20, 40, 60 }, new int[] { 11, 30, 5 });

		View.printTriangleArea(triangle);
		View.printTrianglePerimeter(triangle);
		View.printMedianIntersectionPoint(triangle);

	}

}