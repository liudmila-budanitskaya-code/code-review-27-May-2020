/* 4. Programming with classes
 *    Агрегация и композиция
 * 4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счёта.
 * Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам,
 * имеющим отрицательный и положительный балансы отдельно.
 *
 */

package by.student.budanitskaya.aggregation_and_composition.task4;

public class Customer {

	private int id;
	private String surName;
	private String firstName;
	private String patronymic;
	private String address;
	private AccountList accountList = new AccountList();

	// делаю один дефолтный конструктор для инициализации по умолчанию

	public Customer() {
		super();

	}

	public Customer(int id, String surName, String firstName, String patronymic, String address,
			AccountList accountList) {
		super();
		this.id = id;
		this.surName = surName;
		this.firstName = firstName;
		this.patronymic = patronymic;
		this.address = address;
		this.accountList = accountList;
	}

	public int getId() {
		return id;
	}

	public String getSurName() {
		return surName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public String getAddress() {
		return address;
	}

	public AccountList getAccountList() {
		return accountList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountList == null) ? 0 : accountList.hashCode());
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + id;
		result = prime * result + ((patronymic == null) ? 0 : patronymic.hashCode());
		result = prime * result + ((surName == null) ? 0 : surName.hashCode());
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
		if (accountList == null) {
			if (other.accountList != null)
				return false;
		} else if (!accountList.equals(other.accountList))
			return false;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id != other.id)
			return false;
		if (patronymic == null) {
			if (other.patronymic != null)
				return false;
		} else if (!patronymic.equals(other.patronymic))
			return false;
		if (surName == null) {
			if (other.surName != null)
				return false;
		} else if (!surName.equals(other.surName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.getClass().getName() + "id=" + id + ", surName=" + surName + ", firstName=" + firstName
				+ ", patronymic=" + patronymic + ", address=" + address + ", accountList=" + accountList + "]";
	}

}
