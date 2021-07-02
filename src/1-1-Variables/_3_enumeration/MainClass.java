package _3_enumeration;

enum JacketSize {
	  small(36), medium(40), large(42), extra_large(46), extra_extra_large(48);
	  JacketSize(int chestSize) {
	    this.chestSize = chestSize;
	  }
	  public int chestSize() {
	    return chestSize;
	  }
	  private int chestSize;
	}
	

class Jacket {
	 
	private JacketSize size;
	
	public Jacket(JacketSize size) {
	    this.size = size;	
	}
	  
	public String toString() {
	    switch (this.size) {
	    case small:
	      return "S";
	    case medium:
	      return "M";
	    case large:
	      return "L";
	    case extra_large:
	      return "XL";
	    case extra_extra_large:
	      return "XXL";
	    default:
	      return "";
	    }
	  }  
}
	


public class MainClass {
	  
	public static void main(String[] args) {
	    
		Jacket[] jackets = { new Jacket(JacketSize.medium), 
	                         new Jacket(JacketSize.extra_large),
	                         new Jacket(JacketSize.small), 
	                         new Jacket(JacketSize.extra_extra_large) 
	                         };
	    
	    System.out.println("\n\nJackets sizes available are:\n");
	    
	    for (JacketSize size : JacketSize.values()) {
	      System.out.print(" " + size);
	    }
	    
	    System.out.println("\n\nJackets in stock are:");
	    
	    for (Jacket jacket : jackets) {
	      System.out.println(jacket);
	    }
	  }
	}
