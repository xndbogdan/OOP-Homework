
public class Author {

	String name;
	Publication[] publications;
	int nrPublications;
	public Author(String name)
	{
		this.name = name;
		publications = new Publication[20];
		nrPublications=0;
	}
	public void addPublication(Publication p)
	{
		publications[nrPublications] = p;
		nrPublications++;
	}
	public double computeScore()
	{
		double sum=0;
		for(int i=0;i<nrPublications;i++)
		{
			sum+=publications[i].ComputeScore();
		}
		return sum;
	}
}
