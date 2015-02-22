/*
 * 
 */
package es.ieci.tecdoc.fwktd.core.exception;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.NoSuchMessageException;
import org.springframework.util.Assert;
import org.springframework.validation.ObjectError;

import es.ieci.tecdoc.fwktd.core.services.messages.MessagesService;

/**
 * Excepci�n que contiene varios errores de validaci�n contenidos. Se usa para
 * ser lanzada en procesos de validaci�n que pueden suponer el incumplimiento de
 * m�s de un requisito. Al llevar la lista de errores embebida permite lanzar
 * una �nica excepci�n con todos los errores de validaci�n que se hayan
 * producido.
 * 
 * @author IECISA
 * 
 */
public class ValidationException extends FrameworkException {

	/**
	 * 
	 * @param msg
	 *            mensaje informativo, sugerencia o cualquier otro tipo de
	 *            informaci�n auxiliar que ir� asociada a la excepci�n
	 * @param errors
	 *            colecci�n de errores de tipo <code>ObjectError</code>
	 */
	public ValidationException(String msg, List<ObjectError> errors) {
		super(msg);
		Assert.notNull(errors);
		this.errors = errors;
	}

	/**
	 * Devuelve todos los errores contenidos en la excepci�n
	 * 
	 * @return todos los errores contenidos en la excepci�n
	 */
	public List<ObjectError> getErrors() {
		return errors;
	}

	/**
	 * Internacionaliza a trav�s del {@link MessagesService} los errores
	 * producidos.
	 * 
	 * @return Array de mensajes de error internacionalizados
	 */
	public String[] getLocalizedMessages() {

		String[] messages = new String[errors.size()];
		MessagesService messagesService = MessagesService.getInstance();
		int pos = 0;

		for (Iterator<ObjectError> iter = errors.iterator(); iter.hasNext();) {
			ObjectError error = (ObjectError) iter.next();
			try {
				messages[pos] = messagesService.getMessage(error.getCode(),
						error.getArguments(), error.getDefaultMessage());
			} catch (NoSuchMessageException noMessageEx) {
				messages[pos] = noMessageEx.getMessage();
			}
			pos++;
		}
		return messages;
	}

	// Members

	private static final long serialVersionUID = -7486960559537763858L;

	protected List<ObjectError> errors;
}
