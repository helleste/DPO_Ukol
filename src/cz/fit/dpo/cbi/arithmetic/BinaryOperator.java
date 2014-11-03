package cz.fit.dpo.cbi.arithmetic;

import java.util.Deque;
import java.util.Iterator;

import cz.fit.dpo.cbi.arithmetic.ArithmeticExpression;
import cz.fit.dpo.cbi.arithmetic.iterator.InOrderIterator;
import cz.fit.dpo.cbi.arithmetic.iterator.PostOrderIterator;
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
    
    public ArithmeticExpression getFirstOperand() {
        return firstOperand;
    }

    public ArithmeticExpression getSecondOperand() {
        return secondOperand;
    }
    
    public void setFirstOperand(ArithmeticExpression firstOperand) {
		this.firstOperand = firstOperand;
	}
    
    public void setSecondOperand(ArithmeticExpression secondOperand) {
		this.secondOperand = secondOperand;
	}
    
    // TODO Implement iterators
    @Override
    public Iterator<ExpressionElement> getInOrderIterator() {
    	return (new InOrderIterator(this)); 
    }

    @Override
    public Iterator<ExpressionElement> getPostOrderIterator() {
    	return (new PostOrderIterator(this));
    }

}
