/* 4. Programming with classes
 *    Агрегация и композиция
 * 
 * 3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: 
 * вывести на консоль столицу, количество областей, площадь, областные центры.* 
 * 
 */

package by.student.budanitskaya.aggregation_and_composition.task3;

public abstract class AdministrativeEntity {

	// что общего для всех этих классов

	private int area;
	private String name;

	// конструктор совершенно без параметров

	public AdministrativeEntity() {
		super();
	}

	// конструкторы с параметрами - полями экземпляра класса

	public AdministrativeEntity(int area, String name) {
		super();
		this.area = area;
		this.name = name;
	}

	public AdministrativeEntity(String name) {
		super();
		this.name = name;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
