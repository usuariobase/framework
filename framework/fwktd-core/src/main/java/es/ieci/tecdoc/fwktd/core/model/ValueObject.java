package es.ieci.tecdoc.fwktd.core.model;

/*
 * 
 */

import java.io.Serializable;

/**
 * 
 * Interface marcador para objetos que van a contener datos de aplicaciones.
 * Patr�n <code>Value Object</code>
 */
public interface ValueObject extends Serializable, Cloneable {
	

	
	/**
	 * Obtiene la representaci�n en XML del <code>VO</code>
	 * @return cadena que contiene la representaci�n en XML del <code>VO</code>
	 */
	String toXML();

}