package cz.fit.dpo.cbi.arithmetic.iterator;

import java.util.Iterator;
import java.util.LinkedList;

import cz.fit.dpo.cbi.arithmetic.BinaryOperator;
import cz.fit.dpo.cbi.arithmetic.elements.CloseBracketOperation;
import cz.fit.dpo.cbi.arithmetic.elements.OpenBracketOperation;
import cz.fit.dpo.cbi.arithmetic.iterator.PrimitiveIterator;
import cz.fit.dpo.cbi.arithmetic.elements.ExpressionElement;

public class InOrderIterator extends CompositeIterator {

	public InOrderIterator(BinaryOperator operator) {
		queue = new LinkedList<Iterator<ExpressionElement>>();
		queue.add(new PrimitiveIterator(new OpenBracketOperation()));
		queue.add(operator.getFirstOperand().getInOrderIterator());
		queue.add(new PrimitiveIterator(operator.getElem()));
		queue.add(operator.getSecondOperand().getInOrderIterator());
		queue.add(new PrimitiveIterator(new CloseBracketOperation()));
	}
}
