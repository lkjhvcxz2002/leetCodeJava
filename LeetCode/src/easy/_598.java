package easy;

public class _598 {

	public static void main(String[] args) {
		int m = 26;
		int n = 17;
		int[][] ops = new int[][] {new int[] {2,2}, new int[] {3,4}, new int[] {2,3}};
		System.out.println(maxCount(m, n, ops));
	}
	
	public static int maxCount(int m, int n, int[][] ops) {
		if(ops == null || ops.length == 0) {
            return m*n;
        }
		
		int rows = Integer.MAX_VALUE;
		int cols = Integer.MAX_VALUE;
		for(int i = 0; i < ops.length; i++) {
			rows = Math.min(rows, ops[i][0]);
			cols = Math.min(cols, ops[i][1]);
		}
		
    	return rows * cols;
    }
}
