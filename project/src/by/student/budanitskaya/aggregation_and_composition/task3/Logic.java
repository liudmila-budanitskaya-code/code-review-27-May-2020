package by.student.budanitskaya.aggregation_and_composition.task3;

import java.util.ArrayList;

public class Logic {
	
	public static ArrayList<District> addDistrict(ArrayList<District> list, District d) {
		list.add(d);
		return list;
	}

	public static ArrayList<Region> addRegion(ArrayList<Region> list, Region d) {
		list.add(d);
		return list;
	}

}
