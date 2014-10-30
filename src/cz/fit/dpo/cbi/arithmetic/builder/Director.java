package cz.fit.dpo.cbi.arithmetic.builder;


public class Director {
	
	public void build(final ArithmeticExpressionBuilder builder, String input) {
		
		String[] elements = input.split(" ");
        
        for (String element : elements) {
			if (element.equals("+"))
				builder.buildAddition();
			else if (element.equals("-"))
				builder.buildSubstraction();
			else
				builder.buildNumericOperand(Integer.valueOf(element));
		}
	}
}
