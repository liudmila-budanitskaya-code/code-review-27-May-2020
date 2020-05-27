/*4. Programming with classes
 * 
Простейшие классы и объекты.

4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. Создайте массив из пяти элементов
типа Train, добавьте возможность сортировки элементов массива по номерам поездов. Добавьте возможность вывода информации о поезде, номер 
которого введен пользователем. Добавьте возможность сортировки массива по пункту назначения, причём поезда с одинаковыми пунктами 
назначения должны быть упорядочены по времени отправления.

 */

package by.student.budanitskaya.simple_classes_and_objects.task4;

public class View {

	// вывод на печать поездов, отсортированных по номеру

	public static void printSortedByNumber(TrainList trainlist) {

		System.out.println("Поезда, отсортированные по номеру:");

		trainlist = Logic.sortByNumber(trainlist);
		for (int i = 0; i < trainlist.getTrainList().length; i++) {
			System.out.println("Пункт назначения:" + trainlist.getTrainList()[i].getDestination() + " Номер поезда: "
					+ trainlist.getTrainList()[i].getTrainNumber() + " Время отправления:"
					+ trainlist.getTrainList()[i].getDepartureTime());
		}
	}

	// вывод на печать информации о поезде, номер которого введен пользователем

	public static void printUserDefinedInfo(Train[] array) {

		System.out.println("Сейчас мы выведем информацию о поезде, номер которого введёте Вы.");
		System.out.println(Logic.returnTrainInfo(array));

	}

	// вывод на печать списка поездов, отсортированного по пункту назначения

	public static void printSortedByDestination(Train[] array) {

		System.out.println(
				"Информация о поездах, отсортированная по пункту назначения, причём поезда с одинаковым пунктом назначения отсортированы по времени отправления");
		array = Logic.sortByDestination(array);

		for (int i = 0; i < array.length; i++) {
			System.out.println("Пункт назначения:" + array[i].getDestination() + " Номер поезда: "
					+ array[i].getTrainNumber() + " Время отправления:" + array[i].getDepartureTime());
		}
	}

}
