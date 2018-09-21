package sandwichExample;

import java.math.BigDecimal;
/** * A Concrete implementation of abstract Sandwich class, which represent a WhiteBread 
 * * Sandwich, whose price is 3.0$. 
 * * * @author Javin Paul */ 
public class WhiteBreadSandWich extends Sandwich {
	public WhiteBreadSandWich(String desc){ 
		description = desc;
	}
	@Override 
	BigDecimal price() {
		return new BigDecimal("3.0");
	}
	}

// Read more: http://www.java67.com/2013/07/decorator-design-pattern-in-java-real-life-example-tutorial.html#ixzz4Y1oNjjMH

