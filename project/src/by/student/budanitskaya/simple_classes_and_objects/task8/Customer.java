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

public class Customer {

	private int id;
	private String surname;
	private String name;
	private String patronymic;
	private String address;
	private int creditCardNo;
	private int bankAccountNo;

	// далее идут конструкторы

	public Customer() {
		super();

		int defaultId = 753;
		String defaultSurname = "Алёшина";
		String defaultName = "Ольга";
		String defaultPatronymic = "Евгеньевна";
		String defaultAddress = "ул. Цветочная, д.9, кв.11";
		int defaultCreditCardNo = 1111111;
		int defaultBankAccountNo = 311111111;

		this.id = defaultId;
		this.surname = defaultSurname;
		this.name = defaultName;
		this.patronymic = defaultPatronymic;
		this.address = defaultAddress;
		this.creditCardNo = defaultCreditCardNo;
		this.bankAccountNo = defaultBankAccountNo;

		new Customer(defaultId, defaultSurname, defaultName, defaultPatronymic, defaultAddress, defaultCreditCardNo,
				defaultBankAccountNo);
	}

	public Customer(int id, String surname, String name, String patronymic, String address, int creditCardNo,
			int bankAccountNo) {
		super();
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.address = address;
		this.creditCardNo = creditCardNo;
		this.bankAccountNo = bankAccountNo;
	}

	// toString(), equals(), hashCode()

	@Override
	public String toString() {
		return "Customer [id=" + id + ", surname=" + surname + ", name=" + name + ", patronymic=" + patronymic
				+ ", address=" + address + ", creditCardNo=" + creditCardNo + ", bankAccountNo=" + bankAccountNo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + bankAccountNo;
		result = prime * result + creditCardNo;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((patronymic == null) ? 0 : patronymic.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
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
		Customer other = (Customer) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (bankAccountNo != other.bankAccountNo)
			return false;
		if (creditCardNo != other.creditCardNo)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (patronymic == null) {
			if (other.patronymic != null)
				return false;
		} else if (!patronymic.equals(other.patronymic))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

	// далее идут геттеры

	public int getId() {
		return id;
	}

	public String getSurname() {
		return surname;
	}

	public String getName() {
		return name;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public String getAddress() {
		return address;
	}

	public int getCreditCardNo() {
		return creditCardNo;
	}

	public int getBankAccountNo() {
		return bankAccountNo;
	}

	// завершается блок геттеров

}
