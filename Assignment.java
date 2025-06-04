import java.util.*;

class Assignment implements Comparator<Assignment>{
	int number;
	int weight;
	int deadline;
	
	protected Assignment() {
	}
	
	protected Assignment(int number, int weight, int deadline) {
		this.number = number;
		this.weight = weight;
		this.deadline = deadline;
	}
	
	/**
	 * This method is used to sort to compare assignment objects for sorting. 
	 */
	@Override
	public int compare(Assignment a1, Assignment a2) {
		// TODO Implement this

		int difference = a1.weight - a2.weight;

		if(difference == 0){
			if(a1.deadline < a2.deadline){
				return 1;
			}
			if(a2.deadline<a1.deadline){
				return -1;
			}
			else {
				return 0;
			}
		}
		else if (difference <0){
			return 1;
		}
		else if (difference > 0){
			return -1;
		}
		return 0;
	}
}
