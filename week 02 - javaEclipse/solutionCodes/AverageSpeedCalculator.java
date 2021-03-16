

public class AverageSpeedCalculator {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		double distanceAB = 50;
		double speedAToB = 20; //20 kmph
		double speedBToA = 12.5; //12.5 kmph

		//complete the following steps
		double timeAToB = distanceAB/speedAToB; //calculate time from a to b
		double timeBToA = distanceAB/speedBToA; //calculate time from b to a
		double totalReturnTripTimeTaken = timeAToB+timeBToA; //calculate total time taken
		double totalReturnTripDistance = 2 * distanceAB; //total distance travelled
		double averageSpeed = totalReturnTripDistance/totalReturnTripTimeTaken; //calculate average speed
		System.out.println(averageSpeed);
	}

}
