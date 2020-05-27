/*4. Programming with classes
 * 
Простейшие классы и объекты.

4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. Создайте массив из пяти элементов
типа Train, добавьте возможность сортировки элементов массива по номерам поездов. Добавьте возможность вывода информации о поезде, номер 
которого введен пользователем. Добавьте возможность сортировки массива по пункту назначения, причём поезда с одинаковыми пунктами 
назначения должны быть упорядочены по времени отправления.

 */

package by.student.budanitskaya.simple_classes_and_objects.task4;

import java.util.Locale;
import java.util.Scanner;

public class Logic {

	// сортировка по номерам поездов

	public static TrainList sortByNumber(TrainList trainList) {

		boolean sorted = false;
		Train temp;
		while (!sorted) {
			sorted = true;
			for (int i = 0; i < trainList.getTrainList().length - 1; i++) {
				if (trainList.getTrainList()[i].getTrainNumber() > trainList.getTrainList()[i + 1].getTrainNumber()) {
					temp = trainList.getTrainList()[i];
					trainList.getTrainList()[i] = trainList.getTrainList()[i + 1];
					trainList.getTrainList()[i + 1] = temp;
					sorted = false;
				}
			}
		}
		return trainList;
	}

	// метод, возвращающий информацию о поезде, номер которого введен с клавиатуры

	public static String returnTrainInfo(Train[] array) {

		System.out.println("Введите номер поезда");

		Scanner scan = new Scanner(System.in).useLocale(Locale.US);

		while (!scan.hasNextInt()) {
			System.out.println("Введите номер поезда");
			scan.next();
		}

		int y = scan.nextInt();
		Train train = new Train();

		int counter = 0;

		for (int i = 0; i < array.length; i++) {

			if (y == array[i].getTrainNumber()) {
				train = array[i];
				counter++;
			}

		}
		if (counter == 1) {
			return " Номер поезда:" + train.getTrainNumber() + " Пункт назначения: " + train.getDestination()
					+ " Время отправления:" + train.getDepartureTime();
		} else {
			return "К сожалению, поезда с таким номером не существует.";
		}
	}

	// сортировка массива по пункту назначения, причём поезда с одинаковым пунктом
	// назначения должны быть упорядочены по времени
	// отправления

	public static Train[] sortByDestination(Train[] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {

				boolean sorted = false;
				if (array[i].getDestination().equals(array[j].getDestination())) {
					if (array[i].getDepartureTime().after(array[j].getDepartureTime())) {
						Train temp = array[i];
						array[i] = array[j];
						array[j] = temp;
					}
				} else if (array[i].getDestination().toLowerCase().charAt(0) > array[j].getDestination().toLowerCase()
						.charAt(0)) {
					Train temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				} else if (array[i].getDestination().toLowerCase().charAt(0) == array[j].getDestination().toLowerCase()
						.charAt(0)) {

					int k = 0;
					while (k < Math.min(array[i].getDestination().length(), array[j].getDestination().length())
							&& array[i].getDestination().toLowerCase().charAt(k) == array[j].getDestination()
									.toLowerCase().charAt(k)) {
						k++;
					}
					if (k < Math.min(array[i].getDestination().length(), array[j].getDestination().length())
							&& sorted == false && array[i].getDestination().toLowerCase().charAt(k) > array[j]
									.getDestination().toLowerCase().charAt(k)) {
						Train temp = array[i];
						array[i] = array[j];
						array[j] = temp;
						sorted = true;
					}
				}

			}
		}

		return array;

	}

}
