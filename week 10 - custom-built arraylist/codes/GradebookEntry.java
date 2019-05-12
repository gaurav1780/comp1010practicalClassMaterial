import java.util.*;

public class GradebookEntry {
	private ArrayList<String> assessments;
	private ArrayList<Integer> maxMarks;
	private ArrayList<Double> marksObtained;

	public GradebookEntry() {
		assessments = new ArrayList<String>();
		maxMarks = new ArrayList<Integer>();
		marksObtained = new ArrayList<Double>();
	}

	public void addAssessmentResult(String assessment, int max, double mark) {
		if(assessment.indexOf(assessment) < 0) {
			assessments.add(assessment);
			maxMarks.add(max);
			marksObtained.add(mark);
		}
	}

	public double getTotalMarks() {
		return 0; //to be completed
	}

	public int getTotalMaxMarks() {
		return 0; //to be completed
	}

	public double getPercentageMarks() {
		return 0; //to be completed
	}
}
