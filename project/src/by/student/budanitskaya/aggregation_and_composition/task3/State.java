/* 4. Programming with classes
 *    Агрегация и композиция
 * 
 * 3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: 
 * вывести на консоль столицу, количество областей, площадь, областные центры.* 
 * 
 */

package by.student.budanitskaya.aggregation_and_composition.task3;

import java.util.ArrayList;

public class State extends AdministrativeEntity {

	private ArrayList<Region> regionList;
	private ArrayList<District> districtList;
	private City capital;

	public State() {
		super();
		this.setName("USA");
		this.setCapital(new City());

		ArrayList<District> districtList = new ArrayList<District>();
		District d = new District("District Columbia");
		districtList.add(d);
		this.setDistrictList(districtList);
		this.setCapital(new City());
		this.setArea(9834000);
	}

	public State(String name, City capital, int area) {
		super(area, name);
		this.capital = capital;
		this.setArea(area);
	}

	public State(ArrayList<Region> regionList, ArrayList<District> districtList, City capital) {
		super();
		this.regionList = regionList;
		this.districtList = districtList;
		this.capital = capital;
	}

	public ArrayList<Region> getRegionList() {
		return regionList;
	}

	public void setRegionList(ArrayList<Region> regionList) {
		this.regionList = regionList;
	}

	public ArrayList<District> getDistrictList() {
		return districtList;
	}

	public void setDistrictList(ArrayList<District> districtList) {
		this.districtList = districtList;
	}

	public City getCapital() {
		return capital;
	}

	public void setCapital(City capital) {
		this.capital = capital;
	}

}
