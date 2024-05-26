import java.util.Arrays;
import java.util.Objects;

public class Present {
	
	int totalWeight = 0;
	int lastArrayIndex = 0;
	
	
	Sweet[] sweets = new Sweet[10];
	Sweet[] presentSweets = new Sweet[10];

	public Present() {};
	
	// the method filters sweets by sugar weight inclusively 
	public Sweet[] filterSweetsBySugarRange(double minSugarWeight, double maxSugarWeight) {
		
		return Arrays.stream(sweets).filter(sweet -> sweet.getSugarWeight() >= minSugarWeight).filter( sweet -> sweet.getSugarWeight() <= maxSugarWeight).toArray(Sweet[]::new);
		
	
	}

	// the method calculates total weight of the present
	public double calculateTotalWeight() {
	
		return Arrays.stream(sweets)
				.filter(Objects::nonNull)
				.mapToDouble(sweet -> sweet.getWeight())
				.sum();
	}

	// the method that adds sweet to the present
	public void addSweet(Sweet sweet) {
		
	}
	


	// the method returns copy of the Sweet[] array so that nobody could 
	// modify state of the present without addSweet() method. 
	// Also array shouldn’t contain null values.
	public Sweet[] getSweets() {
		
		return Arrays.stream(sweets).filter(Objects::nonNull).toArray(Sweet[]::new);
	}

	
	
}
