/*4. Programming with classes
 * 
Простейшие классы и объекты.

7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления площади,
периметра и точки пересечения медиан.

 */

package by.student.budanitskaya.simple_classes_and_objects.task7;

public class Logic {

	// метод для вычисления периметра
	public static double calculateTrianglePerimeter(Triangle triangle) {

		double l1, l2, l3;// длины сторон треугольника

		l1 = Math.sqrt(Math.pow(triangle.getX()[0] - triangle.getX()[1], 2)
				+ Math.pow(triangle.getY()[0] - triangle.getY()[1], 2));
		l2 = Math.sqrt(Math.pow(triangle.getX()[1] - triangle.getX()[2], 2)
				+ Math.pow(triangle.getY()[1] - triangle.getY()[2], 2));
		l3 = Math.sqrt(Math.pow(triangle.getX()[0] - triangle.getX()[2], 2)
				+ Math.pow(triangle.getY()[0] - triangle.getY()[2], 2));

		return l1 + l2 + l3; // возвращаем периметр треугольника
	}

	// метод для вычисления площади

	public static double calculateTriangleArea(Triangle triangle) {

		double l1, l2, l3; // длины сторон треугольника
		double p; // полупериметр
		double triangleArea; // площадь треугольника

		l1 = Math.sqrt(Math.pow(triangle.getX()[0] - triangle.getX()[1], 2)
				+ Math.pow(triangle.getY()[0] - triangle.getY()[1], 2));
		l2 = Math.sqrt(Math.pow(triangle.getX()[1] - triangle.getX()[2], 2)
				+ Math.pow(triangle.getY()[1] - triangle.getY()[2], 2));
		l3 = Math.sqrt(Math.pow(triangle.getX()[0] - triangle.getX()[2], 2)
				+ Math.pow(triangle.getY()[0] - triangle.getY()[2], 2));

		p = (l1 + l2 + l3) / 2;

		triangleArea = Math.sqrt(p * (p - l1) * (p - l2) * (p - l3)); // формула Герона

		return triangleArea;
	}

	// метод для нахождения точки пересечения медиан треугольника

	public static double[] findMedianIntersectionPoint(Triangle triangle) {
		double[] array = { (triangle.getX()[0] + triangle.getX()[1] + triangle.getX()[2]) / 3,
				(triangle.getY()[0] + triangle.getY()[1] + triangle.getY()[2]) / 3 };

		return array;
	}

}
