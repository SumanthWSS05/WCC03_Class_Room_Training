package basics;

public class Conversion {

	public static void main(String[] args) {
		
		String cost = "₹7,999.00";
		cost = cost.replace("₹", "").replace(",", "");
		
//		System.out.println(cost);
		double price = Double.parseDouble(cost);	
		
		int actualCost = (int)price;
		System.out.println(actualCost);		
	}
}
