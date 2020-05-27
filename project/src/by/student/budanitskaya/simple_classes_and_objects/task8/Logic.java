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

public class Logic {

	// метод, возвращающий список покупателей в алфавитном порядке

	public static Customer[] sortBySurname(Customer[] list) {

		for (int i = 0; i < list.length; i++) {
			for (int j = i + 1; j < list.length; j++) {

				boolean sorted = false;
				if (list[i].getSurname().toLowerCase().charAt(0) > list[j].getSurname().toLowerCase().charAt(0)) {
					Customer temp = list[i];
					list[i] = list[j];
					list[j] = temp;
				} else if (list[i].getSurname().toLowerCase().charAt(0) == list[j].getSurname().toLowerCase()
						.charAt(0)) {

					int k = 0;
					while (k < Math.min(list[i].getSurname().length(), list[j].getSurname().length()) && list[i]
							.getSurname().toLowerCase().charAt(k) == list[j].getSurname().toLowerCase().charAt(k)) {
						k++;
					}
					if (k < Math.min(list[i].getSurname().length(), list[j].getSurname().length()) && sorted == false
							&& list[i].getSurname().toLowerCase().charAt(k) > list[j].getSurname().toLowerCase()
									.charAt(k)) {
						Customer temp = list[i];
						list[i] = list[j];
						list[j] = temp;
						sorted = true;
					}
				}

			}
		}

		return list;

	}

	// метод, возвращающий список покупателей, у которых номер кредитной карточки
	// находится в заданном интервале

	public static String listByCreditCardNo(Customer[] list) {
		String return_string = "";
		String delimiter = "\n";

		for (int i = 0; i < list.length; i++) {
			if (list[i].getCreditCardNo() < 3000000 && list[i].getCreditCardNo() > 2000000) {
				return_string = return_string.concat(delimiter.concat(list[i].getSurname() + " " + list[i].getName()
						+ " " + list[i].getPatronymic() + " " + list[i].getCreditCardNo()));
			}
		}
		return return_string;
	}

}
