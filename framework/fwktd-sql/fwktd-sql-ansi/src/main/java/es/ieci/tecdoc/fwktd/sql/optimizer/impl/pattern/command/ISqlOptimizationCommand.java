/*
 * 
 */
package es.ieci.tecdoc.fwktd.sql.optimizer.impl.pattern.command;

import es.ieci.tecdoc.fwktd.sql.optimizer.impl.pattern.action.IAction;

/**
 * Command para la optimizaci�n de sentencias SQL
 */
public interface ISqlOptimizationCommand {

	/**
	 * Realiza la optimizaci�n
	 */
	public void execute();

	void addAction(IAction anAction);
}
