package it.luigibifulco.crypto.tsa.rfc3161.exceptions;

/**
 * 
 * @author Luigi Bifulco
 *
 */
@SuppressWarnings("serial")
public class DigestException extends RuntimeException {

	public DigestException(final String p_message, final Throwable p_throwable) {
		super(p_message, p_throwable);
	}

	public DigestException(final String p_message) {
		super(p_message);
	}

}
