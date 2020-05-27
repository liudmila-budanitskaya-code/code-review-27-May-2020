/*
 * 4. Programming with classes
 *    Простейшие классы и объекты.

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

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.ArrayList;

public class AirlineList {

	private ArrayList<Airline> flightList = new ArrayList<Airline>();

	public ArrayList<Airline> getFlightList() {
		return flightList;
	}

	public void setFlightList(ArrayList<Airline> flightList) {
		this.flightList = flightList;
	}

	public AirlineList() {
		super();

		ArrayList<Airline> flightList = new ArrayList<Airline>();

		LocalTime time1 = LocalTime.of(1, 1);
		LocalTime time2 = LocalTime.of(6, 12);
		LocalTime time3 = LocalTime.of(8, 18);
		LocalTime time4 = LocalTime.of(17, 8);
		LocalTime time5 = LocalTime.of(2, 2);

		flightList.add(new Airline("Moscow", 74539201, "AirBus", time1, DayOfWeek.SUNDAY));
		flightList.add(new Airline("Baku", 24563201, "Tu-154", time2, DayOfWeek.TUESDAY));
		flightList.add(new Airline("Bishkek", 72938471, "Eclipse-500", time3, DayOfWeek.TUESDAY));
		flightList.add(new Airline("Ashhabad", 27539201, "Tu-134", time4, DayOfWeek.TUESDAY));
		flightList.add(new Airline("Bangkok", 11119201, "Boeing-747", time5, DayOfWeek.FRIDAY));

		this.flightList = flightList;
		new AirlineList(flightList);
	}

	public AirlineList(ArrayList<Airline> flightList) {
		super();
		this.flightList = flightList;
	}

	@Override
	public String toString() {
		return this.getClass().getName() + "flightList=" + flightList + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((flightList == null) ? 0 : flightList.hashCode());
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
		AirlineList other = (AirlineList) obj;
		if (flightList == null) {
			if (other.flightList != null)
				return false;
		} else if (!flightList.equals(other.flightList))
			return false;
		return true;
	}

}
