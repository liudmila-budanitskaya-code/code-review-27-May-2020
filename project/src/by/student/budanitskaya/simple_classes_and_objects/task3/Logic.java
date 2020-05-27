/*4. Programming with classes
 * 
Простейшие классы и объекты.

3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из 5 элементов). 
Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и номеров групп студентов, имеющих
оценки, равные только 9 или 10.

 */

package by.student.budanitskaya.simple_classes_and_objects.task3;

public class Logic {
	
	public static Student[] selectStudentInfo(Student[] list) {

		for (int i = 0; i < list.length; i++) {
			int counter = 0;
			
			for (int j = 0; j < list[i].getGrades().length; j++) {
				if (list[i].getGrades()[j] == 9 || list[i].getGrades()[j] == 10) {
					counter++;
					
				}
			}
			if (counter != 5) {
				list[i] = null;
			}
		}
		return list;
	}

}
