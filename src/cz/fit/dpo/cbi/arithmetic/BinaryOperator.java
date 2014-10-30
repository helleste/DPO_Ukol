package cz.fit.dpo.cbi.arithmetic;

import java.util.Deque;
import java.util.Iterator;

import cz.fit.dpo.cbi.arithmetic.elements.ExpressionElement;

/**
 * Represents the Binary operations like + - etc.
 */
public abstract class BinaryOperator extends ArithmeticExpression {
	
	Deque<ArithmeticExpression> components;

    private ArithmeticExpression firstOperand;
    private ArithmeticExpression secondOperand;
    
    protected abstract Integer evaluate(Integer operand1, Integer operand2);

    public BinaryOperator(ArithmeticExpression firstOperand, ArithmeticExpression secondOperand) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
    }
    
    public Integer evaluate() {
    	int operand1 = firstOperand.evaluate();
    	int operand2 = secondOperand.evaluate();
    	
    	return evaluate(operand1, operand2);
    }
    
    public Object getFirstOperand() {
        return firstOperand;
    }

    public Object getSecondOperand() {
        return secondOperand;
    }
    
    // TODO Implement iterators
    @Override
    public Iterator<ExpressionElement> getInOrderIterator() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Iterator<ExpressionElement> getPostOrderIterator() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
