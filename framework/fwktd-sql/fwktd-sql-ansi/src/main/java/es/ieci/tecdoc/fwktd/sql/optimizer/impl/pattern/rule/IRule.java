/*
 * 
 */
package es.ieci.tecdoc.fwktd.sql.optimizer.impl.pattern.rule;

import java.util.List;

import es.ieci.tecdoc.fwktd.sql.node.statement.IStatement;

/**
 * Reglas a aplicar en un patr�n de optimizaci�n
 * 
 */
public interface IRule {

	/**
	 * Comprueba si la regla es aplicable, es caso de que sea aplicable dejar�
	 * expuesta la informaci�n necesaria para optimizar a trav�s de m�todos
	 * p�blicos especificos de la regla.
	 * 
	 * @return
	 */
	boolean enable();

	/**
	 * Conjunto de sentencias que verifican la regla
	 * 
	 * @return lista de sentencias
	 */
	List<IStatement> getEnabledStatements();
}
