/**
 * 
 */
package es.ieci.tecdoc.fwktd.server.dao;

import java.io.Serializable;

/**
 * Interfaz gen�rico para acceso a datos.
 * 
 * @author IECISA
 * 
 * @param <Entity>
 *            tipo de entidad a gestionar
 * @param <Id>
 *            tipo de la clave primaria de la entidad
 */
public interface BaseDao<Entity, Id extends Serializable> extends
		BaseReadOnlyDao<Entity, Id> {

	/**
	 * M�todo gen�rico para guardar un objeto. Maneja tanto la inserci�n como la
	 * actualizaci�n.
	 * 
	 * @param entity
	 */
	Entity save(Entity anEntity);

	/**
	 * M�todo gen�rico para eliminar un objeto de tipo T e identificador id.
	 * 
	 * @param id
	 *            identificador del objeto a eliminar
	 */
	void delete(Id anId);

	/**
	 * Elimina todas los objetos de la clase gestionada por el presente DAO.
	 */
	void deleteAll();

	/**
	 * M�todo gen�rico para actualizar un objeto de la clase dada.
	 * 
	 * @param entity
	 *            objeto a actualizar
	 */
	Entity update(Entity anEntity);
}