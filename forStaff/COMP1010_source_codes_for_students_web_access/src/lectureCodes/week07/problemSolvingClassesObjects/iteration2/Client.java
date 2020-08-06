package lectureCodes.week07.problemSolvingClassesObjects.iteration2;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deck pack = new Deck();
		pack.shuffle(200);
		//System.out.println(pack);
		
		Hand myHand = new Hand(5, pack);
		Hand yourHand = new Hand(5, pack);
		Hand theirHand = new Hand(5, pack);
		
		System.out.println("Player 1 hand: \n"+myHand);
		System.out.println("Player 2 hand: \n"+yourHand);
		System.out.println("Player 3 hand: \n"+theirHand);
		System.out.println("Leftover pack: \n"+pack);
	
	}

}
