
public class Portfolio {
	Share[] shares;
	int noShares;
	Portfolio()
	{
		noShares = 0;
		shares = new Share[20];
	}
	public void addShare(Share s)
	{
		shares[noShares]=s;
		noShares++;
	}
	public double computeSum()
	{
		double sum = 0;
		for(int i=0;i<noShares;i++)
		{
			sum+=shares[i].value;
		}
		return sum;
	}
}
