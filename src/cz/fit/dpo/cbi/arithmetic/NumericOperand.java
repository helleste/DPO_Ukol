package cz.fit.dpo.cbi.arithmetic;

import cz.fit.dpo.cbi.arithmetic.iterator.PrimitiveIterator;
import cz.fit.dpo.cbi.arithmetic.elements.ExpressionElement;
import cz.fit.dpo.cbi.arithmetic.iterator.InOrderIterator;
import cz.fit.dpo.cbi.arithmetic.iterator.PostOrderIterator;
import cz.fit.dpo.cbi.arithmetic.elements.NumberElement;

import java.util.Iterator;

/**
 * Represents number in the arithmetic expression
 */
public class NumericOperand extends ArithmeticExpression {

    private Integer value;

    public NumericOperand(Integer value) {
        this.value = value;
    }
    
    public Integer getValue()
	{
		return value;
	}

    @Override
    public Integer evaluate() {
        return value;
    }
    
    @Override
    public ExpressionElement getElem() {
    	return new NumberElement(value);
    }

    @Override
    public Iterator<ExpressionElement> getInOrderIterator() {
    	return new PrimitiveIterator(getElem());
    }

    @Override
    public Iterator<ExpressionElement> getPostOrderIterator() {
    	return new PrimitiveIterator(getElem());
    }

    
}
