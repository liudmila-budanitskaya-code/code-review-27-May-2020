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

import java.util.Arrays;

public class CustomerList {

	private Customer[] customerList;
	private int customerNumber;

	public CustomerList() {
		super();

		int defaultCustomerNumber = 5;

		Customer[] customerList = new Customer[defaultCustomerNumber];

		customerList[0] = new Customer(936, "Назаров", "Пётр", "Павлович", "ул. Асаналиева, д.2, кв. 6", 2345353,
				354654323);
		customerList[1] = new Customer(794, "Иркутская", "Светлана", "Эдуардовна", "ул. Рафиева, д.9, кв. 66", 2435243,
				312112223);
		customerList[2] = new Customer(854, "Иркутов", "Александр", "Александрович", "пр. Независимости, д.30, кв.21",
				2464993, 374780683);
		customerList[3] = new Customer(198, "Фридрих", "Мария", "Ивановна", "ул. Могилёвская, д.9, кв. 88", 8343924,
				314244565);
		customerList[4] = new Customer(116, "Девятов", "Игорь", "Иванович", "ул. Московская, д.85, кв. 1", 8789009,
				317866535);

		new CustomerList(customerList, defaultCustomerNumber);

		this.customerList = customerList;
		this.customerNumber = defaultCustomerNumber;
	}

	public CustomerList(Customer[] customerList, int customerNumber) {
		super();
		this.customerList = customerList;
		this.customerNumber = customerNumber;
	}

	// геттеры и сеттеры для полей экземпляра класса
	public Customer[] getCustomerList() {
		return customerList;
	}

	public void setCustomerList(Customer[] customerList) {
		this.customerList = customerList;
	}

	public int getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}

	@Override
	public String toString() {
		return this.getClass().getName() + "customerList=" + Arrays.toString(customerList) + ", customerNumber="
				+ customerNumber + "]";
	}

}
