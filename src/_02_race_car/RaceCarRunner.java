package _02_race_car;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */



public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
		RaceCar car5 = new RaceCar(null, 5); 
		// 2. Print the RaceCar's position in the race
		System.out.print(car5.getPositionInRace());
		car5.getPositionInRace();
		// 3. Crash the RaceCar
		car5.crash();
		// 4. If the car is damaged. Bring it in for a pit stop.
		if (car5.isDamaged()) {
			car5.pit();
			
		}
		int x = car5.getPositionInRace();
		// 5. Help the car move into first place.
		while (true){
			if (x > 1){ 
				car5.overtake();
				x = car5.getPositionInRace();
			}else {
				System.out.print("Congratulations! Your car has won the race!");
				System.exit(x);
			}
		}
		
		
	}
}
/// Nothing Else to Work in here