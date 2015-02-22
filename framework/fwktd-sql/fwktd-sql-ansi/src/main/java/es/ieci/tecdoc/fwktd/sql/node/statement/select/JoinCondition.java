/*
 * 
 */
package es.ieci.tecdoc.fwktd.sql.node.statement.select;

import es.ieci.tecdoc.fwktd.sql.node.ISqlNode;
import es.ieci.tecdoc.fwktd.sql.node.SqlNode;
import es.ieci.tecdoc.fwktd.sql.node.expression.IExpression;
import es.ieci.tecdoc.fwktd.sql.node.visitor.TableReferenceVisitor;

/**
 * Condici�n simple para un JOIN.
 */
public class JoinCondition extends SqlNode implements JoinSpecification {

	public JoinCondition(IExpression anExpression) {
		super();
		setExpression(anExpression);
	}

	public void setExpression(IExpression anExpression) {
		this.expression = anExpression;
	}

	public void accept(TableReferenceVisitor aTableReferenceVisitor) {
		aTableReferenceVisitor.visit(this);
	}

	@Override
	public boolean isOrContains(ISqlNode aNode) {
		if (super.isOrContains(aNode)) {
			return true;
		}
		return getExpression() != null && getExpression().isOrContains(aNode);
	}

	public IExpression getExpression() {
		return expression;
	}
	
	// Members

	private static final long serialVersionUID = -2254245125137109387L;

	/** Expresi�n para la condici�n */
	private IExpression expression;
}
