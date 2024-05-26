import java.util.Objects;

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

	public double getSugarWeight() {
		return sugarWeight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setSugarWeight(double sugarWeight) {
		this.sugarWeight = sugarWeight;
	}

	@Override
	public String toString() {
		return "Sweet [name=" + name + ", weight=" + weight + ", sugarWeight=" + sugarWeight + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, sugarWeight, weight);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sweet other = (Sweet) obj;
		return Objects.equals(name, other.name)
				&& Double.doubleToLongBits(sugarWeight) == Double.doubleToLongBits(other.sugarWeight)
				&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
	}
	
}
