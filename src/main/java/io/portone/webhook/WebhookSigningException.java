package io.portone.webhook;

public class WebhookSigningException extends Exception {
	@java.io.Serial
    private static final long serialVersionUID = -3387516993124229948L;
	public WebhookSigningException(final String message) {
		super(message);
	}
}
