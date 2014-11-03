package cz.fit.dpo.cbi.arithmetic.iterator;

import java.util.Iterator;

import cz.fit.dpo.cbi.arithmetic.elements.ExpressionElement;

public class PrimitiveIterator implements Iterator<ExpressionElement> {

	boolean hasNext = true;
	ExpressionElement el;

	public PrimitiveIterator(ExpressionElement elem) {
		this.el = elem;
	}

	@Override
	public boolean hasNext() {
		return hasNext;
	}

	@Override
	public ExpressionElement next() {
		hasNext = false;
		return el;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

}
