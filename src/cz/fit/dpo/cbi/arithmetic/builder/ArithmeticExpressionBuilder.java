package cz.fit.dpo.cbi.arithmetic.builder;

import java.util.Deque;
import java.util.LinkedList;

import cz.fit.dpo.cbi.arithmetic.ArithmeticExpression;

public abstract class ArithmeticExpressionBuilder {
	
	Deque<ArithmeticExpression> stack;
	
	public ArithmeticExpressionBuilder() {
		stack = new LinkedList<ArithmeticExpression>();
	}
	
	public abstract void buildNumericOperand(Integer num);
	public abstract void buildAddition();
	public abstract void buildSubstraction();
	
	public ArithmeticExpression getExpression() {
		return stack.pop();
	}
}
