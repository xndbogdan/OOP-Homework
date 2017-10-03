
public class Share {
	Company target;
	double value;
	public Share(double value, Company company)
	{
		target = company;
		this.value = value;
	}
	public Company getTarget() {
		return target;
	}
	public void setTarget(Company target) {
		this.target = target;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
}
