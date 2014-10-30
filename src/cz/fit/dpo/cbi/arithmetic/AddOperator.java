package cz.fit.dpo.cbi.arithmetic;

import cz.fit.dpo.cbi.arithmetic.elements.AddOperation;
import cz.fit.dpo.cbi.arithmetic.elements.ExpressionElement;

/**
 * Represents + operation
 */
public class AddOperator extends BinaryOperator {

    public AddOperator(ArithmeticExpression firstOperand, ArithmeticExpression secondOperand) {
        super(firstOperand, secondOperand);
    }    

    @Override
    public Integer evaluate(Integer operand1, Integer operand2) {
        return operand1 + operand2;
    }
    
    // For iterator
    @Override
    public ExpressionElement getElem() {
    	return new AddOperation();
    }

}
