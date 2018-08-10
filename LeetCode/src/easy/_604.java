package easy;

public class _604 {

	public static void main(String[] args) {
		StringIterator iterator = new StringIterator("L123e2t1C1o1d1e1");
		iterator.next();
	}
	
    
    public static class StringIterator {
    	private String str;
    	private char curr;
    	int times = 0;
    	int index = 0;
    	
    	public StringIterator(String compressedString) {
    		str = compressedString;
    	}
    	
    	public char next() {
    		if(!hasNext()) return ' ';
    		if(times == 0) {
    			curr = str.charAt(index++);
    			while (index < str.length() && Character.isDigit(str.charAt(index))) {
    				times = times * 10 + (str.charAt(index++) - '0');
    			}
    		}
    		
    		times--;
    		return curr;
    	}
    	
    	public boolean hasNext() {
    		return !(index > str.length() && times == 0);
    	}
    }
    

}
