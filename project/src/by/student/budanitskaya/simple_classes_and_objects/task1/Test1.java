/*4. Programming with classes
 * 
Простейшие классы и объекты.

1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных. Добавьте метод,
который находит сумму значений этих переменных, и метод, который находит наибольшее значение из этих двух переменных.

 */

package by.student.budanitskaya.simple_classes_and_objects.task1;

public class Test1 {

	private int num1;
	private int num2;

	// конструктор без аргументов

	public Test1() {
		super();
		int defaultValue1 = 3;
		int defaultValue2 = 4; // значения полей экземпляра класса по умолчанию

		this.num1 = defaultValue1;
		this.num2 = defaultValue2;
	}

	// конструктор с аргументами

	public Test1(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	// геттеры и сеттеры

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	// методы класса Test1

	// метод нахождения суммы

	public int sumOfNumbers(Test1 test) {
		int num1;
		int num2;
		num1 = test.getNum1();
		num2 = test.getNum2();
		int sum = num1 + num2;
		return sum;
	}

	// метод нахождения максимального значения из этих двух переменных

	public int findMax(Test1 test) {

		int num1;
		int num2;
		num1 = test.getNum1();
		num2 = test.getNum2();

		if (num1 >= num2) {
			return num1;
		} else {
			return num2;
		}

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + num1;
		result = prime * result + num2;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test1 other = (Test1) obj;
		if (num1 != other.num1)
			return false;
		if (num2 != other.num2)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Test1 [num1 =" + num1 + ", num2 =" + num2 + "]";
	}

}
