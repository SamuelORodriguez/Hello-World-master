package sandwichExample;

import java.math.BigDecimal;

/** * Base class for Decorators, this class inherit from Sandwich, so that 
 * * it can be of same type, which is required to pass decorators where 
 * * original object is expected. Later, this class will also come handy 
 * * to provide common functionalities to Decorators. 
 * * * @author */ 
public abstract class SandWichDecorator extends Sandwich {
	@Override 
	abstract BigDecimal price();
	}

//Read more: http://www.java67.com/2013/07/decorator-design-pattern-in-java-real-life-example-tutorial.html#ixzz4Y1oyUboy