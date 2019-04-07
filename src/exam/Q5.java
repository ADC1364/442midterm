package exam;

public class Q5 {

	// This method helps decide if a college student should go 
	// out or stay in and study for the night.
	public static boolean goOut(int hoursStudied, int moneyInWallet, 
	boolean friendsAround, String dayOfWeek){
		
		boolean canGoOut = false;
	int studyHours = 5;
	int moneyNeeded = 20;

		// Predicate p1
//	 	If I (have enough money or it is Thursday) and there // 	are friends around. 
	if (((moneyInWallet >= moneyNeeded) || (dayOfWeek.equals("Thursday"))) && (friendsAround))
			canGoOut = true;
	  	// Predicate p2
		// 	If I (have studied enough and have enough money) and // 	there are friends around.
	else if ((hoursStudied >= studyHours) && 
	(moneyInWallet >= moneyNeeded) && (friendsAround))
		canGoOut = true;

	return canGoOut;
	}


}
