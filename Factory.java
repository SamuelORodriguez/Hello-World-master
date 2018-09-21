package Currency;

class CurrencyFactory {
	 
    public static Currency createCurrency (String country) {

    if (country.equalsIgnoreCase ("India")){

           return new Rupee();

    }else if(country.equalsIgnoreCase ("Singapore")){

           return new SGDDollar();

    }else if(country.equalsIgnoreCase ("US")){

           return new USDollar();

     }

    throw new IllegalArgumentException("No such currency");

    }

}

//Factory client code

public class Factory {

    public static void main(String args[]) {

           String country = args[0];

           Currency rupee = CurrencyFactory.createCurrency(country);

           System.out.println(rupee.getSymbol());

    }

}


//Read more: http://javarevisited.blogspot.com/2011/12/factory-design-pattern-java-example.html#ixzz4Y7iR2VQ3
//Read more: http://javarevisited.blogspot.com/2011/12/factory-design-pattern-java-example.html#ixzz4Y7fBl9PH