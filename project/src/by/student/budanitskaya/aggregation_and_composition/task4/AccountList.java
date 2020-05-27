/* 4. Programming with classes
 *    Агрегация и композиция
 * 4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счёта.
 * Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам,
 * имеющим отрицательный и положительный балансы отдельно.
 *
 */

package by.student.budanitskaya.aggregation_and_composition.task4;

import java.util.ArrayList;

import java.util.Locale;

public class AccountList {

	private ArrayList<Account> accountList = new ArrayList<Account>();

	// конструкторы

	public AccountList() {
		super();

		ArrayList<Account> accountList = new ArrayList<Account>();

		accountList.add(new Account(Locale.US, 1400, 234845353, false, 6594683));
		accountList.add(new Account(Locale.US, 10000, 234845353, false, 2454399));
		accountList.add(new Account(Locale.US, 102000, 794128148, false, 4329482));
		accountList.add(new Account(Locale.US, 105342, 794128148, false, 1028987));
		accountList.add(new Account(Locale.US, 167892, 343943738, false, 8687667));
		accountList.add(new Account(Locale.US, -8904, 543412148, false, 1010103));
		accountList.add(new Account(Locale.US, -6905, 116000000, true, 3433432));
		this.accountList = accountList;

	}

	public AccountList(ArrayList<Account> accountList) {
		super();
		this.accountList = accountList;
	}

	public ArrayList<Account> getAccountList() {
		return accountList;
	}

	public void setAccountList(ArrayList<Account> accountList) {
		this.accountList = accountList;
	}

	@Override
	public String toString() {
		return this.getClass().getName() + "accountList=" + accountList + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountList == null) ? 0 : accountList.hashCode());
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
		AccountList other = (AccountList) obj;
		if (accountList == null) {
			if (other.accountList != null)
				return false;
		} else if (!accountList.equals(other.accountList))
			return false;
		return true;
	}

}
