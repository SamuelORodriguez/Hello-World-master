package sandwichExample;

import java.math.BigDecimal;
/** * Base class for all types of Sandwich, cost method is abstract because 
 * * different sandwiches has different price. 
 * * * @author Javin Paul */
public abstract class Sandwich {
	protected String description = "Sandwich";
	String getDescription(){
		return description;
	}
	abstract BigDecimal price();
	}

//Read more: http://www.java67.com/2013/07/decorator-design-pattern-in-java-real-life-example-tutorial.html#ixzz4Y1niFnSg