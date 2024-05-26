import java.util.Arrays;

public class Present {

	public Present() {};
	
	Sweet[] sweets = new Sweet[10];
	Sweet[] newSweets = new Sweet[10];
	
	// the method filters sweets by sugar weight inclusively 
	public Sweet[] filterSweetsBySugarRange(double minSugarWeight, double maxSugarWeight) {
		
		return Arrays.stream(sweets).filter(sweet -> sweet.getSugarWeight() >= minSugarWeight).filter( sweet -> sweet.getSugarWeight() <= maxSugarWeight).toArray(Sweet[]::new);
		
	
	}

	// the method calculates total weight of the present
	public double calculateTotalWeight() {
		return 0;
	}

	// the method that adds sweet to the present
	public void addSweet(Sweet sweet) {
		
	}

	// the method returns copy of the Sweet[] array so that nobody could 
	// modify state of the present without addSweet() method. 
	// Also array shouldn’t contain null values.
	public Sweet[] getSweets() {
		
		
		return null;
	}

	
	
}
