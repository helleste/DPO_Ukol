package cz.fit.dpo.cbi.arithmetic.elements;

public class NumberElement implements ExpressionElement {

    private Integer value;

    public NumberElement(Integer value) {
        this.value = value;
    }

    @Override
    public String stringValue() {
        return String.valueOf(value);
    }
}
