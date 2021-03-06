/*4. Programming with classes
 * 
Простейшие классы и объекты.

3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из 5 элементов). 
Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и номеров групп студентов, имеющих
оценки, равные только 9 или 10.

 */

package by.student.budanitskaya.simple_classes_and_objects.task3;

public class View {

	public static void printInfo(Student [] list) {
		
		list = Logic.selectStudentInfo(list);

		for (int i = 0; i < list.length; i++) {
			if (list[i] != null) {
				System.out.println("");
				System.out.printf("%15s%15s", list[i].getStudentName(), list[i].getGroupNumber());
			}

		}
	}
}
