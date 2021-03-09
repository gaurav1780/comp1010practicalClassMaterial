package lectureCodes.week04.classesObjects2.fullExample;

public class Client {

	public static void main(String[] args) {
		Name name = new Name("Lionel Andres Messi");
		Date date = new Date(1,1,1988);
		MatchPerformance[] performances = new MatchPerformance[100];
		for(int i=0; i < performances.length; i++) {
			int st = (int)(Math.random() * 30 + 5);
			int gs = (int)(Math.random() * st + 1);
			int pa = (int)(Math.random() * 50 + 10);
			int pc = (int)(Math.random() * pa + 1);
			performances[i] = new MatchPerformance(st, gs, pa, pc);
		}
		Player player = new Player(name, date, performances);
		System.out.println(player);
		System.out.println("Best game: "+player.bestGame());
	}

}
