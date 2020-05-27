package by.student.budanitskaya.simple_classes_and_objects.task2;

public class Test2 {

	private int num1;
	private int num2;

	// конструктор с входными параметрами

	public Test2(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	// конструктор, инициализирующий члены класса по умолчанию

	public Test2() {
		super();

		int defaultValue1 = 1;
		int defaultValue2 = 2;

		this.num1 = defaultValue1;
		this.num2 = defaultValue2;
	}

	// set- и get- методы для полей экземпляра класса

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
		Test2 other = (Test2) obj;
		if (num1 != other.num1)
			return false;
		if (num2 != other.num2)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Test2 [num1=" + num1 + ", num2=" + num2 + "]";
	}

}