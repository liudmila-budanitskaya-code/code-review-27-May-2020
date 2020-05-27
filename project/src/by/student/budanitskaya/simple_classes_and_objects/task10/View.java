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

import java.time.LocalTime;
import java.util.ArrayList;

public class View {

	public static void printFlightsByDestination(ArrayList<Airline> flightList) {

		flightList = Logic.returnFlightsByDestination(flightList);

		System.out.println("Рейсы для заданного пункта назначения: ");

		if (flightList.size() > 0) {
			System.out.printf("%-20s%-20s%-20s%-20s%-20s%n", "Пункт назначения", "Номер рейса", "Тип самолёта",
					"Время вылета", "День недели вылета");
		}

		for (Airline flight : flightList) {
			System.out.printf("%-20s%-20s%-20s%-20s%-20s%n", flight.getDestination(), flight.getFlightNumber(),
					flight.getAirBusType(), flight.getDepartureTime(), flight.getDayOfWeek());
		}

	}

	// рейсы для заданного пункта назначения

	public static void printFlightsByWeekDay(ArrayList<Airline> flightList) {

		flightList = Logic.returnFlightsByWeekDay(flightList);

		System.out.println("\nРейсы для заданного дня недели: ");

		if (flightList.size() > 0) {
			System.out.printf("%-20s%-20s%-20s%-20s%-20s%n", "Пункт назначения", "Номер рейса", "Тип самолёта",
					"Время вылета", "День недели вылета");
		}

		for (Airline flight : flightList) {
			System.out.printf("%-20s%-20s%-20s%-20s%-20s%n", flight.getDestination(), flight.getFlightNumber(),
					flight.getAirBusType(), flight.getDepartureTime(), flight.getDayOfWeek());
		}

	}

	// список рейсов для заданного дня недели, время вылета для которых больше
	// заданного

	public static void printSelectedFlightsByWeekDay(ArrayList<Airline> flightList) {

		flightList = Logic.returnFlightsByWeekDay(flightList);

		System.out.println("\nРейсы для заданного дня недели, время вылета для которых больше заданного: ");

		if (flightList.size() > 0) {
			System.out.printf("%-20s%-20s%-20s%-20s%-20s%n", "Пункт назначения", "Номер рейса", "Тип самолёта",
					"Время вылета", "День недели вылета");
		}

		for (Airline flight : flightList) {
			if (flight.getDepartureTime().isAfter(LocalTime.of(6, 12))) {
				System.out.printf("%-20s%-20s%-20s%-20s%-20s%n", flight.getDestination(), flight.getFlightNumber(),
						flight.getAirBusType(), flight.getDepartureTime(), flight.getDayOfWeek());
			}
		}

	}

}