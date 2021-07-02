package _3_enumeration;
	/**
	 * This class declare all different class members 
	 */
enum CoffeeSize {
		// 8, 10 & 16 are passed to the constructor
		BIG(8), HUGE(10), OVERWHELMING(16);
		
		CoffeeSize(int ounces) { // constructor
			this.ounces = ounces;
		}		
		private int ounces; // an instance variable
		
		public int getOunces() {			
		return ounces;
		}
}	
public class DeclaringConstructorsMethodsandVariablesInAnEnum {
	
	CoffeeSize size; // each instance of Coffee has an enum
	
	public static void main(String[] args) {
		DeclaringConstructorsMethodsandVariablesInAnEnum drink1 = new DeclaringConstructorsMethodsandVariablesInAnEnum();
		drink1.size = CoffeeSize.BIG;
		
		DeclaringConstructorsMethodsandVariablesInAnEnum drink2 = new DeclaringConstructorsMethodsandVariablesInAnEnum();
		drink2.size = CoffeeSize.OVERWHELMING;
	
			System.out.println(drink1.size.getOunces()); // prints 8
		
			for(CoffeeSize cs: CoffeeSize.values())
				System.out.println(cs + " " + cs.getOunces());
	}
}
