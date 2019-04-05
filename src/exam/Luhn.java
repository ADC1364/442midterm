package exam;

public class Luhn{
	
	// global variable that shall store the sum to check that its value is correct
	static int num;
	
	
	public static boolean check(String ccNumber){
		int sum = 0;
		boolean alternate = false;
           
		for (int i = ccNumber.length() - 1; i >= 0; i--){
			int n = Integer.parseInt(ccNumber.substring(i,i+1));
         
			if (alternate){
				n *= 2;
				if (n > 9){
					n = (n % 10) + 1;
            		}
         		}
				
			sum += n;
            alternate = !alternate;
            }
			num = sum;
            return (sum % 10 == 0);
    }
}

