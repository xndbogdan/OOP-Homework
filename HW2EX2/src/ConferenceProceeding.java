import java.util.Calendar;

public final class ConferenceProceeding extends Publication {
	String volumeName;
	boolean indexed;
	String name;
	Calendar apparition;
	int numberOfAuthors;
	public ConferenceProceeding(String name, Calendar apparition, int numberOfAuthors,String volumeName, boolean indexed)
	{
		super(name, apparition, numberOfAuthors);
		this.name = name;
		this.apparition = apparition;
		this.numberOfAuthors = numberOfAuthors;
		this.volumeName = volumeName;
		this.indexed = indexed;
	}
	@Override
	double ComputeScore() {
		
		if (indexed) return (0.25/numberOfAuthors);
		else return 0.2/numberOfAuthors;
	}

}
