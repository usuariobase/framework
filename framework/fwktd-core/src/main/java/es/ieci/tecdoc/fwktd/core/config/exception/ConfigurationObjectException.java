package es.ieci.tecdoc.fwktd.core.config.exception;

/**
 * Clase base para excepciones de configuracion
 */
public class ConfigurationObjectException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	/**
	 * C�digo de error de la excepci�n
	 */
	private String errCode;

	/**
	 * Constructor a partir del c�digo de error
	 * @param errCode C�digo de error
	 */
	public ConfigurationObjectException(String errCode) {
		super();
		
		this.errCode = errCode;
	}
	
	/**
	 * Constructor a partir del c�digo de error y el mensaje
	 * @param errCode C�digo de error
	 * @param message Mensaje de la excepcion
	 */
	public ConfigurationObjectException(String errCode, String message) {
		super(message);
		this.errCode = errCode;
	}

	/**
	 * Constructor a partir del c�digo de error y la causa
	 * @param errCode C�digo de error
	 * @param cause Causa de la excepci�n
	 */
	public ConfigurationObjectException(String errCode, Throwable cause) {
		super(cause);
		
		this.errCode = errCode;
	}
	
	/**
	 * Constructor a partir del c�digo de error, el mensaje y la causa
	 * @param errCode C�digo de error
	 * @param message Mensaje de la excepcion
	 * @param cause Causa de la excepci�n
	 */
	public ConfigurationObjectException(String errCode, String message, Throwable cause) {
		super(message, cause);
		
		this.errCode = errCode;
	}
	
	/**
	 * Permite obtener el c�digo de error
	 * @return C�digo de error de la excepci�n
	 */
	public String getErrCode() {
		return errCode;
	}
	
}
