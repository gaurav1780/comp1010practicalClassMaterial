import java.util.*;

public class Gradebook {
	private ArrayList<GradebookEntry> studentGrades;

	public GradebookEntry() {
		studentGrades = new ArrayList<GradebookEntry>();
	}

	public void addAssessmentResults(GradebookEntry entry) {
		studentGrades.add(entry);
	}
}
