package it.thomasjohansen.hello;

import org.apache.wss4j.common.ext.WSPasswordCallback;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;
import java.io.IOException;

/**
 * Created by thomas on 19/10/14.
 */
public class HelloClientCallbackHandler implements CallbackHandler {

    public void handle(Callback[] callbacks) throws IOException,
            UnsupportedCallbackException {
        for (int i = 0; i < callbacks.length; i++) {
            if (callbacks[i] instanceof WSPasswordCallback) {
                WSPasswordCallback pc = (WSPasswordCallback) callbacks[i];
                if (pc.getUsage() == WSPasswordCallback.DECRYPT ||
                        pc.getUsage() == WSPasswordCallback.SIGNATURE) {
                    // typically X.509 auth only
                    if ("hello-client".equals(pc.getIdentifier())) {
                        pc.setPassword("changeit");
                    }
                } else if (pc.getUsage() == WSPasswordCallback.USERNAME_TOKEN) {
                    // UsernameToken auth only
                    if ("alice".equals(pc.getIdentifier())) {
                        pc.setPassword("ecila");
                    }
                }
            }
        }
    }

}
