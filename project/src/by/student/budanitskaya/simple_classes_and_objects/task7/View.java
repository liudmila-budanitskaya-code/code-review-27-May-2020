/*4. Programming with classes
 * 
Простейшие классы и объекты.

7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления площади,
периметра и точки пересечения медиан.

 */

package by.student.budanitskaya.simple_classes_and_objects.task7;

public class View {

	public static void printTriangleArea(Triangle triangle) {
		System.out.printf("Площадь треугольника: %.1f", Logic.calculateTriangleArea(triangle));
	}

	public static void printTrianglePerimeter(Triangle triangle) {
		System.out.printf("\nПериметр треугольника: %.1f", Logic.calculateTrianglePerimeter(triangle));
	}

	public static void printMedianIntersectionPoint(Triangle triangle) {
		System.out.printf("\nКоордината по оси x точки пересечения медиан треугольника: %.1f",
				Logic.findMedianIntersectionPoint(triangle)[0]);
	}

}
