package cz.fit.dpo.cbi;

import java.util.Iterator;

import cz.fit.dpo.cbi.arithmetic.elements.ExpressionElement;
import cz.fit.dpo.cbi.arithmetic.ArithmeticExpression;

/**
 * Printer for {@link ArithmeticExpression}s. It can print inOrder notation (3 + 1) or postOrder
 * notation (3 1 +).
 *
 * PostOrder is RPN (Reverse Polish Notation) in fact. See wiki for more information.
 *
 */
public class ArithmeticExpressionPrinter {
    private ArithmeticExpression expression;

    public ArithmeticExpressionPrinter(ArithmeticExpression expression) {
        this.expression = expression;
    }
    
    private String print(Iterator<ExpressionElement> it) {
		StringBuilder sb = new StringBuilder();
		while (it.hasNext()) {
			sb.append(it.next().stringValue());
		}
		return sb.toString();
	}
    
    private String printWithSpaces(Iterator<ExpressionElement> it) {
		StringBuilder sb = new StringBuilder();
		while (it.hasNext()) {
			sb.append(it.next().stringValue());
			if(it.hasNext()) sb.append(" ");
		}
		return sb.toString();
	}

    /**
     * Print an expression in classical notation, e.g. (3+1).     
     * The "(" and ")" is used to preserve priorities.     
     * @return String in classical "inOrder" format.
     */
    public String printInOrder() {
    	Iterator<ExpressionElement> it = expression.getInOrderIterator();
		return print(it);
    }    

    /**
     * Print an expression in RPN notation, e.g. 3 1 +.     
     * Please note, the "(" and ")" are no longer necessary, because RPN does not need them.
     * @return string in "postOrder" (RPN) format.
     */
    public String printPostOrder() {
    	Iterator<ExpressionElement> it = expression.getPostOrderIterator();
		return printWithSpaces(it);
    }

}
