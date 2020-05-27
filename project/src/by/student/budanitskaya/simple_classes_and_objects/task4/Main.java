/*4. Programming with classes
 * 
Простейшие классы и объекты.

4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. Создайте массив из пяти элементов
типа Train, добавьте возможность сортировки элементов массива по номерам поездов. Добавьте возможность вывода информации о поезде, номер 
которого введен пользователем. Добавьте возможность сортировки массива по пункту назначения, причём поезда с одинаковыми пунктами 
назначения должны быть упорядочены по времени отправления.

 */

package by.student.budanitskaya.simple_classes_and_objects.task4;

public class Main {

	public static void main(String[] args) {

		TrainList trainlist = new TrainList();
		
		// по номеру

		View.printSortedByNumber(trainlist);
		
		// по номеру, введенному пользователем
		
		View.printUserDefinedInfo(trainlist.getTrainList());
		
		// по пункту назначения
		
		View.printSortedByDestination(trainlist.getTrainList());

	}
}
