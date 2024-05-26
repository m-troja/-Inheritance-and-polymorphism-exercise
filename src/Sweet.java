
public abstract class Sweet {
	String name;
	double weight;
	double sugarWeight;
	
	public Sweet(String name, double weight, double sugarWeight) {
		super();
		this.name = name;
		this.weight = weight;
		this.sugarWeight = sugarWeight;
	}
	
	public double getSugarWeight () {
		return this.sugarWeight;
	}
}
