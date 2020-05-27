/* 4. Programming with classes
 *    Агрегация и композиция
 * 
 * 3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: 
 * вывести на консоль столицу, количество областей, площадь, областные центры.* 
 * 
 */

package by.student.budanitskaya.aggregation_and_composition.task3;

public class City extends AdministrativeEntity {

	private String regionName;
	private String districtName;

	// конструктор без параметров

	public City() {
		super();
		this.setName("Washington");
	}

	// конструктор суперкласса

	public City(String name) {
		super(name);

	}

	public String getRegionName() {
		return regionName;
	}

	public String getDistrictName() {
		return districtName;
	}

}
