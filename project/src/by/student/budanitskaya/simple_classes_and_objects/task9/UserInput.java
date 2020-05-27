/*4. Programming with classes
 * 
Простейшие классы и объекты.

9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get-методы и метод
toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами.
Задать критерии выбора данных и вывести эти данные консоль.

Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплёта.

Найти и вывести:
a) список книг заданного автора
b) список книг, выпущенных заданным издательством
c) список книг, выпущенных после заданного года

 */

package by.student.budanitskaya.simple_classes_and_objects.task9;

import java.util.Locale;
import java.util.Scanner;

public class UserInput {

	// метод, принимающий и обрабатывающий пользовательский ввод (здесь строка)

	public static String checkUserInput(String inputRequest) {

		System.out.println(inputRequest);

		Scanner scan = new Scanner(System.in);

		return scan.nextLine();
	}

	// метод для валидации пользовательского ввода

	public static int checkYearPublished(String variableName) {

		System.out.println(variableName);

		Scanner scan = new Scanner(System.in).useLocale(Locale.US);

		while (!scan.hasNextInt()) {
			System.out.print(variableName);
			scan.next();
		}
		
		int next_Int = scan.nextInt();
		if (next_Int > 1500 || next_Int < 2020) {
			return next_Int;
		} else {
			return 1990;
		}
	}

}
