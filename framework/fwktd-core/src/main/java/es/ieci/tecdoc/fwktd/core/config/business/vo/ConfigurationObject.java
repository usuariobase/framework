package es.ieci.tecdoc.fwktd.core.config.business.vo;


/**
 * Interface a implementar por los objetos que almacenan
 * valores de configuraci�n
 */
public interface ConfigurationObject {

	/**
	 * Permite obtener una propiedad de configuraci�n
	 * @param key Propiedad de configuraci�n
	 * @return Valor de la propiedad
	 */
	public abstract Object get(String key);

	/**
	 * Permite establecer una propiedad en la configuraci�n
	 * @param key Clave de la propiedad
	 * @param value Valor de la propiedad
	 */
	public abstract void set(String key, Object value);
	
	

}