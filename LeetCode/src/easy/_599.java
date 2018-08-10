package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _599 {

	public static void main(String[] args) {
		String[] list1 = new String[] {"Shogun", "KFC1", "Burger King", "KFC"};
		String[] list2 = new String[] {"KFC", "Shogun", "Burger King"};
		System.out.println(findRestaurant(list1, list2)[0]);
	}
	
	
	public static String[] findRestaurant(String[] list1, String[] list2) {
		List<String> result = new ArrayList<>();
		Map<String, Integer> strMap = new HashMap<>();
		int minIndexSum = Integer.MAX_VALUE;
		
		for(int i = 0; i < list1.length; i++) {
			strMap.put(list1[i], i);
		}
		for(int i = 0; i < list2.length; i++) {
			if(strMap.containsKey(list2[i])) {
				if(i + strMap.get(list2[i]) < minIndexSum) {
					result = new ArrayList<>();
					result.add(list2[i]);
					minIndexSum = (i + strMap.get(list2[i]));
				} else if(i + strMap.get(list2[i]) == minIndexSum) {
					result.add(list2[i]);
				}
			}
		}

        return result.toArray(new String[result.size()]);
    }
}
