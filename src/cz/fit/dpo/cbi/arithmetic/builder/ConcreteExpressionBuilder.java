package cz.fit.dpo.cbi.arithmetic.builder;

import cz.fit.dpo.cbi.arithmetic.AddOperator;
import cz.fit.dpo.cbi.arithmetic.ArithmeticExpression;
import cz.fit.dpo.cbi.arithmetic.NumericOperand;
import cz.fit.dpo.cbi.arithmetic.SubstractOperator;

public class ConcreteExpressionBuilder extends ArithmeticExpressionBuilder {

	@Override
	public void buildNumericOperand(Integer num) {
		stack.push(new NumericOperand(num));

	}

	@Override
	public void buildAddition() {
		ArithmeticExpression second = stack.pop();
		ArithmeticExpression first = stack.pop();
		stack.push(new AddOperator(first, second));
	}

	@Override
	public void buildSubstraction() {
		ArithmeticExpression second = stack.pop();
		ArithmeticExpression first = stack.pop();
		stack.push(new SubstractOperator(first, second));
	}

}
