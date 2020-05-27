/*4. Programming with classes
 * 
Простейшие классы и объекты.

6. Составьте описание класса для представления времени. Предусмотрите возможности установки времени и изменения его 
отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае недопустимых значений полей
поле устанавливается в значение 0. Создать методы изменения времени на заданное количество часов, минут и секунд.

 */

package by.student.budanitskaya.simple_classes_and_objects.task6;

public class Time {

	// 24-часовой формат времени

	private int hours;
	private int minutes;
	private int seconds;

	public Time() {
		super();
		int defaultHours = 11;
		int defaultMinutes = 1;
		int defaultSeconds = 1;

		new Time(defaultHours, defaultMinutes, defaultSeconds);

		this.hours = defaultHours;
		this.minutes = defaultMinutes;
		this.seconds = defaultSeconds;
	}

	public Time(int hours, int minutes, int seconds) {
		super();

		// проверяем допустимость количества часов, переданного в качестве аргумента в
		// конструктор
		if (hours < 0 || hours > 24) {
			this.hours = 11;
		} else if (hours == 24) {
			this.hours = 0;
		} else {
			this.hours = hours;
		}

		// проверяем допустимость количества минут, переданного в качестве аргумента в
		// конструктор

		if (minutes < 0 || minutes > 60) {
			this.minutes = 1;
		} else if (minutes == 60) {
			this.minutes = 0;
		} else {
			this.minutes = minutes;
		}

		// проверяем допустимость количества секунд, переданного в качестве аргумента в
		// конструктор

		if (seconds < 0 || seconds > 59) {
			this.seconds = 1;
		} else if (seconds == 60) {
			this.seconds = 0;
		} else {
			this.seconds = seconds;
		}

	}

	// блок геттеров

	public int getHours() {
		return hours;
	}

	public int getMinutes() {
		return minutes;
	}

	public int getSeconds() {
		return seconds;
	}

	// переопределение методов toString(), equals() и hashCode()

	@Override
	public String toString() {
		return "Time [hours=" + hours + ", minutes=" + minutes + ", seconds=" + seconds + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hours;
		result = prime * result + minutes;
		result = prime * result + seconds;
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
		Time other = (Time) obj;
		if (hours != other.hours)
			return false;
		if (minutes != other.minutes)
			return false;
		if (seconds != other.seconds)
			return false;
		return true;
	}
	
	// методы для изменения времени на заданное количество минут, часов, секунд.

	public int changeHours(int hourCount) {
		this.hours = (this.hours + hourCount) % 24;
		return this.hours;
	}

	public int changeMinutes(int minuteCount) {
		if (minuteCount >= 60 || minuteCount <= -60) {
			System.out.println("Количество минут будет изменено на остаток от деления");
		}
		this.minutes = (this.minutes + minuteCount) % 60;
		return this.minutes;
	}

	public int changeSeconds(int secondCount) {
		if (secondCount >= 60 || secondCount <= -60) {
			System.out.println("Количество секунд будет изменено на остаток от деления");
		}
		this.seconds += (this.seconds + secondCount) % 60;
		return this.seconds;
	}

}
