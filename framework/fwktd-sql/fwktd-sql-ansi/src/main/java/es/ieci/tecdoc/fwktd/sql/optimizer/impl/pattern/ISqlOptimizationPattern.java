/*
 * 
 */
package es.ieci.tecdoc.fwktd.sql.optimizer.impl.pattern;

import java.util.List;

import es.ieci.tecdoc.fwktd.sql.node.statement.IStatement;
import es.ieci.tecdoc.fwktd.sql.optimizer.impl.pattern.command.ISqlOptimizationCommand;

/**
 * Patr�n para la optimizaci�n de sentencias SQL
 */
public interface ISqlOptimizationPattern {

	/**
	 * Devuelve la prioridad del patr�n
	 */
	public int getPriority();

	/**
	 * Calcula si un patr�n es aplicable para una lista de sentencias, y en caso
	 * de que as� sea retorna el command que realiza la optimizaci�n
	 * 
	 * @param aStatements
	 *            Lista de sentencias a optimizar
	 * @return Command que realiza la optimizaci�n. null si la optimizaci�n no
	 *         es aplicable
	 */
	public ISqlOptimizationCommand enable(List<IStatement> aStatements);
}
