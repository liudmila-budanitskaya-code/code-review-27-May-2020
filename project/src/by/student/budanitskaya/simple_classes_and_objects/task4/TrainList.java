/*4. Programming with classes
 * 
Простейшие классы и объекты.

4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. Создайте массив из пяти элементов
типа Train, добавьте возможность сортировки элементов массива по номерам поездов. Добавьте возможность вывода информации о поезде, номер 
которого введен пользователем. Добавьте возможность сортировки массива по пункту назначения, причём поезда с одинаковыми пунктами 
назначения должны быть упорядочены по времени отправления.

 */

package by.student.budanitskaya.simple_classes_and_objects.task4;

import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class TrainList {

	private int numOfTrains;
	private Train[] trainList = new Train[numOfTrains];

	// конструкторы и геттеры

	public int getNumOfTrains() {
		return numOfTrains;
	}

	public Train[] getTrainList() {
		return trainList;
	}

	public TrainList() {
		super();
		int numOfTrains = 5;
		Train[] trainList = new Train[numOfTrains];
		Date date1 = new Date(1212121212121L);
		Date date2 = new Date(1234234234234L);
		Date date3 = new Date(1432234234432L);
		Date date4 = new Date(1435464534545L);
		Date date5 = new Date(1435434344444L);

		trainList[0] = new Train("Брест", 8473672, date1);
		trainList[1] = new Train("Минск", 1754555, date2);
		trainList[2] = new Train("Минск", 3423525, date3);
		trainList[3] = new Train("Москва", 3490025, date5);
		trainList[4] = new Train("Москва", 3493625, date4);

		new TrainList(numOfTrains, trainList);

		this.numOfTrains = numOfTrains;
		this.trainList = trainList;
	}

	public TrainList(int numOfTrains, Train[] trainList) {
		super();

		this.numOfTrains = numOfTrains;
		this.trainList = trainList;
	}

	// переопределение методов toString(), hashCode и equals()

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numOfTrains;
		result = prime * result + Arrays.hashCode(trainList);
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
		TrainList other = (TrainList) obj;
		if (numOfTrains != other.numOfTrains)
			return false;
		if (!Arrays.equals(trainList, other.trainList))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.getClass().getName() + "numOfTrains=" + numOfTrains + ", trainList=" + Arrays.toString(trainList)
				+ "]";
	}

}
