package org.interview.poc.collection;
/**
 * @author hemangi
 *
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class InterviewHashSetPrograms {
	public static void main(String[] args) {
		//InterviewHashSetPrograms.appendElementInHashSet();
		//InterviewHashSetPrograms.iterateAllELementInHashSet();
		//InterviewHashSetPrograms.iterateHashSetInReverseOrder();
		//InterviewHashSetPrograms.insertRemoveelementInHashSet();
		//InterviewHashSetPrograms.emptyTheHashSetAndCheckItIsEmptyOrnot();
	//	InterviewHashSetPrograms.cloneHAshSet();
		//InterviewHashSetPrograms.convert_hashSet_To_TreeSet();
		//InterviewHashSetPrograms.convert_hashSet_To_ArrayList();
		//InterviewHashSetPrograms.compare_Two_HashSet();
		InterviewHashSetPrograms.compare_two_hashset_And_Collect_Common_ELement();
	}

	private static void compare_two_hashset_And_Collect_Common_ELement() {
		// TODO Auto-generated method stub
		HashSet<String> carSet_1 = new HashSet<String>();
		carSet_1.add("Honda_City");
		carSet_1.add("Maruti_Swift");
		carSet_1.add("Toyota_Fortuner");
		carSet_1.add("Mahindra_Scorpio");
		carSet_1.add("Hyundai_Creta");
		System.out.println("The Original HashSet is : " + carSet_1);
		HashSet<String> carSet_2 = new HashSet<String>();
		carSet_2.add("Skoda_Rapid");
		carSet_2.add("Maruti_Swift");
		carSet_2.add("Toyota_Fortuner");
		carSet_2.add("Mahindra_Scorpio");
		carSet_2.add("Hyundai_Xcent");

		HashSet<String> common_carSet = new HashSet<String>();

		for (String str : carSet_1) {
			if (carSet_2.contains(str)) {
				common_carSet.add(str);
			}
		}
		System.out.println("Common cars in both sets are : " + common_carSet);
	}

	private static void compare_Two_HashSet() {
		// TODO Auto-generated method stub
		HashSet<String> carSet_1 = new HashSet<String>();
		carSet_1.add("Honda_City");
		carSet_1.add("Maruti_Swift");
		carSet_1.add("Toyota_Fortuner");
		carSet_1.add("Mahindra_Scorpio");
		carSet_1.add("Hyundai_Creta");
		System.out.println("The Original HashSet is : " + carSet_1);
		HashSet<String> carSet_2 = new HashSet<String>();
		carSet_2.add("Skoda_Rapid");
		carSet_2.add("Maruti_Swift");
		carSet_2.add("Toyota_Fortuner");
		carSet_2.add("Mahindra_Scorpio");
		carSet_2.add("Hyundai_Xcent");
		/*
		 * for (String str : carSet_1) { System.out.println(carSet_2.contains(str) ?
		 * "yes" : "no"); }
		 */
		for (String str : carSet_1) {
			if (carSet_2.contains(str)) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
		}
	}

	private static void convert_hashSet_To_ArrayList() {
		// TODO Auto-generated method stub
		HashSet<String> carSet = new HashSet<String>();
		carSet.add("Honda_City");
		carSet.add("Maruti_Swift");
		carSet.add("Toyota_Fortuner");
		carSet.add("Mahindra_Scorpio");
		carSet.add("Hyundai_Creta");
		System.out.println("The Original HashSet is : " + carSet);
		ArrayList<String> car_list = new ArrayList<String>(carSet);
		System.out.println("After converting HashSet to ArrayList : " + car_list);
	}

	private static void convert_hashSet_To_TreeSet() {
		// TODO Auto-generated method stub
		HashSet<String> carSet = new HashSet<String>();
		carSet.add("Honda_City");
		carSet.add("Maruti_Swift");
		carSet.add("Toyota_Fortuner");
		carSet.add("Mahindra_Scorpio");
		carSet.add("Hyundai_Creta");
		System.out.println("The Original HashSet is : " + carSet);
		Set<String> hashSet_to_tresSet = new TreeSet<String>(carSet);
		System.out.println("After converting HashSet to TreeSet : " + hashSet_to_tresSet);
	}

	private static void cloneHAshSet() {
		// TODO Auto-generated method stub
		HashSet<String> carSet = new HashSet<String>();
		carSet.add("Honda_City");
		carSet.add("Maruti_Swift");
		carSet.add("Toyota_Fortuner");
		carSet.add("Mahindra_Scorpio");
		carSet.add("Hyundai_Creta");
		System.out.println("Original HashSet : " + carSet);
		HashSet clone_CarSet = new HashSet();
		clone_CarSet = (HashSet) carSet.clone();
		System.out.println("cloned HashSet : " + clone_CarSet);

	}

	private static void emptyTheHashSetAndCheckItIsEmptyOrnot() {
		// TODO Auto-generated method stub
		Set<String> carSet = new HashSet<String>();
		carSet.add("Honda_City");
		carSet.add("Maruti_Swift");
		carSet.add("Toyota_Fortuner");
		carSet.add("Mahindra_Scorpio");
		carSet.add("Hyundai_Creta");
		System.out.println("Original Car Set : " + carSet);

		System.out.println("The Set is empty or not! : " + carSet.isEmpty());

		carSet.removeAll(carSet);
		System.out.println("After removing carset : " + carSet);

		System.out.println("The Set is empty or not! : " + carSet.isEmpty());

	}

	private static void insertRemoveelementInHashSet() {
		// TODO Auto-generated method stub

		Set<String> carSet = new HashSet<String>();
		System.out.println("size = " + carSet.size());
		carSet.add("Honda_City");
		carSet.add("Maruti_Swift");
		carSet.add("Toyota_Fortuner");
		carSet.add("Mahindra_Scorpio");
		carSet.add("Hyundai_Creta");
		System.out.println("size = " + carSet.size());
		carSet.add("Honda_Jazz");
		System.out.println(carSet);

		carSet.remove("Hyundai_Creta");
		System.out.println(carSet);
		System.out.println("size = " + carSet.size());

	}

	private static void iterateHashSetInReverseOrder() {
		// TODO Auto-generated method stub
		HashSet<String> carSet = new HashSet<String>();
		carSet.add("Honda_City");
		carSet.add("Maruti_Swift");
		carSet.add("Toyota_Fortuner");
		carSet.add("Mahindra_Scorpio");
		carSet.add("Hyundai_Creta");
		System.out.println("All car : " + carSet);

		ArrayList<String> carList = new ArrayList<String>();
		carList.addAll(carSet);
		System.out.println(carList);
		Collections.reverse(carList);
		System.out.println("reverse CarList : " + carList);
		/*
		 * System.out.println("Set to Arraylist is :  "); for(String str:carList)
		 * System.out.print(str+" ");
		 */

	}

	private static void iterateAllELementInHashSet() {
		// TODO Auto-generated method stub
		HashSet<String> carSet = new HashSet<String>();
		carSet.add("Honda_City");
		carSet.add("Maruti_Swift");
		carSet.add("Toyota_Fortuner");
		carSet.add("Mahindra_Scorpio");
		carSet.add("Hyundai_Creta");
		System.out.println("All car : " + carSet);
		for (String str : carSet)
			System.out.println(str);

	}

	private static void appendElementInHashSet() {
		// TODO Auto-generated method stub
		HashSet<String> carSet = new HashSet<String>();
		carSet.add("Honda_City");
		carSet.add("Maruti_Swift");
		carSet.add("Toyota_Fortuner");
		carSet.add("Mahindra_Scorpio");
		carSet.add("Hyundai_Creta");
		System.out.println("All car : " + carSet);

	}

}
