/*
 * 
 */
package es.ieci.tecdoc.fwktd.core.model;

import org.springframework.validation.ObjectError;

/**
 * Value Object para mensajes internacionalizables remotos
 * 
 * @author IECISA
 * 
 */
public class RemoteMessageVO extends Entity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -536019821844969362L;

	/**
	 * C�digo del mensaje.
	 */
	private String messageId;

	/**
	 * Par�metros del mensaje
	 */
	private String[] params;

	/**
	 * Mensaje por defecto.
	 */
	private String defaultMessage;

	/**
	 * Constructor por defecto.
	 */
	public RemoteMessageVO() {
		super();
	}

	/**
	 * Constructor a partir de <code> ObjectError </code>
	 * 
	 * @param error
	 *            Error
	 */
	public RemoteMessageVO(ObjectError error) {
		this(error.getCode(), (String[]) error.getArguments(), error
				.getDefaultMessage());
	}

	/**
	 * Constructor
	 * 
	 * @param messageId
	 *            c�digo del mensaje
	 * @param params
	 *            parametros
	 * @param defaultMessage
	 *            mensaje por defecto
	 */
	public RemoteMessageVO(String messageId, String[] params,
			String defaultMessage) {
		super();
		this.messageId = messageId;
		this.params = params;
		this.defaultMessage = defaultMessage;
	}

	/**
	 * Mensaje por defecto sin internacionalizar
	 * 
	 * @return mensaje por defecto.
	 */
	public String getDefaultMessage() {
		return defaultMessage;
	}

	/**
	 * Setter mensaje por defecto.
	 * 
	 * @param defaultMessage
	 */
	public void setDefaultMessage(String defaultMessage) {
		this.defaultMessage = defaultMessage;
	}

	/**
	 * C�digo del mensaje
	 * 
	 * @return codigo del mensaje
	 */
	public String getMessageId() {
		return messageId;
	}

	/**
	 * Setter c�digo del mensaje
	 * 
	 * @param messageId
	 *            c�digo del mensaje
	 */
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	/**
	 * Par�metros del mensaje
	 * 
	 * @return parametros
	 */
	public String[] getParams() {
		return params;
	}

	/**
	 * par�metros del mensaje
	 * 
	 * @param params
	 *            parametros
	 */
	public void setParams(String[] params) {
		this.params = params;
	}

}
