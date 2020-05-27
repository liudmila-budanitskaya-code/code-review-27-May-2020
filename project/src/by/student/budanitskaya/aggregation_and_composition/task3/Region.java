/* 4. Programming with classes
 *    Агрегация и композиция
 * 
 * 3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: 
 * вывести на консоль столицу, количество областей, площадь, областные центры.* 
 * 
 */

package by.student.budanitskaya.aggregation_and_composition.task3;

public class Region extends AdministrativeEntity {
	
	private City centralCity;
	
	public Region() {
		super();
	}

	public Region(String name) {
		super(name);
	}

	public City getCentralCity() {
		return centralCity;
	}

	public void setCentralCity(City centralCity) {
		this.centralCity = centralCity;
	}

}
