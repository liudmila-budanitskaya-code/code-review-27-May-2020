/*4. Programming with classes
 * 
Простейшие классы и объекты.

8. Создайте класс Customer, пецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString().
Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами. Задать критерии выбора данных
и вывести эти данные на консоль.

     Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счёта.
     Найти и вывести:
     a) список покупателей в алфавитном порядке;
     b) список покупателей, у которых номер кредитной карточки находится в заданном интервале.

 */

package by.student.budanitskaya.simple_classes_and_objects.task8;

public class View {

	public static void printSortedBySurname(Customer[] list) {
		System.out.println("ФИО клиентов в алфавитном порядке (по фамилиям)");

		list = Logic.sortBySurname(list);

		for (Customer x : list) {
			System.out.println(x.getSurname() + " " + x.getName() + " " + x.getPatronymic());
		}
	}

	public static void printListedByCreditCardNo(Customer[] list) {
		String return_string;
		System.out.println("ФИО клиентов, номера кредиток которых лежат в диапазоне от 2000000 до 3000000:");
		return_string = Logic.listByCreditCardNo(list);
		System.out.println(return_string);
	}

}
