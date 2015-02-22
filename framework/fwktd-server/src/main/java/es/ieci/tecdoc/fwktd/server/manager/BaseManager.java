/**
 * 
 */
package es.ieci.tecdoc.fwktd.server.manager;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @author IECISA
 * 
 * @param <Entity>
 * @param <Id>
 */
public interface BaseManager<Entity, Id extends Serializable> extends
		BaseReadOnlyManager<Entity, Id> {
	/**
	 * M�todo gen�rico para guardar un objeto. Maneja tanto la inserci�n como la
	 * actualizaci�n.
	 * 
	 * @param anEntity
	 */
	Entity save(Entity anEntity);

	/**
	 * M�todo gen�rico para eliminar un objeto de tipo Entity e identificador
	 * anId.
	 * 
	 * @param anId
	 *            identificador del objeto a eliminar
	 */
	void delete(Id anId);

	/**
	 * M�todo gen�rico para eliminar todas las entidades contenidas en
	 * <code>entities</code>.
	 * 
	 * @param entities
	 *            entidades a eliminar
	 */
	void deleteAll(List<? extends Entity> entities);

	/**
	 * M�todo gen�rico para actualizar un objeto de la clase dada.
	 * 
	 * @param anEntity
	 *            objeto a actualizar
	 */
	Entity update(Entity anEntity);
}
