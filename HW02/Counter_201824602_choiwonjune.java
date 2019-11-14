package hw02;

public class Counter_201824602_choiwonjune {
	private int count = 0;
	
	public void set_count_zero() {
		count = 0;
	}
	
	public void count_increase() {
		count++;
	}
	
	public void count_decrease() {
		if(count > 0) {
			count--;
		}
		else {
			System.out.println("Error = count cannot be less than zero");
		}
		
	}
	
	public int count_value() {
		return count;
	}
	
	public void count_display() {
		System.out.println("Current Count : "+count);
	}

	public static void main(String args[]) {
		Counter_201824602_choiwonjune counter = new Counter_201824602_choiwonjune();
		counter.set_count_zero();
		counter.count_increase();
		counter.count_display();
		counter.count_increase();
		counter.count_display();
		System.out.println("Return Count : " + counter.count_value());
		counter.count_decrease();
		counter.count_display();
		counter.count_decrease();
		counter.count_display();
		counter.count_decrease();
		counter.count_display();

	}
}


