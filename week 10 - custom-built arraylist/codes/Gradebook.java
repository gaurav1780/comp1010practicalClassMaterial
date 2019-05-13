import java.util.*;

public class Gradebook {
	private ArrayList<GradebookEntry> studentGrades;

	public Gradebook() {
		studentGrades = new ArrayList<GradebookEntry>();
	}

	public void addAssessmentResults(GradebookEntry entry) {
		studentGrades.add(entry);
	}
}
