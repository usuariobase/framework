package es.ieci.tecdoc.fwktd.core.exception;

import org.springframework.validation.ObjectError;

/*
 * 
 */


/**
 * Interfaz que deben implementar las excepciones internacionalizables
 * 
 */
public interface ManageableException {

	/**
	 * Enumerado con los tipos de errores del mensaje de la excepcion.
	 */
	public static enum LevelEnum {
		/**
		 * M�ximo nivel de Error
		 */
		ERROR,
		/**
		 * Aviso
		 */
		WARN,
		/**
		 * Mensaje informativo
		 */
		INFO
	}

	/**
	 * Objeto asociado al error. Almacena el c�digo del error, los parametros
	 * del error y un mensaje por defecto en caso de no poder resolver su c�digo
	 * 
	 * @return ObjectError
	 */
	ObjectError getError();

	/**
	 * Tipo de mensaje de la excepci�n
	 * 
	 * @return nivel de error
	 */
	LevelEnum getLevel();
}