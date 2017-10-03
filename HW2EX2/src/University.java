
public class University {

	String name,location;
	Author[] authors;
	int nrAuthors;
	public University(String name, String location)
	{
		this.name = name;
		this.location = location;
		authors = new Author[20];
		nrAuthors=0;
	}
	public void addAuthor(Author a)
	{
		authors[nrAuthors]= a;
		nrAuthors++;
	}
	public double computeScore()
	{
		double sum=0;
		for(int i=0;i<nrAuthors;i++)
		{
			sum+=authors[i].computeScore();
		}
		return sum;
	}
}
