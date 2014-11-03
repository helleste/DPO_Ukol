package cz.fit.dpo.cbi.arithmetic.iterator;

import java.util.Deque;
import java.util.Iterator;

import cz.fit.dpo.cbi.arithmetic.elements.ExpressionElement;

public class CompositeIterator implements Iterator<ExpressionElement> {

	protected Deque<Iterator<ExpressionElement>> queue;

	public CompositeIterator() {
		super();
	}

	@Override
	public boolean hasNext() {
		
		if(queue.isEmpty()) {
			return false;
		} else {
			
			Iterator<ExpressionElement> it = queue.peekFirst();			
			if(!it.hasNext()) {				
				queue.pollFirst();
				return hasNext();
			} else {
				return true;
			}
		}		
	}

	@Override
	public ExpressionElement next() {		
		if(hasNext()) {
			Iterator<ExpressionElement> it = queue.peekFirst();
			return it.next();
		} else {
			return null;
		}
		
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();		
	}

}