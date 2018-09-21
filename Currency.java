package Currency;

abstract class Currency {
	 
    abstract String getSymbol();

}

//Concrete Rupee Class code

class Rupee extends Currency {

    @Override

    public String getSymbol() {

           return "Rs";

    }

}

//Concrete SGD class Code

class SGDDollar extends Currency {

    @Override

    public String getSymbol() {

           return "SGD";

    }

}

//Concrete US Dollar code

class USDollar extends Currency {

    @Override

    public String getSymbol() {

           return "USD";

    }

}


//Read more: http://javarevisited.blogspot.com/2011/12/factory-design-pattern-java-example.html#ixzz4Y7eu2GdB
