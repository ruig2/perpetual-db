
package edu.uci.ics.perpetual.expression.operators.relational;

import edu.uci.ics.perpetual.expression.ExpressionVisitor;

public class MinorThan extends ComparisonOperator {

    public MinorThan() {
        super("<");
    }

    @Override
    public void accept(ExpressionVisitor expressionVisitor) {
        expressionVisitor.visit(this);
    }
}
