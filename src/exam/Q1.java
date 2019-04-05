package exam;

public class Q1 {

	// global variables to store the index i after the for loop has executed to make sure the body was executed
	public static int num1, num2 =0;
	
	
	// This method returns the index of the last zero (0) in
	// x. If no such element exists, return -1.
	// If x is null, throw a NullPointException.
	public static int lastZero(int[] x){
		
		// fault  exists in the for loop:
		// for (i = x.length-1, i>= 0, i--) 
			for(int i = 0; i < x.length-1; i++){ 
				if (x[i] == 0)
					return i;
				num1 = i;
			}
			
			return -1;
	}
	
	
	// This method returns the index of the last zero (0) in
		// x. If no such element exists, return -1.
		// If x is null, throw a NullPointException.
		public static int lastZeroCorrected(int[] x){
			
			// count stores the number of times the for loop executes
			int count = 0;
				for(int i = x.length-1; i >= 0; i--){
					if (x[i] == 0)
						return i;
					count ++;
					num2 = count ;
				}
				
				return -1;
		}


}
