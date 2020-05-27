/*4. Programming with classes
 * 
Простейшие классы и объекты.

3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из 5 элементов). 
Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и номеров групп студентов, имеющих
оценки, равные только 9 или 10.

 */

package by.student.budanitskaya.simple_classes_and_objects.task3;

import java.util.Arrays;

public class List {

	private Student[] list;

	public List() {
		super();

		Student[] list = new Student[10];
		int[][] gradeArray = { { 2, 3, 4, 5, 6 }, { 10, 9, 10, 9, 10 }, { 10, 3, 4, 8, 9 }, { 2, 3, 4, 5, 6 },
				{ 9, 9, 9, 9, 9 }, { 9, 10, 10, 10, 10 }, { 10, 9, 8, 9, 9 }, { 10, 9, 9, 9, 9 }, { 7, 8, 6, 9, 9 },
				{ 9, 9, 9, 9, 9 } };

		String[] nameArray = { "Бендер О. И.", "Буданицкая Л.Э.", "Каренина А. А.", "Толстой Л.Э.", "Фромм Э. Э.",
				"Хайдеггер М. М.", "Чуковский К.И.", "Барто А. Л.", "Бёрнс Р.", "Фаньчжоу Я." };

		int[] groupNumberList = { 9, 3, 8, 12, 1, 4, 2, 5, 8, 7 };

		for (int i = 0; i < nameArray.length; i++) {
			list[i] = new Student(nameArray[i], groupNumberList[i], gradeArray[i]);
		}
		new List(list);
		this.list = list;

	}

	public List(Student[] list) {
		super();
		this.list = list;
	}

	// геттер

	public Student[] getList() {
		return list;
	}



	// toString(), equals(), hashCode()

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(list);
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
		List other = (List) obj;
		if (!Arrays.equals(list, other.list))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.getClass().getName() + "list=" + Arrays.toString(list) + "]";
	}

}
