package gov.hhs.onc.phiz.web.test.soapui;

import gov.hhs.onc.phiz.context.PhizProperties;

public final class PhizSoapUiProperties {
    public final static String PREFIX = PhizProperties.PREFIX + "test.soapui.";
    public final static String SSL_PREFIX = PREFIX + "ssl.";

    public final static String SSL_PARAMS_NAME = SSL_PREFIX + "params";
    public final static String BAD_CIPHER_SUITES_SSL_PARAMS_VALUE = "bad.cipher.suites";
    public final static String BAD_PROTOCOL_VERSIONS_SSL_PARAMS_VALUE = "bad.protocol.versions";

    public final static String SSL_SOCKET_FACTORY_NAME = SSL_PREFIX + "socket.factory";
    public final static String UNTRUSTED_SSL_SOCKET_FACTORY_VALUE = "untrusted";

    private PhizSoapUiProperties() {
    }
}
