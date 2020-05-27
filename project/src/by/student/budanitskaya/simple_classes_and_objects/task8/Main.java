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

public class Main {

	public static void main(String[] args) {

		CustomerList list = new CustomerList();
		Customer[] array = list.getCustomerList();

		View.printSortedBySurname(array);
		View.printListedByCreditCardNo(array);

	}

}
