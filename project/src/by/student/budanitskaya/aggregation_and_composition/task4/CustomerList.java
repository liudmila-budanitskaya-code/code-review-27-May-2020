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

package by.student.budanitskaya.aggregation_and_composition.task4;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomerList {

	private ArrayList<Customer> customerList;

	public CustomerList() {
		super();

		ArrayList<Customer> customerList = new ArrayList<Customer>();

		customerList.add(new Customer(234845353, "Назаров", "Пётр", "Павлович", "ул. Асаналиева, д.2, кв. 6",
				new AccountList()));
		customerList.add(new Customer(794128148, "Сидорова", "Светлана", "Эдуардовна", "ул. Рафиева, д.9, кв. 66",
				new AccountList()));
		customerList.add(new Customer(343943738, "Иркутов", "Александр", "Александрович",
				"пр. Независимости, д.30, кв.21", new AccountList()));
		customerList.add(new Customer(543412148, "Фридрих", "Мария", "Ивановна", "ул. Могилёвская, д.9, кв. 88",
				new AccountList()));
		customerList.add(new Customer(116000000, "Девятов", "Игорь", "Иванович", "ул. Московская, д.85, кв. 1",
				new AccountList()));

		this.customerList = customerList;
	}

	public CustomerList(ArrayList<Customer> customerList) {
		super();
		this.customerList = customerList;
	}

	// геттеры и сеттеры для полей экземпляра класса

	public ArrayList<Customer> getCustomerList() {
		return customerList;
	}

	public void setCustomerList(ArrayList<Customer> customerList) {
		this.customerList = customerList;
	}

	@Override
	public String toString() {
		return this.getClass().getName() + "customerList=" + customerList + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customerList == null) ? 0 : customerList.hashCode());
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
		CustomerList other = (CustomerList) obj;
		if (customerList == null) {
			if (other.customerList != null)
				return false;
		} else if (!customerList.equals(other.customerList))
			return false;
		return true;
	}

}
