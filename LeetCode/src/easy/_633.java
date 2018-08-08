package easy;

public class _633 {

	public static void main(String[] args) {
		int c = 2;
		System.out.println(judgeSquareSum(c));
	}
	
    public static boolean judgeSquareSum(int c) {
    	int maxInt = new Double(Math.floor(Math.sqrt(c))).intValue();
    	for (int i = 0; i <= maxInt; i++) {
    		int left = c - (i * i);
    		if(Math.sqrt(left) % 1 == 0) return true; 
    	}
    	return false;   
    }
}
