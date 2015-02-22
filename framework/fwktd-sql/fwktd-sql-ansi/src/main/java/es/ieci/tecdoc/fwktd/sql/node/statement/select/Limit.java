/*
 *
 */
package es.ieci.tecdoc.fwktd.sql.node.statement.select;

import es.ieci.tecdoc.fwktd.sql.node.SqlNode;

/**
 * Cla�sula LIMIT.
 */
public class Limit extends SqlNode {

	public Limit() {
		super();
	}

	public Limit(long aRowCount) {
		this();
		setRowCount(aRowCount);
	}

	public Limit(long anOffset, long aRowCount) {
		this(aRowCount);
		setOffset(anOffset);
	}

	public long getRowCount() {
		return rowCount;
	}

	public void setRowCount(long aRowCount) {
		this.rowCount = aRowCount;
	}

	public boolean isRowCountJdbcParameter() {
		return rowCountJdbcParameter;
	}

	public void setRowCountJdbcParameter(boolean aRowCountJdbcParameter) {
		this.rowCountJdbcParameter = aRowCountJdbcParameter;
	}

	public long getOffset() {
		return offset;
	}

	public void setOffset(long anOffset) {
		this.offset = anOffset;
	}

	public boolean isOffsetJdbcParameter() {
		return offsetJdbcParameter;
	}

	public void setOffsetJdbcParameter(boolean anOffsetJdbcParameter) {
		this.offsetJdbcParameter = anOffsetJdbcParameter;
	}
	
	// Members
	
	private static final long serialVersionUID = -5054986181259280265L;

	/** Offset */
	private long offset;

	/** N�mero de filas */
	private long rowCount;

	/** Indica si el offset es un par�metro */
	private boolean offsetJdbcParameter = false;

	/** Indica si el n�mero de filas es un par�metro */
	private boolean rowCountJdbcParameter = false;
}
