/*4. Programming with classes
 * 
Простейшие классы и объекты.

6. Составьте описание класса для представления времени. Предусмотрите возможности установки времени и изменения его 
отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае недопустимых значений полей
поле устанавливается в значение 0. Создать методы изменения времени на заданное количество часов, минут и секунд.

 */

package by.student.budanitskaya.simple_classes_and_objects.task6;

public class Main {

	public static void main(String[] args) {

		Time time = new Time(15, 0, 3);

		System.out.println(time.getHours());

		System.out.println(time.changeHours(11));
	}

}