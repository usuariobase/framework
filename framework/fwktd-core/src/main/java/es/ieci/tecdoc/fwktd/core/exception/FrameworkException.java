/*
 * 
 */
package es.ieci.tecdoc.fwktd.core.exception;

/**
 * Clase base para las extensiones que dispara el framework.
 *
 */
public class FrameworkException extends RuntimeException {

	
	/**
     * Constructor de la clase.
     * 
     * @param msg
     *            mensaje informativo, sugerencia o cualquier otro tipo de
     *            informaci�n auxiliar que ir� asociada a la excepci�n
     * @param e
     *            excepci�n anidada que provoca el disparo de esta excepci�n
     * 
     */
    public FrameworkException(String msg, Exception e) {
        super(msg, e);
        
    }


    /**
     * Constructor de la clase.
     * 
     * @param msg
     *            ubicaci�n en el c�digo, operaci�n o motivo que provocan el
     *            disparo de la excepci�n
     */
    public FrameworkException(String msg) {
        super(msg);

    }
    
    // Members
    private static final long serialVersionUID = -2456285626296760901L;
	
}