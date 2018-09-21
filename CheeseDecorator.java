package sandwichExample;

import java.math.BigDecimal;
/** * A Decorator class, which adds cheese (new functionality) into Sandwich object.
 *  * This Decorator class modifies price() and getDescritption() method to implement 
 *  * new behaviour. * * @author */ 
public class CheeseDecorator extends SandWichDecorator{ 
	Sandwich currentSandwich;
	public CheeseDecorator(Sandwich sw){ currentSandwich = sw;}
	@Override 
	String getDescription(){
		return currentSandwich.getDescription() + ", Cheese";
		}@Override BigDecimal price() {
			return currentSandwich.price().add(new BigDecimal("0.50"));
			}
		}

//Read more: http://www.java67.com/2013/07/decorator-design-pattern-in-java-real-life-example-tutorial.html#ixzz4Y1pQQj6J