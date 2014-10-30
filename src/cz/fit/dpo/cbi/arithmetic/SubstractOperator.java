package cz.fit.dpo.cbi.arithmetic;

import cz.fit.dpo.cbi.arithmetic.elements.ExpressionElement;
import cz.fit.dpo.cbi.arithmetic.elements.SubstractOperation;


/**
 * Represents - operation
 */
public class SubstractOperator extends BinaryOperator {
    
    public SubstractOperator(ArithmeticExpression firstOperand, ArithmeticExpression secondOperand) {
        super(firstOperand, secondOperand);
    }    

    @Override
    public Integer evaluate(Integer operand1, Integer operand2) {
        return operand1 - operand2;
    }
    
    @Override
    public ExpressionElement getElem() {
    	return new SubstractOperation();
    }

}
