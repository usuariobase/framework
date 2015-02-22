/*
 * 
 */
package es.ieci.tecdoc.fwktd.sql.node;

/**
 * Interface com�n para todos los nodos que participen en la representaci�n
 * intermedia de una sentencia SQL (incluidas las propias sentencias)
 * 
 * @author IECISA
 */
public interface ISqlNode {

	/**
	 * Devuelve <code>true</code> si es igual o depende de un nodo igual al
	 * que se le pasa como par�metro
	 * 
	 * @param aNode
	 * @return <code>true</code> si lo es o lo contiene, <code>false</code>
	 *         en otro caso
	 */
	public boolean isOrContains(ISqlNode aNode);

	public String getSqlString();

	public void setSqlString(String aSqlString);
}
