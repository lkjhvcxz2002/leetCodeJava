package easy;

import java.util.ArrayList;
import java.util.List;

public class _599 {

	public static void main(String[] args) {
		String[] list1 = new String[] {"Shogun", "KFC1", "Burger King", "KFC"};
		String[] list2 = new String[] {"KFC", "Shogun", "Burger King"};
		findRestaurant(list1, list2);
	}
	
	
	public static String[] findRestaurant(String[] list1, String[] list2) {
		List<String> result = new ArrayList<>();
		int minIndexSum = 2000;
		
		for(int i = 0; i < list1.length; i++) {
			String curr = list1[i];
			for(int j = 0; j < list2.length; j++) {
				if(list2[j].equals(curr)) {
					if(i + j < minIndexSum) {
						result = new ArrayList<>();
						result.add(curr);
						minIndexSum = (i + j);
					} else if (i + j == minIndexSum) {
						result.add(curr);
					}
					break;
				}
			}
		}
		
		for(String string : result) {
			System.out.println(string);
		}
		
        return result.toArray(new String[result.size()]);
    }
}
