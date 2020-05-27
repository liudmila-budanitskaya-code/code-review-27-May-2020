/*4. Programming with classes
 * 
Простейшие классы и объекты.

3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из 5 элементов). 
Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и номеров групп студентов, имеющих
оценки, равные только 9 или 10.

 */

package by.student.budanitskaya.simple_classes_and_objects.task3;

public class Main {

	public static void main(String[] args) {

		System.out.printf("%15s%15s", "Фамилия отличника", "Номер группы");

		List studentList = new List();

		View.printInfo(studentList.getList());

	}

}
