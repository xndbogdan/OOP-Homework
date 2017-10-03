import java.util.Calendar;

public class Journal extends Publication {
	String journalName;
	double impactFactor;
	String name;
	Calendar apparition;
	int numberOfAuthors;
	public Journal(String name, Calendar apparition, int numberOfAuthors, String journalName, double impactFactor)
	{
		super(name, apparition, numberOfAuthors);
		this.name = name;
		this.apparition = apparition;
		this.numberOfAuthors = numberOfAuthors;
		this.journalName = journalName;
		this.impactFactor = impactFactor;
		
	}
	@Override
	double ComputeScore() {
		return (impactFactor/2)/numberOfAuthors;
	}

}
