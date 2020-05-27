/* 4. Programming with classes
 *    Агрегация и композиция
 * 4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счёта.
 * Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам,
 * имеющим отрицательный и положительный балансы отдельно.
 *
 */

package by.student.budanitskaya.aggregation_and_composition.task4;

public class TransactionManager {

	// в этом классе будут собраны все методы, связанные с проведением транзакций

	// зачислить денежные средства на счёт

	public void deposit(Account account, int deposit) {
		if (account.isBlockedStatus() == true) {
			account.setAmount(account.getAmount() + 0);
			System.out.println("Account is blocked. No transactions permitted.");
		} else {
			account.setAmount(account.getAmount() + deposit);
			System.out.println(deposit + " " + account.getCurrency().getCurrencyCode() + " deposited");
		}
	}

	// списать денежные средства со счёта

	public void withdraw(Account account, int w) {
		if (account.isBlockedStatus() == true) {
			account.setAmount(account.getAmount() - 0);
			System.out.println("Account is blocked. No transactions permitted.");
		} else if (w < account.getAmount()) {
			account.setAmount(account.getAmount() - w);
			System.out.println(w + " " + account.getCurrency().getCurrencyCode() + " withdrawn");
		} else {
			System.out.println("You can't withdraw  " + w + " " + account.getCurrency().getCurrencyCode() + "!");
		}

	}

	// блокировка счёта

	public void blockAccount(Account account) {
		account.setBlockedStatus(false);
	}

	// разблокировка счёта

	public void unBlockAccount(Account account) {
		account.setBlockedStatus(true);
	}

}
