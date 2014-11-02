import org.apache.wss4j.common.crypto.Crypto;
import org.apache.wss4j.common.crypto.CryptoType;
import org.apache.wss4j.common.crypto.Merlin;
import org.apache.wss4j.common.ext.WSSecurityException;
import org.junit.Ignore;
import org.junit.Test;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import static org.junit.Assert.assertNotNull;

/**
 * Created by thomas on 18/10/14.
 */
public class CryptoTest {

    @Test
    @Ignore
    public void test() throws WSSecurityException, IOException {
        Merlin crypto = new Merlin();
        Properties p = new Properties();
        p.load(new FileReader("/Users/thomas/src/saml-demo/hello-client/src/main/resources/crypto.properties"));
        crypto.loadProperties(p, null, null);
        assertNotNull(crypto.getX509Certificates(new CryptoType(CryptoType.TYPE.ALIAS)));
    }
}
