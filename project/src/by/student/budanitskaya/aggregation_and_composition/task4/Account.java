/* 4. Programming with classes
 *    Агрегация и композиция
 * 4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счёта.
 * Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам,
 * имеющим отрицательный и положительный балансы отдельно.
 *
 */

package by.student.budanitskaya.aggregation_and_composition.task4;

import java.util.Currency;
import java.util.Locale;

public class Account {

	private int accNumber;
	private int ownerId;
	private Locale locale;
	private Currency currency;
	private int amount;
	private boolean isBlockedStatus;

	public Account() {
		super();
		this.locale = Locale.US;
		this.currency = Currency.getInstance(locale);
		new Account(this.accNumber);

	}

	public Account(int accNumber) {
		this.accNumber = accNumber;
		this.locale = Locale.US;
		this.amount = 0;
		this.isBlockedStatus = false;
		this.currency = Currency.getInstance(locale);

	}

	public Account(Locale locale, int amount, int ownerId, boolean isBlockedStatus, int accNumber) {
		super();
		this.locale = locale;
		this.amount = amount;
		this.ownerId = ownerId;
		this.isBlockedStatus = isBlockedStatus;
		this.accNumber = accNumber;
		this.currency = Currency.getInstance(locale);
	}

	public int getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}

	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}

	public Locale getLocale() {
		return locale;
	}

	public void setLocale(Locale locale) {
		this.locale = locale;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public boolean isBlockedStatus() {
		return isBlockedStatus;
	}

	public void setBlockedStatus(boolean isBlockedStatus) {
		this.isBlockedStatus = isBlockedStatus;
	}

	@Override
	public String toString() {
		return this.getClass().getName() + "accNumber=" + accNumber + ", ownerId=" + ownerId + ", locale=" + locale
				+ ", currency=" + currency + ", amount=" + amount + ", isBlockedStatus=" + isBlockedStatus + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accNumber;
		result = prime * result + amount;
		result = prime * result + ((currency == null) ? 0 : currency.hashCode());
		result = prime * result + (isBlockedStatus ? 1231 : 1237);
		result = prime * result + ((locale == null) ? 0 : locale.hashCode());
		result = prime * result + ownerId;
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
		Account other = (Account) obj;
		if (accNumber != other.accNumber)
			return false;
		if (amount != other.amount)
			return false;
		if (currency == null) {
			if (other.currency != null)
				return false;
		} else if (!currency.equals(other.currency))
			return false;
		if (isBlockedStatus != other.isBlockedStatus)
			return false;
		if (locale == null) {
			if (other.locale != null)
				return false;
		} else if (!locale.equals(other.locale))
			return false;
		if (ownerId != other.ownerId)
			return false;
		return true;
	}

}
