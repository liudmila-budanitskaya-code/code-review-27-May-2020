/* 4. Programming with classes
 * 
      Простейшие классы и объекты.

10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- 
методы и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими
конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль.

Airline: пункт назначения, номер рейса, тип самолёта, время вылета, дни недели.
    Найти и вывести:
    a) список рейсов для заданного пункта назначения;
    b) список рейсов для заданного дня недели;
    c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 * 
 */

package by.student.budanitskaya.simple_classes_and_objects.task10;

import java.time.*;

public class Airline {

	private String destination;
	private int flightNumber;
	private String airBusType;
	private LocalTime departureTime;
	private DayOfWeek dayOfWeek;

	public Airline() {
		super();
		String defaultDestination = "Tokyo";
		int defaultFlightNumber = 38761874;
		String defaultAirBusType = "Boeing";
		LocalTime defaultDepartureTime = LocalTime.of(1, 20);
		DayOfWeek defaultDefaultDayOfWeek = DayOfWeek.WEDNESDAY;
		this.destination = defaultDestination;
		this.flightNumber = defaultFlightNumber;
		this.airBusType = defaultAirBusType;
		this.departureTime = defaultDepartureTime;
		this.dayOfWeek = defaultDefaultDayOfWeek;

		new Airline(defaultDestination, defaultFlightNumber, defaultAirBusType, defaultDepartureTime,
				defaultDefaultDayOfWeek);
	}

	public Airline(String destination, int flightNumber, String airBusType, LocalTime departureTime,
			DayOfWeek dayOfWeek) {
		super();
		this.destination = destination;
		this.flightNumber = flightNumber;
		this.airBusType = airBusType;
		this.departureTime = departureTime;
		this.dayOfWeek = dayOfWeek;
	}

	// геттеры и сеттеры

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getAirBusType() {
		return airBusType;
	}

	public void setAirBusType(String airBusType) {
		this.airBusType = airBusType;
	}

	public LocalTime getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(LocalTime departureTime) {
		this.departureTime = departureTime;
	}

	public DayOfWeek getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(DayOfWeek dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	@Override
	public String toString() {
		return this.getClass().getName() + "destination=" + destination + ", flightNumber=" + flightNumber
				+ ", airBusType=" + airBusType + ", departureTime=" + departureTime + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((airBusType == null) ? 0 : airBusType.hashCode());
		result = prime * result + ((departureTime == null) ? 0 : departureTime.hashCode());
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + flightNumber;
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
		Airline other = (Airline) obj;
		if (airBusType == null) {
			if (other.airBusType != null)
				return false;
		} else if (!airBusType.equals(other.airBusType))
			return false;
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
		if (flightNumber != other.flightNumber)
			return false;
		return true;
	}

}
