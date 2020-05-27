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

import java.util.ArrayList;

public class Logic {

	// рейсы для заданного пункта назначения

	public static ArrayList<Airline> returnFlightsByDestination(ArrayList<Airline> flightList) {

		ArrayList<Airline> new_flightList = new ArrayList<Airline>();

		for (Airline flight : flightList) {
			if (flight.getDestination().equals("Moscow")) {
				new_flightList.add(flight);
			}
		}

		return new_flightList;

	}

	// рейсы для заданного дня недели

	public static ArrayList<Airline> returnFlightsByWeekDay(ArrayList<Airline> flightList) {

		ArrayList<Airline> new_flightList = new ArrayList<Airline>();
		for (Airline flight : flightList) {
			if (flight.getDayOfWeek().getValue() == 2) {
				new_flightList.add(flight);
			}
		}

		return new_flightList;

	}

}
