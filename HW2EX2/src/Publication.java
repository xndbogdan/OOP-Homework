import java.util.Calendar;

public abstract class Publication {
	String name;
	Calendar apparition;
    int numberOfAuthors;
	public Publication(String name, Calendar apparition, int numberOfAuthors)
	{
		this.name=name;
		this.apparition = apparition;
		this.numberOfAuthors = numberOfAuthors;
	}
	abstract double ComputeScore();
}
