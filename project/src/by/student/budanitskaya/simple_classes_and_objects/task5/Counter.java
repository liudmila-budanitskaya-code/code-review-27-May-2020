package by.student.budanitskaya.simple_classes_and_objects.task5;

public class Counter {

	private int currentState;
	private int maxValue;
	private int minValue;

	public Counter() {
		int defaultState = 5;
		int defaultMin = 0;
		int defaultMax = 10;
		this.currentState = defaultState;
		this.minValue = defaultMin;
		this.maxValue = defaultMax;
	}

	// инициализация счётчика произвольными значениями

	public Counter(int x, int minValue, int maxValue) {
		// Проверка границ
		int T = Math.min(minValue, maxValue);
		if (T != minValue) {
			maxValue = minValue;
			minValue = T;
		}
		// Проверка х (попадание в диапазон)
		if (x < minValue || x > maxValue) {
			this.currentState = minValue;
		} else {
			this.currentState = x;
		}
		this.minValue = minValue;
		this.maxValue = maxValue;
	}

	// геттеры

	public int getCurrentState() {
		return currentState;
	}

	public int getMaxValue() {
		return maxValue;
	}

	public int getMinValue() {
		return minValue;
	}

	// завершается блок геттеров

	// переопределение методов equals(), hashCode(), toString()

	@Override
	public String toString() {
		return this.getClass().getName() + "currentState=" + currentState + ", maxValue=" + maxValue + ", minValue=" + minValue + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + currentState;
		result = prime * result + maxValue;
		result = prime * result + minValue;
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
		Counter other = (Counter) obj;
		if (currentState != other.currentState)
			return false;
		if (maxValue != other.maxValue)
			return false;
		if (minValue != other.minValue)
			return false;
		return true;
	}

	// метод для увеличения показания счётчика на единицу

	public void incrementValue() {
		this.currentState++;
		// проверка выхода за границу диапозона
		if (this.currentState > this.maxValue) {
			this.currentState = this.maxValue;
		}
	}

	// метод для уменьшения показания счётчика на единицу
	public void decrementValue() {
		this.currentState--;
		// Проверка выхода за границу диапазона
		if (this.currentState < this.minValue) {
			this.currentState = this.minValue;
		}
	}

}

