package org.jboss.as.mail.extension;

/**
 * @author Tomaz Cerar
 * @created 10.8.11 22:50
 */
public class MailSessionServer {
    private final String outgoingSocketBinding;
    private final Credentials credentials;
    private boolean sslEnabled = false;

    public MailSessionServer(final String outgoingSocketBinding, final Credentials credentials, boolean ssl) {
        this.outgoingSocketBinding = outgoingSocketBinding;
        this.credentials = credentials;
        this.sslEnabled = ssl;
    }

    public String getOutgoingSocketBinding() {
        return outgoingSocketBinding;
    }

    public Credentials getCredentials() {
        return credentials;
    }

    public boolean isSslEnabled() {
        return sslEnabled;
    }
}
