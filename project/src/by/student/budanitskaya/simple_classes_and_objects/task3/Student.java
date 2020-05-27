/*4. Programming with classes
 * 
Простейшие классы и объекты.

3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из 5 элементов). 
Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и номеров групп студентов, имеющих
оценки, равные только 9 или 10.

 */

package by.student.budanitskaya.simple_classes_and_objects.task3;

import java.util.Arrays;

public class Student {

	private String studentName;
	private int groupNumber;
	private int[] grades = new int[5];

	// конструктор без входных параметров

	public Student() {
		super();

	}

	public Student(String studentName, int groupNumber, int[] grades) {
		super();
		this.studentName = studentName;
		this.groupNumber = groupNumber;
		this.grades = grades;
	}

	// геттеры

	public String getStudentName() {
		return studentName;
	}

	public int getGroupNumber() {
		return groupNumber;
	}

	public int[] getGrades() {
		return grades;
	}

	// toString(), equals(), hashCode()

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(grades);
		result = prime * result + groupNumber;
		result = prime * result + ((studentName == null) ? 0 : studentName.hashCode());
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
		Student other = (Student) obj;
		if (!Arrays.equals(grades, other.grades))
			return false;
		if (groupNumber != other.groupNumber)
			return false;
		if (studentName == null) {
			if (other.studentName != null)
				return false;
		} else if (!studentName.equals(other.studentName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.getClass().getName() + "[studentName=" + studentName + ", groupNumber=" + groupNumber + ", grades="
				+ Arrays.toString(grades) + "]";
	}

}
