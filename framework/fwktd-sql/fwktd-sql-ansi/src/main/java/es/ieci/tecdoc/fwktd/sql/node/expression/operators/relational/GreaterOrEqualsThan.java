/*
 *
 */
package es.ieci.tecdoc.fwktd.sql.node.expression.operators.relational;

import es.ieci.tecdoc.fwktd.sql.node.expression.BinaryExpression;
import es.ieci.tecdoc.fwktd.sql.node.expression.IExpression;
import es.ieci.tecdoc.fwktd.sql.node.visitor.ExpressionVisitor;


/**
 * Expresi�n 'mayor o igual que'.
 */
public class GreaterOrEqualsThan extends BinaryExpression {

	public GreaterOrEqualsThan(IExpression leftExpression,
			IExpression rightExpression) {
		super(leftExpression, rightExpression);
	}

	public void accept(ExpressionVisitor expressionVisitor) {
		expressionVisitor.visit(this);
	}

	public String getOperator() {
		return ">=";
	}
	
	// Members
	
	private static final long serialVersionUID = 8384944637617031633L;
}
