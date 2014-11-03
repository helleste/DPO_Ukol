package cz.fit.dpo.cbi.arithmetic.iterator;

import java.util.Iterator;
import java.util.LinkedList;

import cz.fit.dpo.cbi.arithmetic.BinaryOperator;
import cz.fit.dpo.cbi.arithmetic.iterator.PrimitiveIterator;
import cz.fit.dpo.cbi.arithmetic.elements.ExpressionElement;

public class PostOrderIterator extends CompositeIterator {

	public PostOrderIterator(BinaryOperator operator) {
		queue = new LinkedList<Iterator<ExpressionElement>>();
		queue.add(operator.getFirstOperand().getPostOrderIterator());
		queue.add(operator.getSecondOperand().getPostOrderIterator());
		queue.add(new PrimitiveIterator(operator.getElem()));
	}
}
