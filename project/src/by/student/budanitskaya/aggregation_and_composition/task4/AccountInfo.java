/* 4. Programming with classes
 *    Агрегация и композиция
 * 4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счёта.
 * Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам,
 * имеющим отрицательный и положительный балансы отдельно.
 *
 */

package by.student.budanitskaya.aggregation_and_composition.task4;

import java.util.ArrayList;
import java.util.Arrays;

public class AccountInfo {

	// поиск счёта по номеру

	public static ArrayList<Account> selectByNumber(int accountNo, AccountList accountList) {

		ArrayList<Account> accList = new ArrayList<Account>();

		// метод возвращает коллекцию ArrayList

		for (Account account : accountList.getAccountList()) {
			if (account.getAccNumber() == accountNo) {
				accList.add(account);
			}
		}
		return accList;

	}

	// сортировка счетов данного клиента по возрастанию номера

	public static ArrayList<Account> sortByNumber(ArrayList<Account> accountList) {

		Account[] accs = new Account[accountList.size()];

		// теперь мы эти аккаунты добавим

		for (int i = 0; i < accountList.size(); i++) {
			accs[i] = accountList.get(i);
		}

		// потом мы их отсортируем

		boolean sorted = false;
		Account temp;
		while (!sorted) {
			sorted = true;
			for (int i = 0; i < accs.length - 1; i++) {
				if (accs[i].getAccNumber() > accs[i + 1].getAccNumber()) {
					temp = accs[i];
					accs[i] = accs[i + 1];
					accs[i + 1] = temp;
					sorted = false;
				}
			}
		}
		// потом мы преобразуем обратно и выведем

		ArrayList<Account> new_list = new ArrayList<Account>(Arrays.asList(accs));

		return new_list;

	}

	// метод для вычисления общей суммы по счетам

	public static int sumOfAccounts(ArrayList<Account> accountList) {

		int sum = 0;

		for (Account a : accountList) {
			sum += a.getAmount();
		}

		return sum;
	}

	// вычисление суммы по счетам, имеющим положительный баланс

	public static int sumOfPositiveAccounts(ArrayList<Account> accountList) {

		int sum = 0;

		for (Account a : accountList) {
			if (a.getAmount() > 0) {
				sum += a.getAmount();
			}
		}

		return sum;

	}

	// вычисление суммы по счетам, имеющим положительный баланс

	public static int sumOfNegativeAccounts(ArrayList<Account> accountList) {

		int sum = 0;

		for (Account a : accountList) {
			if (a.getAmount() < 0) {
				sum += a.getAmount();
			}
		}

		return sum;

	}

}
