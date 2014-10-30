package cz.fit.dpo.cbi.arithmetic;

import java.util.Iterator;

import cz.fit.dpo.cbi.arithmetic.elements.ExpressionElement;

public abstract class ArithmeticExpression {

    public abstract Integer evaluate();
    
    // For the iterator
    public abstract ExpressionElement getElem();
    
    public abstract Iterator<ExpressionElement> getInOrderIterator();

    public abstract Iterator<ExpressionElement> getPostOrderIterator();
}
