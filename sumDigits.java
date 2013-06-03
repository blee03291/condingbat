package condingbat;

public class sumDigits {
	
	public int sumDigits(int n) {
		
	        int k = n % 10;
	        
	        if (n >= 10) {
	        	n =  (n -  (n % 10))/10;
	        	return k  + sumDigits(n);
	        } else 	{
	        	return k;	
	        }
	}
	
	public static void main(String[] args) {
		sumDigits ss = new sumDigits();
		
		int pp = 0;
		pp = ss.sumDigits(10110);
		System.out.println(pp);
	}
}
