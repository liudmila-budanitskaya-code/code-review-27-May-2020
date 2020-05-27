/*4. Programming with classes
 * 
Простейшие классы и объекты.

4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. Создайте массив из пяти элементов
типа Train, добавьте возможность сортировки элементов массива по номерам поездов. Добавьте возможность вывода информации о поезде, номер 
которого введен пользователем. Добавьте возможность сортировки массива по пункту назначения, причём поезда с одинаковыми пунктами 
назначения должны быть упорядочены по времени отправления.

 */

package by.student.budanitskaya.simple_classes_and_objects.task4;

import java.util.Date;

public class Train {

	private String destination;
	private int trainNumber;
	private Date departureTime;

	public Train() {
		super();

		String defaultDestination = "Москва";
		int defaultTrainNumber = 1334535;
		Date defaultDepartureTime = new Date(1212999999921L);

		this.destination = defaultDestination;
		this.trainNumber = defaultTrainNumber;
		this.departureTime = defaultDepartureTime;
		new Train(defaultDestination, defaultTrainNumber, defaultDepartureTime);

	}

	public Train(String destination, int trainNumber, Date departureTime) {
		super();
		this.destination = destination;
		this.trainNumber = trainNumber;
		this.departureTime = departureTime;
	}

	// геттеры

	public String getDestination() {
		return destination;
	}

	public int getTrainNumber() {
		return trainNumber;
	}

	public Date getDepartureTime() {
		return departureTime;
	}

	// переопределение методов toString(), hashCode и equals()

	@Override
	public String toString() {
		return "\nПункт назначения -  " + destination + ", номер поезда - " + trainNumber + ", время отправления - "
				+ departureTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((departureTime == null) ? 0 : departureTime.hashCode());
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + trainNumber;
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
		Train other = (Train) obj;
		if (departureTime == null) {
			if (other.departureTime != null)
				return false;
		} else if (!departureTime.equals(other.departureTime))
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (trainNumber != other.trainNumber)
			return false;
		return true;
	}

}
