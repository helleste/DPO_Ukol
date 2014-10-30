package cz.fit.dpo.cbi;

import cz.fit.dpo.cbi.arithmetic.ArithmeticExpression;
import cz.fit.dpo.cbi.arithmetic.builder.ArithmeticExpressionBuilder;
import cz.fit.dpo.cbi.arithmetic.builder.ConcreteExpressionBuilder;
import cz.fit.dpo.cbi.arithmetic.builder.Director;

public class ArithmeticExpressionCreator {
    

    /**
     * Creates any expression from the RPN input. 
     *
     * @see http://en.wikipedia.org/wiki/Reverse_Polish_notation
     *
     * @param input in Reverse Polish Notation
     * @return {@link ArithmeticExpression} equivalent of the RPN input.
     */
    public ArithmeticExpression createExpressionFromRPN(String input) {
    	final Director director = new Director();
    	ArithmeticExpressionBuilder builder = new ConcreteExpressionBuilder();
    	director.build(builder, input);
    	
    	return builder.getExpression();
    }
}
