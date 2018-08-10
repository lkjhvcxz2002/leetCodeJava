package easy;

import java.util.ArrayList;
import java.util.List;

public class _605 {

	public static void main(String[] args) {
		int[] flowerbed = new int[] {0, 0, 0};
		int n = 3;
		System.out.println(canPlaceFlowers(flowerbed, n));
	}
	
	public static boolean canPlaceFlowers(int[] flowerbed, int n) {
		List<Integer> emptyBlock = new ArrayList<>();
		int block = 0; 
		
		for(int i = 0; i < flowerbed.length; i++) {
			if(flowerbed[i] == 1) {
				if(block > 2) emptyBlock.add(block);
				block = 0;
			} else {
				block++;
				if(i == 0 || (i == flowerbed.length - 1)) block++;
			}
		}
		
		if(block > 0) {emptyBlock.add(block);}
		
		for(Integer bl : emptyBlock) {
			if(bl > 3) {
				int canPlantCount = ((bl - 3) / 2) + 1;
				n -= canPlantCount;
			} else  if(bl == 3) {
				n--;
			} else if (bl >= 1 && flowerbed.length == 1 && n == 1) {
				return true;
			}
		}
		
        return n <= 0;
    }
}
