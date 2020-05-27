/* 4. Programming with classes
 *    Агрегация и композиция
 * 4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счёта.
 * Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам,
 * имеющим отрицательный и положительный балансы отдельно.
 *
 */

package by.student.budanitskaya.aggregation_and_composition.task4;

public class Main {

	public static void main(String[] args) {

		AccountList accountList = new AccountList();
		// счёт с заданным номером

		View.printSelectedByNumber(4329482, accountList);
		// счета, отсортированные в порядке возрастания
		View.printSortedByNumber(accountList.getAccountList());

		// сумма, вычисленная отдельно по всем счетам, счетам с положительным и
		// отрицательным балансом

		View.printSumOfAllAccounts(accountList.getAccountList());

		View.printSumOfNegativeAccounts(accountList.getAccountList());

		View.printSumOfPositiveAccounts(accountList.getAccountList());
	}

}
