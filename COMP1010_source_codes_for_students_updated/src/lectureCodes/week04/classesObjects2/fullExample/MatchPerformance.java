package lectureCodes.week04.classesObjects2.fullExample;
public class MatchPerformance {
	public int shotsTaken, goalsScored;
	public int passesAttempted, passesCompleted;
	
	public MatchPerformance(int st, int gs, int pa, int pc) {
		shotsTaken = st;
		goalsScored = gs;
		passesAttempted = pa;
		passesCompleted = pc;
	}
	
	public MatchPerformance(MatchPerformance source) {
		shotsTaken = source.shotsTaken;
		goalsScored = source.goalsScored;
		passesAttempted = source.passesAttempted;
		passesCompleted = source.passesCompleted;
	}
	
	public double conversionRate() {
		return goalsScored*100.0/shotsTaken;
	}
	
	public double passingAccuracy() {
		return passesCompleted*100.0/passesAttempted;
	}
	
	public String toString() {
		return "Scoring success rate: "+Math.round(this.conversionRate())+
			"% ("+this.goalsScored+"/"+this.shotsTaken+")\nPassing accuracy: "+Math.round(this.passingAccuracy())+
				"% ("+this.passesCompleted+"/"+this.passesAttempted+
				")";
	}
}
