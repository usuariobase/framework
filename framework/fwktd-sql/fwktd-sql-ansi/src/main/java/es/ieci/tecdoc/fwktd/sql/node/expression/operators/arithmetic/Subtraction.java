/*
 * 
 */
package es.ieci.tecdoc.fwktd.sql.node.expression.operators.arithmetic;

import es.ieci.tecdoc.fwktd.sql.node.expression.BinaryExpression;
import es.ieci.tecdoc.fwktd.sql.node.expression.IExpression;
import es.ieci.tecdoc.fwktd.sql.node.visitor.ExpressionVisitor;


/**
 * Expresi�n 'resta'.
 */
public class Subtraction extends BinaryExpression {

	public Subtraction(IExpression leftExpression, IExpression rightExpression) {
		super(leftExpression, rightExpression);
	}

	public void accept(ExpressionVisitor expressionVisitor) {
		expressionVisitor.visit(this);
	}

	public String getOperator() {
		return "-";
	}
	
	// Members
	
	private static final long serialVersionUID = -6209165090796332525L;
}
